/**
 * Created by yao on 2017/7/26.
 */
$(function () {
    //表格数据
    $('#classifyGrid').datagrid({
        url:'',
        striped:true,
        title:"分类列表",
        rownumbers:true,
        pagination:true,
        pageSize:20,
        pageList:[10,20,40,80,100],
        pageNumber:1,
        fit:true,
        fitColumns:false,
        columns:[[
            {field:'id',checkbox:true},
            {field:'classifyCode',title:'分类编码',width:100,halign:"center",align:"center"},
            {field:'name',title:'分类名称',width:100,halign:"center",align:"center"},
            {field:'level',title:'级别',width:100,halign:"center",align:"center"},
            {field:'sort',title:'排序',width:100,halign:"center",align:"center"},
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
                    var a = '<a title="新建" class="btn btn-success" href="#"><i class="halflings-icon white zoom-in"></i></a>&nbsp;';
                    var b = '<a title="编辑" class="btn btn-info" href="#"><i class="halflings-icon white edit"></i></a>&nbsp;';
                    var c = '<a title="删除" class="btn btn-danger" href="#"><i class="halflings-icon white trash"></i></a>&nbsp;';
                    return a + b + c;
                }
            }
        ]],
        toolbar:"#classifyGridToolsBar"
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