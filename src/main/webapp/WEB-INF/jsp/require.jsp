<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
	String path=request.getContextPath();
%>
<!DOCTYPE html>
<html lang="en">
<head>
	<!-- start: Meta -->
	<meta charset="utf-8">
	<title>Bootstrap Metro Dashboard by Dennis Ji for ARM demo</title>
	<meta name="description" content="Bootstrap Metro Dashboard">
	<meta name="author" content="Dennis Ji">
	<meta name="keyword" content="Metro, Metro UI, Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">
	<!-- end: Meta -->

	<!-- start: Mobile Specific -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- end: Mobile Specific -->

	<!-- start: CSS -->
	<link id="bootstrap-style" href="<%=path%>/css/bootstrap.min.css" rel="stylesheet">
	<link href="<%=path%>/css/bootstrap-responsive.min.css" rel="stylesheet">
	<link id="base-style" href="<%=path%>/css/style.css" rel="stylesheet">
	<link id="base-style-responsive" href="<%=path%>/css/style-responsive.css" rel="stylesheet">
	<link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800&subset=latin,cyrillic-ext,latin-ext' rel='stylesheet' type='text/css'>
	<link rel="stylesheet" href="<%=path%>/js/jquery-easyui-1.5/themes/bootstrap/linkbutton.css" type="text/css" />
	<link rel="stylesheet" href="<%=path%>/js/jquery-easyui-1.5/themes/bootstrap/datagrid.css" type="text/css" />
	<link rel="stylesheet" href="<%=path%>/js/jquery-easyui-1.5/themes/bootstrap/tree.css" type="text/css" />
	<link rel="stylesheet" href="<%=path%>/js/jquery-easyui-1.5/themes/bootstrap/pagination.css" type="text/css" />
	<link rel="stylesheet" href="<%=path%>/js/jquery-easyui-1.5/themes/icon.css" type="text/css" />
	<link rel="stylesheet" href="<%=path%>/js/jquery-easyui-1.5/themes/bootstrap/layout.css" type="text/css" />
	<link rel="stylesheet" href="<%=path%>/js/jquery-easyui-1.5/themes/bootstrap/easyui.css" type="text/css" />
	<!-- end: CSS -->


	<!-- The HTML5 shim, for IE6-8 support of HTML5 elements -->
	<!--[if lt IE 9]>
	<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
	<link id="ie-style" href="<%=path%>/css/ie.css" rel="stylesheet">
	<![endif]-->

	<!--[if IE 9]>
	<link id="ie9style" href="<%=path%>/css/ie9.css" rel="stylesheet">
	<![endif]-->

	<!-- start: Favicon -->
	<link rel="shortcut icon" href="<%=path%>/img/favicon.ico">
	<!-- end: Favicon -->




</head>

<body>
<ul class="breadcrumb" style="margin: 0px;">
	<li>
		<i class="icon-home"></i>
		<a href="<%=path%>/page/to/main">首页</a>
		<i class="icon-angle-right"></i>
	</li>
	<li><a href="#">要货管理</a></li>
</ul>
<div class="row-fluid">
	<div style="height: 755px;width: 100%;">
		<table id="requireGrid" ></table>
	</div>
	<!-- 工具条Div -->
	<div id="requireGridToolsBar" style="padding: 10px; height: 20px;">
		<div class="span12">
			<span>状态：</span>
			<select id="selectState" style="width: 100px;">
				<option value="0">全部</option>
				<option value="1">待分发</option>
				<option value="2">已分发</option>
				<option value="3">已完成</option>
			</select>
			<span>便利店名: <input type="text" aria-controls="DataTables_Table_0"></span>
			<a href="#" style="margin-bottom: 7px;" id="search" class="easyui-linkbutton" iconCls="icon-search" plain="true">查询</a>
			<a href="#" style="margin-bottom: 7px;" id="reloadGrid" class="easyui-linkbutton" iconCls="icon-reload" plain="true">刷新</a>
	</div>
</div>

