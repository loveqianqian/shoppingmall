<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
	String path=request.getContextPath();
%>
<!DOCTYPE html>
<html lang="en">
<head>
	<!-- start: Meta -->
	<meta charset="utf-8">
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
		<a id="backIndex" href="<%=path%>/page/to/main">首页</a>
		<i class="icon-angle-right"></i>
	</li>
	<li><a href="#">便利店商品列表</a></li>
</ul>
<div class="row-fluid">
	<div style="height: 755px;width: 100%;">
		<table id="shopGoodsGrid" ></table>
	</div>
	<!-- 工具条Div -->
	<div id="shopGoodsGridToolsBar" style="padding: 10px; height: 20px;">
		<div class="span2" style="margin-bottom: 0px; float: left;">
			<a id="addGoods" data-toggle="modal" class="easyui-linkbutton" iconCls="icon-add" plain="true">补货</a>
		</div>
		<div class="span10">
			<div class="controls" style="float: left;">
				<span>开始时间:</span>
				<input type="date" style="width: 130px;" id="satrtTime" value=""/>
				<span>结束时间:</span>
				<input type="date" style="width: 130px;" id="endTime" value=""/>
			</div>
			<span>商品编码: <input type="text" style="width: 150px;" id="goodsCode" aria-controls="DataTables_Table_0"></span>
			<span>商品名称: <input type="text" style="width: 150px;" id="goodsName" aria-controls="DataTables_Table_0"></span>
			<a href="#" style="margin-bottom: 7px;" id="search" class="easyui-linkbutton" iconCls="icon-search" plain="true">查询</a>
			<a href="#" style="margin-bottom: 7px;" id="reloadGrid" class="easyui-linkbutton" iconCls="icon-reload" plain="true">刷新</a>
		</div>
	</div>
</div>

<div class="modal hide fade" id="myModal" style="width: 1000px;margin-left: -465px;">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal">×</button>
		<h3>商店补货</h3>
	</div>
	<div class="modal-body">
		<div class="box-content">
			<div style="height: 555px;width: 100%;">
				<table id="addGoodsGrid" ></table>
			</div>
			<!-- 工具条Div -->
			<div id="addGoodsGridToolsBar" style="padding: 10px; height: 20px;">
				<div class="span12">
					<span>便利店: <input type="text" required="required" style="width: 150px;" id="shopName" aria-controls="DataTables_Table_0"></span>
					<span>送货地址: <input type="text" required="required" style="width: 150px;" id="address" aria-controls="DataTables_Table_0"></span>
					<span>联系方式: <input type="text" required="required" style="width: 150px;" id="contactWay" aria-controls="DataTables_Table_0"></span>
					<span>联系人: <input type="text" required="required" style="width: 150px;" id="contactUser" aria-controls="DataTables_Table_0"></span>
				</div>
			</div>
		</div>
	</div>
	<div class="modal-footer">
		<button class="btn btn-danger" data-dismiss="modal">关闭</button>
		<button id="saveObj" data-dismiss="modal" class="btn btn-success" >确定</button>
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

<script src="<%=path%>/malljs/shop-goods.js"></script>
<script>
    $(window.parent.document).find("iframe").prop("height",$("body").height());
</script>
<!-- end: JavaScript-->

</body>
</html>
