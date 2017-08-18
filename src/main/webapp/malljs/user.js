/**
 * Created by yao on 2017/7/26.
 */
$(function () {
    //表格数据
    $('#userGrid').datagrid({
        url:path + '/user/getAll',
        striped:true,
        title:"用户列表",
        rownumbers:true,
        pagination:true,
        pageSize:20,
        pageList:[10,20,40,80,100],
        pageNumber:1,
        fit:true,
        fitColumns:false,
        singleSelect:true,
        columns:[[
            {field:'id',checkbox:true},
            {field:'realName',title:'姓名',width:100,halign:"center",align:"center"},
            {field:'userName',title:'用户名',width:200,halign:"center",align:"center"},
            {field:'roleCode',title:'角色',width:200,halign:"center",align:"center"},
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
        toolbar:"#userGridToolsBar"
    });
    //保存
    $('#saveObj').click(function () {
        var userId = $('#id').val();

        var roleArr = $('#roleCode').val();
        var roleStr = '';
        if (roleArr.length>0) {
            for (var i=0; i<roleArr.length; i++) {
                roleStr += roleArr[i] + ',';
            }
        }
        if (roleStr) {
            roleStr = roleStr.substring(0,roleStr.length-1);
        }
        var obj = {
            id:$('#id').val(),
            realName:$('#realName').val(),
            idCard:$('#idCard').val(),
            userName:$('#userName').val(),
            age:$('#age').val(),
            gender:$('#gender').val(),
            phoneNum:$('#phoneNum').val(),
            address:$('#address').val(),
            roleCode:roleStr,
            state:$('#state').val(),
            createTime:$('#createTime').val(),
            createUser:$('#createUser').val(),
            updateTime:$('#updateTime').val(),
            updateUser:$('#updateUser').val(),
            loginTime:$('#loginTime').val()
        };
        var p = JSON.stringify(obj);

        if (!userId) {//id为空就添加
            $.ajax({
                type: "POST",
                url: path + "/user/add",
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
                        $('#userGrid').datagrid('reload');
                    } else {
                        $.messager.alert("提示！","未知错误，请重试！","warning");
                    }
                }
            });
        } else {//id不为空就更新
            $.ajax({
                type: "POST",
                url: path + "/user/update",
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
                        $('#userGrid').datagrid('reload');
                    } else {
                        $.messager.alert("提示！","未知错误，请重试！","warning");
                    }
                }
            });
        }


        //关闭modal
        // $('#saveObj').prop('data-dismiss', 'modal');
    });
    //刷新
    $('#reloadGrid').click(function () {
        $("#searchUserName").val('');
        $('#userGrid').datagrid('reload',{
            userName:''
        });
    });
    //查询
    $('#search').click(function () {
        $('#userGrid').datagrid('load',{
            userName:$.trim($("#searchUserName").val())
        });
    });
});
//添加
var addOne = function () {
    //获取所有角色
    // debugger;
    // $.ajax({
    //     type: "GET",
    //     url: path + "/role/findAll",
    //     async:false,
    //     success:function(data){
    //         if (data.flag=="success") {
    //             var roles = data.roles;
    //             var html = '';
    //             if (roles != null) {
    //                 for (var i=0; i<roles.length; i++) {
    //                     html += '<option value="'+ roles[i].id +'">' + roles[i].name + '</option>'
    //                 }
    //             }
    //             $('#roleCode').empty().append(html);
    //         } else {
    //             $.messager.alert("提示！","未知错误，请重试！","warning");
    //         }
    //     }
    // });
    $('#realName').val("");
    $('#idCard').val("");
    $('#userName').val("");
    $('#age').val("");
    $('#gender').val("");
    $('#phoneNum').val("");
    $('#address').val("");
    $('#id').val("");
    $('#state').val("");
    $('#roleCode').val("");
    $('#createTime').val("");
    $('#createUser').val("");
    $('#updateTime').val("");
    $('#loginTime').val("");
    $('#updateUser').val("");

    $('#myModal').modal('show');
};

//编辑
var editOne = function (index) {
    var chuUser = $('#userGrid').datagrid('getRows')[index];
    $('#realName').val(chuUser.realName);
    $('#idCard').val(chuUser.idCard);
    $('#userName').val(chuUser.userName);
    $('#age').val(chuUser.age);
    $('#gender').val(chuUser.gender);
    $('#phoneNum').val(chuUser.phoneNum);
    $('#address').val(chuUser.address);
    $('#id').val(chuUser.id);
    $('#state').val(chuUser.state);
    $('#roleCode').val(chuUser.roleCode);
    $('#createTime').val(chuUser.createTime);
    $('#createUser').val(chuUser.createUser);
    $('#updateTime').val(chuUser.updateTime);
    $('#loginTime').val(chuUser.loginTime);
    $('#updateUser').val(chuUser.updateUser);

    $('#myModal').modal('show');
};
//删除
var deleteOne = function (index) {
    var chuUser = $('#userGrid').datagrid('getRows')[index];
    var id = chuUser.id;
    if(confirm('确定删除吗？')){
        $.ajax({
            type: "GET",
            url: path + "/user/delete/" + id,
            contentType:'application/json;charset=UTF-8',
            success:function(data){
                if (data.flag=="success") {
                    $.messager.alert("提示！","删除成功！","info",function(){
                        // $('#userList').datagrid('reload');
                    });
                    $('#userGrid').datagrid('reload');
                } else {
                    $.messager.alert("提示！","未知错误，请重试！","warning");
                }
            }
        });
    }
};