<div class="modal hide fade" id="myModal" style="width: 1000px;margin-left: -465px;">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal">×</button>
		<h3>XXXX</h3>
	</div>
	<div class="modal-body">
		<div class="box-content">
			<form class="form-horizontal" id="addUserForm">
				<fieldset>
					<div class="control-group">
						<label class="control-label" for="realName">真实姓名</label>
						<div class="controls">
							<input class="input-xlarge focused" id="realName" name="realName" type="text">
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for="IDCard">身份证号</label>
						<div class="controls">
							<input class="input-xlarge focused" id="IDCard" name="IDCard" type="text">
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for="userName">用户名</label>
						<div class="controls">
							<input class="input-xlarge focused" id="userName" name="userName" type="text">
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for="age">年龄</label>
						<div class="controls">
							<input class="input-xlarge focused" id="age" name="age" type="text">
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for="gender">性别</label>
						<div class="controls">
							<select id="gender" name="gender">
								<option value="0">男</option>
								<option value="1">女</option>
							</select>
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for="phoneNum">联系电话</label>
						<div class="controls">
							<input class="input-xlarge focused" id="phoneNum" name="phoneNum" type="text">
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for="address">联系地址</label>
						<div class="controls">
							<input class="input-xlarge focused" id="address" name="address" type="text">
						</div>
					</div>
					<div class="control-group">
						<div class="controls">
							<input class="input-xlarge focused" id="id" name="id" type="hidden">
							<input class="input-xlarge focused" id="roleCode" name="roleCode" type="hidden">
							<input class="input-xlarge focused" id="state" name="state" type="hidden" value="0">
						</div>
					</div>
					<%--<div class="form-actions">--%>
					<%--<button type="submit" class="btn btn-primary">Save changes</button>--%>
					<%--<button class="btn">Cancel</button>--%>
					<%--</div>--%>
				</fieldset>
			</form>
		</div>
	</div>
	<div class="modal-footer">
		<button class="btn btn-danger" data-dismiss="modal">关闭</button>
		<button id="saveObj" class="btn btn-success" >保存</button>
	</div>
</div>

<!-- start: JavaScript-->
<script src="<%=path%>/js/jquery-1.12.4/jquery.min.js"></script>
<script src="<%=path%>/js/jquery-1.9.1.min.js"></script>
<script src="<%=path%>/js/jquery-migrate-1.0.0.min.js"></script>

<script src="<%=path%>/js/jquery-ui-1.10.0.custom.min.js"></script>

<script src="<%=path%>/js/jquery.ui.touch-punch.js"></script>

<script src="<%=path%>/js/modernizr.js"></script>

<script src="<%=path%>/js/bootstrap.min.js"></script>

<script src="<%=path%>/js/jquery.cookie.js"></script>

<script src='<%=path%>/js/fullcalendar.min.js'></script>

<script src='<%=path%>/js/jquery.dataTables.min.js'></script>

<script src="<%=path%>/js/excanvas.js"></script>
<script src="<%=path%>/js/jquery.flot.js"></script>
<script src="<%=path%>/js/jquery.flot.pie.js"></script>
<script src="<%=path%>/js/jquery.flot.stack.js"></script>
<script src="<%=path%>/js/jquery.flot.resize.min.js"></script>

<script src="<%=path%>/js/jquery.chosen.min.js"></script>

<script src="<%=path%>/js/jquery.uniform.min.js"></script>

<script src="<%=path%>/js/jquery.cleditor.min.js"></script>

<script src="<%=path%>/js/jquery.noty.js"></script>

<script src="<%=path%>/js/jquery.elfinder.min.js"></script>

<script src="<%=path%>/js/jquery.raty.min.js"></script>

<script src="<%=path%>/js/jquery.iphone.toggle.js"></script>

<script src="<%=path%>/js/jquery.uploadify-3.1.min.js"></script>

<script src="<%=path%>/js/jquery.gritter.min.js"></script>

<script src="<%=path%>/js/jquery.imagesloaded.js"></script>

<script src="<%=path%>/js/jquery.masonry.min.js"></script>

<script src="<%=path%>/js/jquery.knob.modified.js"></script>

<script src="<%=path%>/js/jquery.sparkline.min.js"></script>

<script src="<%=path%>/js/counter.js"></script>

<script src="<%=path%>/js/retina.js"></script>

<script src="<%=path%>/js/custom.js"></script>

<script src="<%=path%>/malljs/utils.js"></script>

<script src="<%=path%>/js/jquery-easyui-1.5/jquery.easyui.min.js"></script>
<script src="<%=path%>/js/jquery-easyui-1.5/locale/easyui-lang-zh_CN.js"></script>
<script src="<%=path%>/js/moment/moment-with-locales.js"></script>
<script>
    var path = '<%=path%>';
</script>

<script src="<%=path%>/malljs/require.js"></script>
<script>
    $(window.parent.document).find("iframe").prop("height",$("body").height());
</script>
<!-- end: JavaScript-->

</body>
</html>
