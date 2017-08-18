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
		<!-- start: Header -->
	<div class="navbar">
		<div class="navbar-inner">
			<div class="container-fluid">
				<a class="btn btn-navbar" data-toggle="collapse" data-target=".top-nav.nav-collapse,.sidebar-nav.nav-collapse">
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</a>
				<a href="<%=path%>/user/toIndex">
					<img style="width: 40px;margin: 3px 0px 0px -25px;float: left;" src="<%=path%>/img/mall/logo.png">
					<span class="brand" style="font-size: 18px;margin: 5px 0px 0 -15px;">初品供应链</span>
				</a>
								
				<!-- start: Header Menu -->
				<div class="nav-no-collapse header-nav">
					<ul class="nav pull-right">
						<li class="dropdown hidden-phone">
							<a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
								<i class="icon-bell"></i>
								<span class="badge red">
								7 </span>
							</a>
							<ul class="dropdown-menu notifications">
								<li class="dropdown-menu-title">
 									<span>You have 11 notifications</span>
									<a href="#refresh"><i class="icon-repeat"></i></a>
								</li>	
                            	<li>
                                    <a href="#">
										<span class="icon blue"><i class="icon-user"></i></span>
										<span class="message">New user registration</span>
										<span class="time">1 min</span> 
                                    </a>
                                </li>
								<li>
                                    <a href="#">
										<span class="icon green"><i class="icon-comment-alt"></i></span>
										<span class="message">New comment</span>
										<span class="time">7 min</span> 
                                    </a>
                                </li>
								<li>
                                    <a href="#">
										<span class="icon green"><i class="icon-comment-alt"></i></span>
										<span class="message">New comment</span>
										<span class="time">8 min</span> 
                                    </a>
                                </li>
								<li>
                                    <a href="#">
										<span class="icon green"><i class="icon-comment-alt"></i></span>
										<span class="message">New comment</span>
										<span class="time">16 min</span> 
                                    </a>
                                </li>
								<li>
                                    <a href="#">
										<span class="icon blue"><i class="icon-user"></i></span>
										<span class="message">New user registration</span>
										<span class="time">36 min</span> 
                                    </a>
                                </li>
								<li>
                                    <a href="#">
										<span class="icon yellow"><i class="icon-shopping-cart"></i></span>
										<span class="message">2 items sold</span>
										<span class="time">1 hour</span> 
                                    </a>
                                </li>
								<li class="warning">
                                    <a href="#">
										<span class="icon red"><i class="icon-user"></i></span>
										<span class="message">User deleted account</span>
										<span class="time">2 hour</span> 
                                    </a>
                                </li>
								<li class="warning">
                                    <a href="#">
										<span class="icon red"><i class="icon-shopping-cart"></i></span>
										<span class="message">New comment</span>
										<span class="time">6 hour</span> 
                                    </a>
                                </li>
								<li>
                                    <a href="#">
										<span class="icon green"><i class="icon-comment-alt"></i></span>
										<span class="message">New comment</span>
										<span class="time">yesterday</span> 
                                    </a>
                                </li>
								<li>
                                    <a href="#">
										<span class="icon blue"><i class="icon-user"></i></span>
										<span class="message">New user registration</span>
										<span class="time">yesterday</span> 
                                    </a>
                                </li>
                                <li class="dropdown-menu-sub-footer">
                            		<a>View all notifications</a>
								</li>	
							</ul>
						</li>
						<!-- start: Notifications Dropdown -->
						<li class="dropdown hidden-phone">
							<a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
								<i class="icon-calendar"></i>
								<span class="badge red">
								5 </span>
							</a>
							<ul class="dropdown-menu tasks">
								<li class="dropdown-menu-title">
 									<span>You have 17 tasks in progress</span>
									<a href="#refresh"><i class="icon-repeat"></i></a>
								</li>
								<li>
                                    <a href="#">
										<span class="header">
											<span class="title">iOS Development</span>
											<span class="percent"></span>
										</span>
                                        <div class="taskProgress progressSlim red">80</div> 
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
										<span class="header">
											<span class="title">Android Development</span>
											<span class="percent"></span>
										</span>
                                        <div class="taskProgress progressSlim green">47</div> 
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
										<span class="header">
											<span class="title">ARM Development</span>
											<span class="percent"></span>
										</span>
                                        <div class="taskProgress progressSlim yellow">32</div> 
                                    </a>
                                </li>
								<li>
                                    <a href="#">
										<span class="header">
											<span class="title">ARM Development</span>
											<span class="percent"></span>
										</span>
                                        <div class="taskProgress progressSlim greenLight">63</div> 
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
										<span class="header">
											<span class="title">ARM Development</span>
											<span class="percent"></span>
										</span>
                                        <div class="taskProgress progressSlim orange">80</div> 
                                    </a>
                                </li>
								<li>
                            		<a class="dropdown-menu-sub-footer">View all tasks</a>
								</li>	
							</ul>
						</li>
						<!-- end: Notifications Dropdown -->
						<!-- start: Message Dropdown -->
						<li class="dropdown hidden-phone">
							<a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
								<i class="icon-envelope"></i>
								<span class="badge red">
								4 </span>
							</a>
							<ul class="dropdown-menu messages">
								<li class="dropdown-menu-title">
 									<span>You have 9 messages</span>
									<a href="#refresh"><i class="icon-repeat"></i></a>
								</li>	
                            	<li>
                                    <a href="#">
										<span class="avatar"><img src="<%=path%>/img/avatar.jpg" alt="Avatar"></span>
										<span class="header">
											<span class="from">
										    	Dennis Ji
										     </span>
											<span class="time">
										    	6 min
										    </span>
										</span>
                                        <span class="message">
                                            Lorem ipsum dolor sit amet consectetur adipiscing elit, et al commore
                                        </span>  
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
										<span class="avatar"><img src="<%=path%>/img/avatar.jpg" alt="Avatar"></span>
										<span class="header">
											<span class="from">
										    	Dennis Ji
										     </span>
											<span class="time">
										    	56 min
										    </span>
										</span>
                                        <span class="message">
                                            Lorem ipsum dolor sit amet consectetur adipiscing elit, et al commore
                                        </span>  
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
										<span class="avatar"><img src="<%=path%>/img/avatar.jpg" alt="Avatar"></span>
										<span class="header">
											<span class="from">
										    	Dennis Ji
										     </span>
											<span class="time">
										    	3 hours
										    </span>
										</span>
                                        <span class="message">
                                            Lorem ipsum dolor sit amet consectetur adipiscing elit, et al commore
                                        </span>  
                                    </a>
                                </li>
								<li>
                                    <a href="#">
										<span class="avatar"><img src="<%=path%>/img/avatar.jpg" alt="Avatar"></span>
										<span class="header">
											<span class="from">
										    	Dennis Ji
										     </span>
											<span class="time">
										    	yesterday
										    </span>
										</span>
                                        <span class="message">
                                            Lorem ipsum dolor sit amet consectetur adipiscing elit, et al commore
                                        </span>  
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
										<span class="avatar"><img src="<%=path%>/img/avatar.jpg" alt="Avatar"></span>
										<span class="header">
											<span class="from">
										    	Dennis Ji
										     </span>
											<span class="time">
										    	Jul 25, 2012
										    </span>
										</span>
                                        <span class="message">
                                            Lorem ipsum dolor sit amet consectetur adipiscing elit, et al commore
                                        </span>  
                                    </a>
                                </li>
								<li>
                            		<a class="dropdown-menu-sub-footer">View all messages</a>
								</li>	
							</ul>
						</li>
						
						<!-- start: User Dropdown -->
						<li class="dropdown">
							<a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
								<i class="halflings-icon white user"></i> Dennis Ji
								<span class="caret"></span>
							</a>
							<ul class="dropdown-menu">
								<li class="dropdown-menu-title">
 									<span>Account Settings</span>
								</li>
								<li><a href="#"><i class="halflings-icon user"></i> Profile</a></li>
								<li><a href="<%=path%>/user/logout"><i class="halflings-icon off"></i> Logout</a></li>
							</ul>
						</li>
						<!-- end: User Dropdown -->
					</ul>
				</div>
				<!-- end: Header Menu -->
				
			</div>
		</div>
	</div>
	<!-- start: Header -->
	
		<div class="container-fluid-full">
		<div class="row-fluid">
				
			<!-- start: Main Menu -->
			<div id="sidebar-left" class="span2">
				<div class="nav-collapse sidebar-nav">
					<ul class="nav nav-tabs nav-stacked main-menu">
						<li>
							<a class="dropmenu" href="#"><i class="icon-dashboard"></i><span class="hidden-tablet"> 供应商系统</span><span class="label label-important"> 1 </span></a>
							<ul>
								<li><a class="submenu" href="<%=path%>/order/toOrder"><i class="icon-file-alt"></i><span class="hidden-tablet"> 订单列表</span></a></li>
							</ul>
						</li>
						<li>
							<a class="dropmenu" href="#"><i class="icon-dashboard"></i><i class="icon-file-alt"></i><span class="hidden-tablet"> 财务管理</span><span class="label label-important"> 1 </span></a>
							<ul>
								<li><a class="submenu" href="<%=path%>/finance/toFinance"><i class="icon-file-alt"></i><span class="hidden-tablet"> 财务列表</span></a></li>
							</ul>
						</li>
						<li>
							<a class="dropmenu" href="#"><i class="icon-lock"></i><span class="hidden-tablet"> 权限管理</span><span class="label label-important"> 2 </span></a>
							<ul style="display: none;">
								<li><a class="submenu" href="<%=path%>/user/toUser"><i class="icon-file-alt"></i><span class="hidden-tablet"> 用户管理</span></a></li>
								<li><a class="submenu" href="<%=path%>/role/toRole"><i class="icon-file-alt"></i><span class="hidden-tablet"> 角色管理</span></a></li>
							</ul>
						</li>
						<li>
							<a class="dropmenu" href="#"><i class="icon-lock"></i><span class="hidden-tablet"> 采购管理</span><span class="label label-important"> 4 </span></a>
							<ul>
								<li><a class="submenu" href="<%=path%>/provider/toProvider"><i class="icon-file-alt"></i><span class="hidden-tablet"> 供应商管理</span></a></li>
								<li><a class="submenu" href="<%=path%>/goods/toRequire"><i class="icon-file-alt"></i><span class="hidden-tablet"> 要货管理</span></a></li>
								<li><a class="submenu" href="<%=path%>/order/toPurOrder"><i class="icon-file-alt"></i><span class="hidden-tablet"> 采购订单</span></a></li>
								<li><a class="submenu" href="<%=path%>/order/toCount"><i class="icon-file-alt"></i><span class="hidden-tablet"> 采购统计（3个页签）</span></a></li>
							</ul>
						</li>
						<li>
							<a class="dropmenu" href="#"><i class="icon-envelope"></i><span class="hidden-tablet"> 便利店系统</span><span class="label label-important"> 1 </span></a>
							<ul>
								<li><a class="submenu" href="<%=path%>/goods/toShopGoods"><i class="icon-file-alt"></i><span class="hidden-tablet"> 商品列表</span></a></li>
							</ul>
						</li>
						<li>
							<a class="dropmenu" href="#"><i class="icon-tasks"></i><span class="hidden-tablet"> 仓库管理</span><span class="label label-important"> 4 </span></a>
							<ul>
								<li><a class="submenu" href="<%=path%>/warehouse/toWarehouse"><i class="icon-file-alt"></i><span class="hidden-tablet"> 仓库列表</span></a></li>
								<li><a class="submenu" href="<%=path%>/goods/toPutin"><i class="icon-file-alt"></i><span class="hidden-tablet"> 商品入库</span></a></li>
								<li><a class="submenu" href="<%=path%>/goods/toPutout"><i class="icon-file-alt"></i><span class="hidden-tablet"> 商品出库</span></a></li>
								<li><a class="submenu" href="<%=path%>/goods/toHouseGoods"><i class="icon-file-alt"></i><span class="hidden-tablet"> 商品列表</span></a></li>
							</ul>
						</li>
						<li>
							<a class="dropmenu" href="#"><i class="icon-envelope"></i><span class="hidden-tablet"> 便利店管理</span><span class="label label-important"> 2 </span></a>
							<ul>
								<li><a class="submenu" href="<%=path%>/shop/toShop"><i class="icon-file-alt"></i><span class="hidden-tablet"> 便利店列表</span></a></li>
								<li><a class="submenu" href="<%=path%>/shop/toStatistics"><i class="icon-file-alt"></i><span class="hidden-tablet"> 统计</span></a></li>
							</ul>
						</li>
						<li>
							<a class="dropmenu" href="#"><i class="icon-envelope"></i><span class="hidden-tablet"> 分类管理</span><span class="label label-important"> 1 </span></a>
							<ul>
								<li><a class="submenu" href="<%=path%>/classify/toClassify"><i class="icon-file-alt"></i><span class="hidden-tablet"> 分类管理</span></a></li>
							</ul>
						</li>
						<%--<li><a href="<%=path%>/user/toMessages"><i class="icon-envelope"></i><span class="hidden-tablet"> 分类管理</span></a></li>--%>
						<%--<li><a href="<%=path%>/provider/toProvider"><i class="icon-eye-open"></i><span class="hidden-tablet"> 供货管理</span></a></li>--%>
						<li><a href="<%=path%>/user/toSetting"><i class="icon-list-alt"></i><span class="hidden-tablet"> 系统配置</span></a></li>
					</ul>
				</div>
			</div>
			<!-- end: Main Menu -->
			
			<noscript>
				<div class="alert alert-block span10">
					<h4 class="alert-heading">Warning!</h4>
					<p>You need to have <a href="http://en.wikipedia.org/wiki/JavaScript" target="_blank">JavaScript</a> enabled to use this site.</p>
				</div>
			</noscript>
			
			<!-- start: Content -->
			<div id="content" class="span10">
			<ul class="breadcrumb">
				<li>
					<i class="icon-home"></i>
					<a href="<%=path%>/user/toIndex">首页</a>
					<i class="icon-angle-right"></i>
				</li>
				<li><a href="#">分类管理</a></li>
			</ul>

			<div class="row-fluid">
				
				<div class="span7">
					<h1>Inbox</h1>
					
					<ul class="messagesList">
						
						<li>
							<span class="from"><span class="glyphicons star"><i></i></span> Dennis Ji <span class="glyphicons paperclip"><i></i></span></span><span class="title"><span class="label label-warning">problem</span> Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit..</span><span class="date">Today, <b>3:47 PM</b></span>
						</li>
						<li>
							<span class="from"><span class="glyphicons dislikes"><i></i></span> Dennis Ji</span><span class="title">Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit..</span><span class="date">Today, <b>3:47 PM</b></span>
						</li>
						<li>
							<span class="from"><span class="glyphicons dislikes"><i></i></span> Dennis Ji</span><span class="title">Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit..</span><span class="date">Today, <b>3:47 PM</b></span>
						</li>
						<li>
							<span class="from"><span class="glyphicons star"><i></i></span> Dennis Ji <span class="glyphicons paperclip"><i></i></span></span><span class="title"><span class="label label-success">task</span> Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit..</span><span class="date">Today, <b>3:47 PM</b></span>
						</li>
						<li>
							<span class="from"><span class="glyphicons dislikes"><i></i></span> Dennis Ji <span class="glyphicons paperclip"><i></i></span></span><span class="title">Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit..</span><span class="date">Today, <b>3:47 PM</b></span>
						</li>
						<li>
							<span class="from"><span class="glyphicons dislikes"><i></i></span> Dennis Ji <span class="glyphicons paperclip"><i></i></span></span><span class="title">Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit..</span><span class="date">Today, <b>3:47 PM</b></span>
						</li>
						<li>
							<span class="from"><span class="glyphicons dislikes"><i></i></span> Dennis Ji</span><span class="title"><span class="label label-info">information</span> Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit..</span><span class="date">Today, <b>3:47 PM</b></span>
						</li>
						<li>
							<span class="from"><span class="glyphicons star"><i></i></span> Dennis Ji</span><span class="title">Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit..</span><span class="date">Today, <b>3:47 PM</b></span>
						</li>
						<li>
							<span class="from"><span class="glyphicons dislikes"><i></i></span> Dennis Ji <span class="glyphicons paperclip"><i></i></span></span><span class="title">Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit..</span><span class="date">Today, <b>3:47 PM</b></span>
						</li>
						<li>
							<span class="from"><span class="glyphicons dislikes"><i></i></span> Dennis Ji <span class="glyphicons paperclip"><i></i></span></span><span class="title">Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit..</span><span class="date">Today, <b>3:47 PM</b></span>
						</li>
						<li>
							<span class="from"><span class="glyphicons dislikes"><i></i></span> Dennis Ji</span><span class="title">Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit..</span><span class="date">Today, <b>3:47 PM</b></span>
						</li>
						<li>
							<span class="from"><span class="glyphicons star"><i></i></span> Dennis Ji <span class="glyphicons paperclip"><i></i></span></span><span class="title">Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit..</span><span class="date">Today, <b>3:47 PM</b></span>
						</li>
						<li>
							<span class="from"><span class="glyphicons dislikes"><i></i></span> Dennis Ji</span><span class="title">Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit..</span><span class="date">Today, <b>3:47 PM</b></span>
						</li>
						<li>
							<span class="from"><span class="glyphicons dislikes"><i></i></span> Dennis Ji</span><span class="title">Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit..</span><span class="date">Today, <b>3:47 PM</b></span>
						</li>
						<li>
							<span class="from"><span class="glyphicons star"><i></i></span> Dennis Ji <span class="glyphicons paperclip"><i></i></span></span><span class="title">Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit..</span><span class="date">Today, <b>3:47 PM</b></span>
						</li>
						<li>
							<span class="from"><span class="glyphicons dislikes"><i></i></span> Dennis Ji <span class="glyphicons paperclip"><i></i></span></span><span class="title">Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit..</span><span class="date">Today, <b>3:47 PM</b></span>
						</li>
						<li>
							<span class="from"><span class="glyphicons dislikes"><i></i></span> Dennis Ji <span class="glyphicons paperclip"><i></i></span></span><span class="title">Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit..</span><span class="date">Today, <b>3:47 PM</b></span>
						</li>
						<li>
							<span class="from"><span class="glyphicons dislikes"><i></i></span> Dennis Ji</span><span class="title">Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit..</span><span class="date">Today, <b>3:47 PM</b></span>
						</li>
						<li>
							<span class="from"><span class="glyphicons star"><i></i></span> Dennis Ji</span><span class="title">Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit..</span><span class="date">Today, <b>3:47 PM</b></span>
						</li>
						<li>
							<span class="from"><span class="glyphicons dislikes"><i></i></span> Dennis Ji <span class="glyphicons paperclip"><i></i></span></span><span class="title">Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit..</span><span class="date">Today, <b>3:47 PM</b></span>
						</li>
						<li>
							<span class="from"><span class="glyphicons dislikes"><i></i></span> Dennis Ji <span class="glyphicons paperclip"><i></i></span></span><span class="title">Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit..</span><span class="date">Today, <b>3:47 PM</b></span>
						</li>
						<li>
							<span class="from"><span class="glyphicons dislikes"><i></i></span> Dennis Ji</span><span class="title">Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit..</span><span class="date">Today, <b>3:47 PM</b></span>
						</li>
						
					</ul>
					<div class="common-modal modal fade" id="common-Modal1" tabindex="-1" role="dialog" aria-hidden="true">
						<div class="modal-content">
							<ul class="list-inline item-details">
								<li><a href="#">Admin templates</a></li>
								<li><a href="http://themescloud.org">Bootstrap themes</a></li>
							</ul>
						</div>
					</div>	
				</div>
				<div class="span5 noMarginLeft">
					
					<div class="message dark">
						
						<div class="header">
							<h1>"Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit.."</h1>
							<div class="from"><i class="halflings-icon user"></i> <b>Dennis Ji</b> / jiguofei@msn.com</div>
							<div class="date"><i class="halflings-icon time"></i> Today, <b>3:47 PM</b></div>
							
							<div class="menu"></div>
							
						</div>
						
						<div class="content">
							<p>
								Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
							</p>
							<blockquote>
								Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
							</blockquote>
							<p>
							Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
							</p>	
						</div>
						
						<div class="attachments">
							<ul>
								<li>
									<span class="label label-important">zip</span> <b>bootstrap.zip</b> <i>(2,5MB)</i>
									<span class="quickMenu">
										<a href="#" class="glyphicons search"><i></i></a>
										<a href="#" class="glyphicons share"><i></i></a>
										<a href="#" class="glyphicons cloud-download"><i></i></a>
									</span>
								</li>
								<li>
									<span class="label label-info">txt</span> <b>readme.txt</b> <i>(7KB)</i>
									<span class="quickMenu">
										<a href="#" class="glyphicons search"><i></i></a>
										<a href="#" class="glyphicons share"><i></i></a>
										<a href="#" class="glyphicons cloud-download"><i></i></a>
									</span>
								</li>
								<li>
									<span class="label label-success">xls</span> <b>spreadsheet.xls</b> <i>(984KB)</i>
									<span class="quickMenu">
										<a href="#" class="glyphicons search"><i></i></a>
										<a href="#" class="glyphicons share"><i></i></a>
										<a href="#" class="glyphicons cloud-download"><i></i></a>
									</span>
								</li>
							</ul>		
						</div>
						
						<form class="replyForm"method="post" action="">

							<fieldset>
								<textarea tabindex="3" class="input-xlarge span12" id="message" name="body" rows="12" placeholder="Click here to reply"></textarea>

								<div class="actions">
									
									<button tabindex="3" type="submit" class="btn btn-success">Send message</button>
									
								</div>

							</fieldset>

						</form>	
						
					</div>	
					
				</div>
						
			</div>
			
       

	</div><!--/.fluid-container-->
	
			<!-- end: Content -->
		</div><!--/#content.span10-->
		</div><!--/fluid-row-->
		
	<div class="modal hide fade" id="myModal">
		<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal">×</button>
			<h3>Settings</h3>
		</div>
		<div class="modal-body">
			<p>Here settings can be configured...</p>
		</div>
		<div class="modal-footer">
			<a href="#" class="btn" data-dismiss="modal">Close</a>
			<a href="#" class="btn btn-primary">Save changes</a>
		</div>
	</div>
	
	<div class="clearfix"></div>
	
	<footer>

		<p>
			<span style="text-align:left;float:left">&copy; 2013 <a href="downloads/janux-free-responsive-admin-dashboard-template/" alt="Bootstrap_Metro_Dashboard">JANUX Responsive Dashboard</a></span>
			
		</p>

	</footer>

		<!-- start: JavaScript-->

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
		<!-- end: JavaScript-->
	
</body>
</html>
