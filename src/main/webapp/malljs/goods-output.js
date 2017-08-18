/**
 * Created by yao on 2017/7/26.
 */
$(function () {
    var date = new Date().format("yyyy-MM-dd");
    //给时间赋值
    $('#satrtTime').val(date);
    $('#endTime').val(date);
    //表格数据
    $('#goodsOutputGrid').datagrid({
        url:'',
        striped:true,
        title:"商品出库列表",
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
            {field:'belongWarehouse',title:'所属仓库',width:100,halign:"center",align:"center"},
            {field:'makeUser',title:'制单人',width:100,halign:"center",align:"center"},
            {field:'contractWay',title:'联系方式',width:100,halign:"center",align:"center"},
            {field:'outputTime',title:'出库时间',width:200,halign:"center",align:"center",
                formatter:function(value, row, index){
                    return moment(value).format("YYYY-MM-DD HH:mm:ss");
                }
            },
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
                    var a = '<a title="出库" class="btn btn-success" href="#"><i class="halflings-icon white zoom-in"></i></a>&nbsp;';
                    var b = '<a title="详情" class="btn btn-info" href="#"><i class="halflings-icon white edit"></i></a>&nbsp;';
                    return a + b;
                }
            }
        ]],
        toolbar:"#goodsOutputGridToolsBar"
    });
    //保存
    $('#saveObj').click(function () {
        // var obj = $('#addUserForm').serialize();
        var obj = {
            id:$('#id').val(),
            realName:$('#realName').val(),
            IDCard:$('#IDCard').val(),
            userName:$('#userName').val(),
            age:$('#age').val(),
            gender:$('#gender').val(),
            phoneNum:$('#phoneNum').val(),
            address:$('#address').val(),
            roleCode:$('#roleCode').val(),
            state:$('#state').val()
        };
        var p = JSON.stringify(obj);
        $.ajax({
            type: "POST",
            url: path + "/user/addAndUpdate",
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