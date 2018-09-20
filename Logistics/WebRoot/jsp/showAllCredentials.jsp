<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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

<title>审核车主&Check Driver</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link href="css/credentials.css" rel="stylesheet" type="text/css" />
<link href="css/pagination.css" rel="stylesheet" type="text/css" />
<link href="css/reset.css" rel="stylesheet" type="text/css" />

<script type="text/javascript" src="js/public/jquery.1.9.1.js"></script>
<script type="text/javascript" src="js/public/jquery.min.js"></script>
<script type="text/javascript" src="js/private/jquery.pagination.js"></script>
<script type="text/javascript" src="js/private/credentials.js"></script>

<script type="text/javascript">
	$(document).ready(function() {
		$("#Pagination").pagination("15");
	});
</script>
</head>

<body>
	<div id="main" class="main">
		<div id="main-menu" class="main-menu">
			<div id="check" class="check">
				<img src="img/credentials/credentials.png">
			</div>
			<div id="checking">
				<img src="img/credentials/wait.png"> <a href="#">待 审 核</a>
			</div>
			<div id="checked">
				<img src="img/credentials/credentialsed.png"> <a href="#">已
					审 核</a>
			</div>
			<div id="gps">
				<img src="img/credentials/gps.png"> <a href="#">GPS安装</a>
			</div>
			<div id="all">
				<img src="img/credentials/showall.png"> <a href="#">查看全部</a>
			</div>
		</div>
		<div id="main-context" class="main-context">
			<div id="context-top" class="context-top">
				<img src="img/credentials/system.png"> 审核系统/待审核
			</div>
			<div id="context-menu" class="context-menu">
				<div id="order" class="order">序号</div>
				<div id="number" class="number">车主编号</div>
				<div id="name" class="name">姓名</div>
				<div id="license" class="license">驾驶证</div>
				<div id="drivering" class="drivering">行驶证</div>
				<div id="car-info" class="car-info">车辆信息</div>
				<div id="state" class="state">认证状态</div>
				<div id="manage" class="manage">操作</div>
			</div>
			<div id="context" class="context">
            </div>
            <div id="context-bottom" class="context-bottom">
                <div id="pages" class="pages">
                    <div id="Pagination"></div>
                    <div class="searchPage">
                        <span class="page-sum">共<strong class="allPage" id="allPage">15</strong>页</span>
                        <span class="page-go">跳转<input type="text">页</span>
                        <a href="javascript:;" class="page-btn">GO</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
  
</body>
</html>
