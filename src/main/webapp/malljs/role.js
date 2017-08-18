/**
 * Created by yao on 2017/7/26.
 */
$(function () {
    //表格数据
    $('#roleGrid').datagrid({
        url:path + '/role/getAll',
        striped:true,
        title:"角色列表",
        rownumbers:true,
        pagination:true,
        pageSize:20,
        pageList:[10,20,40,80,100],
        pageNumber:1,
        fit:true,
        fitColumns:true,
        singleSelect:true,
        columns:[[
            {field:'id',checkbox:true},
            {field:'name',title:'角色名称',width:100,halign:"center",align:"center"},
            {field:'code',title:'角色编码',width:100,halign:"center",align:"center"},
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
                    var b = '<a title="编辑" class="btn btn-info" id="editOne" onclick="editOne('+ index +')"><i class="halflings-icon white edit"></i></a>&nbsp;';
                    var c = '<a title="删除" class="btn btn-danger" id="deleteOne" onclick="deleteOne('+ index +')"><i class="halflings-icon white trash"></i></a>&nbsp;';
                    return b + c;
                }
            }
        ]],
        toolbar:"#roleGridToolsBar"
    });
    //保存
    $('#saveObj').click(function () {
        var roleId = $('#roleId').val();
        var loginuser = window.parent.document.getElementById('loginUser').innerHTML;
        var obj = {
            id:roleId,
            name:$('#name').val(),
            code:$('#code').val(),
            createTime:$('#createTime').val(),
            createUser:loginuser,
            updateTime:$('#updateTime').val(),
            updateUser:loginuser
        };
        var p = JSON.stringify(obj);
        if (!roleId) {//id为空就添加
            $.ajax({
                type: "POST",
                url: path + "/role/add",
                data:p,
                beforeSend:function(){
                    $.messager.progress({text:"正在保存中..."});
                },
                contentType:'application/json;charset=UTF-8',
                success:function(data){
                    $.messager.progress('close');
                    if (data.flag=="success") {
                        $.messager.alert("提示！","保存成功！","info",function(){
                            // $('#userList').datagrid('reload');
                        });
                        $('#roleGrid').datagrid('reload');
                    } else {
                        $.messager.alert("提示！","未知错误，请重试！","warning");
                    }
                }
            });
        } else {//id不为空就更新
            $.ajax({
                type: "POST",
                url: path + "/role/update",
                data:p,
                beforeSend:function(){
                    $.messager.progress({text:"正在保存中..."});
                },
                contentType:'application/json;charset=UTF-8',
                success:function(data){
                    $.messager.progress('close');
                    if (data.flag=="success") {
                        $.messager.alert("提示！","保存成功！","info",function(){
                            // $('#userList').datagrid('reload');
                        });
                        $('#roleGrid').datagrid('reload');
                    } else {
                        $.messager.alert("提示！","未知错误，请重试！","warning");
                    }
                }
            });
        }
    });
    //刷新
    $('#reloadGrid').click(function () {
        $("#searchRoleName").val('');
        $('#roleGrid').datagrid('reload',{
            name:''
        });
    });
    //查询
    $('#search').click(function () {
        $('#roleGrid').datagrid('load',{
            name:$.trim($("#searchRoleName").val())
        });
    });
});
//添加
var addOne = function () {
    $('#roleId').val("");
    $('#name').val("");
    $('#code').val("");
    $('#createTime').val("");
    $('#createUser').val("");
    $('#updateTime').val("");
    $('#updateUser').val("");

    $('#myModal').modal('show');
};
//编辑
var editOne = function (index) {
    var role = $('#roleGrid').datagrid('getRows')[index];
    $('#roleId').val(role.id);
    $('#name').val(role.name);
    $('#code').val(role.code);
    $('#createTime').val(role.createTime);
    $('#createUser').val(role.createUser);
    $('#updateTime').val(role.updateTime);
    $('#updateUser').val(role.updateUser);

    $('#myModal').modal('show');
};
//删除
var deleteOne = function (index) {
    var role = $('#roleGrid').datagrid('getRows')[index];
    var id = role.id;
    if(confirm('确定删除吗？')){
        $.ajax({
            type: "GET",
            url: path + "/role/delete/" + id,
            contentType:'application/json;charset=UTF-8',
            success:function(data){
                if (data.flag=="success") {
                    $.messager.alert("提示！","删除成功！","info",function(){
                        // $('#userList').datagrid('reload');
                    });
                    $('#roleGrid').datagrid('reload');
                } else {
                    $.messager.alert("提示！","未知错误，请重试！","warning");
                }
            }
        });
    }
};