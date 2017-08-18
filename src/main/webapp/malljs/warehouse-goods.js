/**
 * Created by yao on 2017/7/26.
 */
$(function () {
    var date = new Date().format("yyyy-MM-dd");
    //给时间赋值
    $('#satrtTime').val(date);
    $('#endTime').val(date);
    //表格数据
    $('#houseGoodsGrid').datagrid({
        url: path + '/goods/warehouse/getAll',
        striped:true,
        title:"仓库商品列表",
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
        toolbar:"#houseGoodsGridToolsBar"
    });
    //刷新
    $('#reloadGrid').click(function () {
        $("#goodsCode").val('');
        $("#goodsName").val('');
        $("#satrtTime").val(new Date().format("yyyy-MM-dd"));
        $("#endTime").val(new Date().format("yyyy-MM-dd"));
        $('#houseGoodsGrid').datagrid('reload',{
            goodsCode:'',
            goodsName:'',
            startTime:'',
            endTime:''
        });
    });
    //查询
    $('#search').click(function () {
        $('#houseGoodsGrid').datagrid('load',{
            goodsCode:$.trim($("#goodsCode").val()),
            goodsName:$.trim($("#goodsName").val()),
            startTime:$.trim($("#satrtTime").val()),
            endTime:$.trim($("#endTime").val())
        });
    });
});