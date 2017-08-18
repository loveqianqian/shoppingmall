<%--
  Created by IntelliJ IDEA.
  User: yao
  Date: 2017/8/2
  Time: 14:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path=request.getContextPath();
%>
<html>
<head>
    <title>Title</title>
    <link id="bootstrap-style" href="<%=path%>/css/bootstrap.min.css" rel="stylesheet">
    <link href="<%=path%>/css/bootstrap-responsive.min.css" rel="stylesheet">
    <link id="base-style" href="<%=path%>/css/style.css" rel="stylesheet">
    <link id="base-style-responsive" href="<%=path%>/css/style-responsive.css" rel="stylesheet">
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800&subset=latin,cyrillic-ext,latin-ext' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="<%=path%>/css/mall/font-awesome.min.css">
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
    </li>
</ul>
<div class="row-fluid">
    <div class="box">
        <div class="box-header">
            <h2><i class="halflings-icon white list-alt"></i><span class="break"></span>Chart with points</h2>
            <div class="box-icon">
                <a href="#" class="btn-setting"><i class="halflings-icon white wrench"></i></a>
                <a href="#" class="btn-minimize"><i class="halflings-icon white chevron-up"></i></a>
                <a href="#" class="btn-close"><i class="halflings-icon white remove"></i></a>
            </div>
        </div>
        <div class="box-content">
            <div id="sincos"  class="center" style="height:300px;" ></div>
            <p id="hoverdata">Mouse position at (<span id="x">0</span>, <span id="y">0</span>). <span id="clickdata"></span></p>
        </div>
    </div>

    <div class="box">
        <div class="box-header">
            <h2><i class="halflings-icon white list-alt"></i><span class="break"></span>Flot</h2>
            <div class="box-icon">
                <a href="#" class="btn-setting"><i class="halflings-icon white wrench"></i></a>
                <a href="#" class="btn-minimize"><i class="halflings-icon white chevron-up"></i></a>
                <a href="#" class="btn-close"><i class="halflings-icon white remove"></i></a>
            </div>
        </div>
        <div class="box-content">
            <div id="flotchart" class="center" style="height:300px"></div>
        </div>
    </div>

    <div class="box">
        <div class="box-header">
            <h2><i class="halflings-icon white list-alt"></i><span class="break"></span>Stack Example</h2>
            <div class="box-icon">
                <a href="#" class="btn-setting"><i class="halflings-icon white wrench"></i></a>
                <a href="#" class="btn-minimize"><i class="halflings-icon white chevron-up"></i></a>
                <a href="#" class="btn-close"><i class="halflings-icon white remove"></i></a>
            </div>
        </div>
        <div class="box-content">
            <div id="stackchart" class="center" style="height:300px;"></div>

            <p class="stackControls center">
                <input class="btn" type="button" value="With stacking">
                <input class="btn" type="button" value="Without stacking">
            </p>

            <p class="graphControls center">
                <input class="btn-primary" type="button" value="Bars">
                <input class="btn-primary" type="button" value="Lines">
                <input class="btn-primary" type="button" value="Lines with steps">
            </p>
        </div>
    </div>

</div><!--/row-->

<div class="row-fluid sortable">
    <div class="box span6">
        <div class="box-header">
            <h2><i class="halflings-icon white list-alt"></i><span class="break"></span>Pie</h2>
            <div class="box-icon">
                <a href="#" class="btn-setting"><i class="halflings-icon white wrench"></i></a>
                <a href="#" class="btn-minimize"><i class="halflings-icon white chevron-up"></i></a>
                <a href="#" class="btn-close"><i class="halflings-icon white remove"></i></a>
            </div>
        </div>
        <div class="box-content">
            <div id="piechart" style="height:300px"></div>
        </div>
    </div>

    <div class="box span6">
        <div class="box-header" data-original-title>
            <h2><i class="halflings-icon white list-alt"></i><span class="break"></span>Donut</h2>
            <div class="box-icon">
                <a href="#" class="btn-setting"><i class="halflings-icon white wrench"></i></a>
                <a href="#" class="btn-minimize"><i class="halflings-icon white chevron-up"></i></a>
                <a href="#" class="btn-close"><i class="halflings-icon white remove"></i></a>
            </div>
        </div>
        <div class="box-content">
            <div id="donutchart" style="height: 300px;"></div>
        </div>
    </div>

</div><!--/row-->

<hr>

<div class="row-fluid sortable">
    <div class="box span12">
        <div class="box-header">
            <h2><i class="halflings-icon white list-alt"></i><span class="break"></span>Realtime</h2>
            <div class="box-icon">
                <a href="#" class="btn-setting"><i class="halflings-icon white wrench"></i></a>
                <a href="#" class="btn-minimize"><i class="halflings-icon white chevron-up"></i></a>
                <a href="#" class="btn-close"><i class="halflings-icon white remove"></i></a>
            </div>
        </div>
        <div class="box-content">
            <div id="realtimechart" style="height:190px;"></div>
            <p>You can update a chart periodically to get a real-time effect by using a timer to insert the new data in the plot and redraw it.</p>
            <p>Time between updates: <input id="updateInterval" type="text" value="" style="text-align: right; width:5em"> milliseconds</p>
        </div>
    </div>
</div><!--/row-->

<div class="row-fluid">

    <div class="widget span6" onTablet="span6" onDesktop="span6">
        <h2><span class="glyphicons facebook"><i></i></span>Facebook Fans</h2>
        <hr>
        <div class="content">
            <div id="facebookChart" style="height:300px" ></div>
        </div>
    </div><!--/span-->

    <div class="widget span6" onTablet="span6" onDesktop="span6">
        <h2><span class="glyphicons twitter"><i></i></span>Twitter Followers</h2>
        <hr>
        <div class="content">
            <div id="twitterChart" style="height:300px" ></div>
        </div>
    </div><!--/span-->

</div>

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

<div class="common-modal modal fade" id="common-Modal1" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal-content">
        <ul class="list-inline item-details">
            <li><a href="#">Admin templates</a></li>
            <li><a href="http://themescloud.org">Bootstrap themes</a></li>
        </ul>
    </div>
</div>

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
<script>
    $(window.parent.document).find("iframe").prop("height",$("body").height());
</script>
</body>
</html>
