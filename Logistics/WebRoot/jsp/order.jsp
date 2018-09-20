<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>订单</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="css/order.css">
<!-- <script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=IXyBGTk2r4D3qPfsHcpZgFV3DwcCWGFe"></script> -->
<title>订单</title>
<script src="http://c.cnzz.com/core.php"></script>
</head>
<body>
	<div id="head">
		<jsp:include page="head1.html"></jsp:include>
	</div>
	<div id="package">
		<div id="side">
			<ul>
				<li><a href="#" id="a1" onclick='changeImages(1)'> <span
						id="logo1"></span> <span class="span-a">叫车</span>
				</a></li>
				<li><a href="#" id="a2" onclick='changeImages(2)'> <span
						id="logo2"></span> <span class="span-a">我的订单</span>
				</a></li>
				<li><a href="#" id="a3" onclick='changeImages(3)'> <span
						id="logo3"></span> <span class="span-a">我的司机</span>
				</a></li>
			</ul>
		</div>
		<div id="order-list-view">

			<div id="order-list-header">

				<ul>
					<li><span  id="header-native-1" onclick="changeColor(1),showInOrder(2)">进行中</span>
					</li>
					<li><span  id="header-native-4" onclick="changeColor(4),showInOrder(1)">等待用户确认</span>
					</li>
					<li><span id="header-native-2" onclick="changeColor(2),showInOrder(0)">已完成</span>
					</li>
					<li><span  id="header-native-3" onclick="changeColor(3)">已取消</span>
					</li>
				</ul>

			</div>
			<div id="order-table">
				<ul>
					<li class="table-1">订单状态</li>
					<li class="table-2">订单编号</li>
					<li class="table-3">订单时间</li>
					<li class="table-4">路线</li>
					<li class="table-5">费用</li>
					<!-- <li class="demo"><span id="button"
						onclick="openDialog(),openmap()">打开地图</span>
						<div class='demo-bg'></div>
						<div class='demo-txt' id="test">
							<div id="allmap"></div>
							<button id="btn" onclick="closeDialog()">关闭地图</button>
						</div></li> -->
				</ul>
				
			</div>
			<div id="order"></div>
		</div>
	</div>

	<div id="foot">
		<jsp:include page="foot.html"></jsp:include>
	</div>

</body>

<script type="text/javascript" src="js/order.js"></script>
<script type="text/javascript" src="js/public/jquery.1.9.1.js"></script>
<!--<script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=IXyBGTk2r4D3qPfsHcpZgFV3DwcCWGFe"></script>-->

</html>

