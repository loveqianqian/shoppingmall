/**
 * Created by yao on 2017/7/26.
 */
$(function () {
    var date = new Date().format("yyyy-MM-dd");
    //给时间赋值
    $('#satrtTime').val(date);
    $('#endTime').val(date);
    //表格数据
    $('#shopGoodsGrid').datagrid({
        url:path + '/goods/shop/getAll',
        striped:true,
        title:"便利店商品列表",
        rownumbers:true,
        pagination:true,
        pageSize:20,
        pageList:[10,20,40,80,100],
        pageNumber:1,
        fit:true,
        fitColumns:false,
        columns:[[
            {field:'id',checkbox:true},
            {field:'goodsCode',title:'商品编码',width:100,halign:"center",align:"center"},
            {field:'goodsName',title:'商品名称',width:100,halign:"center",align:"center"},
            {field:'goodsScale',title:'商品规格',width:100,halign:"center",align:"center"},
            {field:'unit',title:'单位',width:100,halign:"center",align:"center"},
            {field:'sellPrice',title:'市场价',width:100,halign:"center",align:"center"},
            {field:'stock',title:'库存',width:100,halign:"center",align:"center"},
            {field:'limitStock',title:'预警库存',width:100,halign:"center",align:"center"},
            {field:'createTime',title:'创建时间',width:200,halign:"center",align:"center",
                formatter:function(value, row, index){
                    return moment(value).format("YYYY-MM-DD HH:mm:ss");
                }
            },
            {field:'createUser',title:'创建人',width:200,halign:"center",align:"center"},
            {field:'updateTime',title:'修改时间',width:200,halign:"center",align:"center",
                formatter:function(value, row, index){
                    return moment(value).format("YYYY-MM-DD HH:mm:ss");
                }
            },
            {field:'updateUser',title:'修改人',width:200,halign:"center",align:"center"},
            {field:'operator',title:'操作',width:200,halign:"center",align:"center",
                formatter:function(value, row, index){
                    var a = '<a title="查看" class="btn btn-success" href="#"><i class="halflings-icon white zoom-in"></i></a>&nbsp;';
                    var b = '<a title="编辑" class="btn btn-info" href="#"><i class="halflings-icon white edit"></i></a>&nbsp;';
                    var c = '<a title="删除" class="btn btn-danger" href="#"><i class="halflings-icon white trash"></i></a>&nbsp;';
                    return a + b + c;
                }
            }
        ]],
        toolbar:"#shopGoodsGridToolsBar"
    });
    //保存订单商品
    $('#saveObj').click(function () {
        var addGoods =  $('#addGoodsGrid').datagrid('getSelections');
        var loginuser = window.parent.document.getElementById('loginUser').innerHTML;
        if (addGoods.length > 0) {
            var addCounts = [];
            for (var i=0; i<addGoods.length; i++) {
                var index = $('#addGoodsGrid').datagrid('getRowIndex', addGoods[i]);
                var countId = 'addCount' + index;
                var count = $('#' + countId).val();
                addCounts.push(count);
            }
            var orderCode = Math.random().toString(36).substr(2).toUpperCase();
            var shopName = $('#shopName').val();
            var address = $('#address').val();
            var contactWay = $('#contactWay').val();
            var contactUser = $('#contactUser').val();

            var obj = {
                shopName:shopName,
                address:address,
                contactWay:contactWay,
                contactUser:contactUser,
                shopGoodsList:addGoods,
                addCounts:addCounts,
                state: '0',
                orderCode:orderCode,
                createUser:loginuser,
                updateUser:loginuser
            };
            var dto = JSON.stringify(obj);
            $.ajax({
                type: "POST",
                url: path + "/require/addBatch",
                data:dto,
                contentType:'application/json;charset=UTF-8',
                success:function(data){
                    if (data.flag=="success") {
                        $.messager.alert("提示！","保存成功！","info",function(){
                        });
                        $('#shopGoodsGrid').datagrid('reload');
                    } else {
                        $.messager.alert("提示！","未知错误，请重试！","warning");
                    }
                }
            });
        } else {
            alert("请至少选择一条数据");
            return;
        }

    });
    //查询
    $('#search').click(function () {
        $('#shopGoodsGrid').datagrid('load',{
            goodsCode:$.trim($("#goodsCode").val()),
            goodsName:$.trim($("#goodsName").val()),
            startTime:$.trim($("#satrtTime").val()),
            endTime:$.trim($("#endTime").val())
        });
    });
    //刷新
    $('#reloadGrid').click(function () {
        $("#goodsCode").val('');
        $("#goodsName").val('');
        $("#satrtTime").val(new Date().format("yyyy-MM-dd"));
        $("#endTime").val(new Date().format("yyyy-MM-dd"));
        $('#shopGoodsGrid').datagrid('reload',{
            goodsCode:'',
            goodsName:'',
            startTime:'',
            endTime:''
        });
    });
    //补货
    $('#addGoods').click(function () {
        //表格数据
        $('#addGoodsGrid').datagrid({
            url: path + '/goods/warehouse/getAll',
            striped:true,
            rownumbers:true,
            pagination:true,
            pageSize:20,
            pageList:[10,20,40,80,100],
            pageNumber:1,
            fit:true,
            fitColumns:true,
            columns:[[
                {field:'id',checkbox:true},
                {field:'goodsCode',title:'商品编码',width:100,halign:"center",align:"center"},
                {field:'goodsName',title:'商品名称',width:100,halign:"center",align:"center"},
                {field:'goodsScale',title:'商品规格',width:100,halign:"center",align:"center"},
                {field:'unit',title:'单位',width:100,halign:"center",align:"center"},
                {field:'sellPrice',title:'市场价',width:100,halign:"center",align:"center"},
                {field:'stock',title:'库存',width:100,halign:"center",align:"center"},
                {field:'operator',title:'补货量',width:200,halign:"center",align:"center",
                    formatter:function(value, row, index){
                        var a = '<input type="number" style="width: 90px;background: yellow;margin-top: 8px;" name="addCount" id="addCount'+ index +'" value="0" min="0" max="' + row.stock + '" />&nbsp;';
                        return a;
                    }
                }
            ]],
            toolbar:"#addGoodsGridToolsBar",
            onLoadSuccess:function () {
                $('.box-content .easyui-fluid').css('width', '100%');
                $('.box-content .easyui-fluid .panel-body').css('width', '98%');
                $('#myModal').modal('show');
            }
        });
    });
});
