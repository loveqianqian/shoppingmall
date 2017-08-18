/**
 * Created by yao on 2017/7/26.
 */
$(function () {
    var date = new Date().format("yyyy-MM-dd");
    //给时间赋值
    $('#startTime').val(date);
    $('#endTime').val(date);
    //表格数据
    $('#orderGrid').datagrid({
        url: '',
        striped:true,
        title:"订单列表",
        rownumbers:true,
        pagination:true,
        pageSize:20,
        pageList:[10,20,40,80,100],
        pageNumber:1,
        fit:true,
        fitColumns:false,
        columns:[[
            {field:'id',checkbox:true},
            {field:'orderCode',title:'订单号',width:100,halign:"center",align:"center"},
            {field:'goodsName',title:'商品名称',width:200,halign:"center",align:"center"},
            {field:'goodsCount',title:'商品数量',width:200,halign:"center",align:"center"},
            {field:'shopName',title:'便利店名',width:200,halign:"center",align:"center"},
            {field:'address',title:'发货地址',width:200,halign:"center",align:"center"},
            {field:'contacts',title:'联系人',width:100,halign:"center",align:"center"},
            {field:'moneyCount',title:'金额',width:100,halign:"center",align:"center"},
            {field:'state',title:'状态',width:100,halign:"center",align:"center"},
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
                    var a = '<a title="发货" class="btn btn-success" href="#"><i class="halflings-icon white zoom-in"></i></a>&nbsp;';
                    var b = '<a title="编辑" class="btn btn-info" href="#"><i class="halflings-icon white edit"></i></a>&nbsp;';
                    var c = '<a title="删除" class="btn btn-danger" href="#"><i class="halflings-icon white trash"></i></a>&nbsp;';
                    return a + b + c;
                }
            }
        ]],
        toolbar:"#orderGridToolsBar"
    });
    //保存
    $('#saveObj').click(function () {
        // var obj = $('#addUserForm').serialize();
        var obj = {
        };
        var p = JSON.stringify(obj);
        $.ajax({
            type: "POST",
            url: '',
            data:p,
            beforeSend:function(){
                $.messager.progress({text:"正在保存中..."});
            },
            contentType:'application/json;charset=UTF-8',
            success:function(data){
                $.messager.progress('close');
                if (data.flag=="success") {
                    $.messager.alert("提示！","保存成功！","info",function(){
                        $('#userList').datagrid('reload');
                    });
                } else {
                    $.messager.alert("提示！","未知错误，请重试！","warning");
                }
            }
        });
    });
    //查询
    $('#search').click(function () {
        $('#orderGrid').datagrid('load',{
            code:$.trim($("#searchValue").val()),
            shopName:$.trim($("#searchValue").val()),
            state:$.trim($("#selectState").val()),
        });
    });
    //刷新
    $('#reloadGrid').click(function () {
        $("#searchUserName").val('');
        $('#orderGrid').datagrid('reload',{
            userName:''
        });
    });
});
