/**
 * Created by yao on 2017/7/26.
 */
$(function () {
    var date = new Date().format("yyyy-MM-dd");
    //给时间赋值
    $('#satrtTime').val(date);
    $('#endTime').val(date);
    //表格数据
    $('#financeGrid').datagrid({
        url: '',
        striped:true,
        title:"财务列表",
        rownumbers:true,
        pagination:true,
        pageSize:20,
        pageList:[10,20,40,80,100],
        pageNumber:1,
        fit:true,
        fitColumns:false,
        columns:[[
            {field:'id',checkbox:true},
            {field:'shopId',title:'店铺ID',width:100,halign:"center",align:"center"},
            {field:'shopName',title:'店铺名',width:200,halign:"center",align:"center"},
            {field:'goodsCount',title:'商品数量',width:200,halign:"center",align:"center"},
            {field:'importFee',title:'进货总额',width:200,halign:"center",align:"center"},
            {field:'sellFee',title:'销售总额',width:200,halign:"center",align:"center"},
            {field:'profit',title:'利润',width:100,halign:"center",align:"center"},
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
        ]],
        toolbar:"#financeGridToolsBar"
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
});