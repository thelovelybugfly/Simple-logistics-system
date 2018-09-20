<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>拉货啦</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style>
#y {
	margin-top: 100px;
	color: #FF7E7A;
	font-size: 30px;
	text-align: center;
	width: 100%;
	height: 50px;
	line-height: 50px;
}

.out {
	width: 100%;
	margin-top: 20px;
	text-align: center;
}

.pic {
	width: 25%;
	text-align: center;
	float: left;
	line-height: 30px;
}

.type {
	width: 10%;
	height: 30px;
	float: left;
}

.message {
	width: 60%;
	height: 30px;
	float: left;
	/* background-color: rgb(151, 116, 255); */
}

.standard {
	width: 30%;
	height: 30px;
	float: left;
}
</style>
</head>

<body>
	<jsp:include page="head1.html"></jsp:include>
	<div>
		<div id="y">为什么选择拉货啦？</div>
		<div class="out">
			<div class="pic">
				<img alt="" src="img/img_mian_1.png">
			</div>
			<div class="pic">
				<img alt="" src="img/img_mian_2.png">
			</div>
			<div class="pic">
				<img alt="" src="img/img_mian_3.png">
			</div>
			<div class="pic">
				<img alt="" src="img/img_mian_4.png">
			</div>
			<div class="pic">
				<b>极速响应</b>
			</div>
			<div class="pic">
				<b>低价透明</b>
			</div>
			<div class="pic">
				<b>运力充足</b>
			</div>
			<div class="pic">
				<b>专业服务</b>
			</div>
			<div class="pic">
				5秒下单，10秒内接单<br>随叫随到，10分钟内到达用车点
			</div>
			<div class="pic">
				低价实惠，比个体司机便宜40%<br>按照里程、车型计费，收费有标准
			</div>
			<div class="pic">
				200万+注册司机，全国覆盖<br>面包、厢货、平板等车型精准匹配
			</div>
			<div class="pic">
				经过严格培训和考核的<br>认证司机99.8%用户好评司机
			</div>
		</div>
		<hr>
		<div class="out">
			<div class="type">车型</div>
			<div class="message">信息</div>
			<div class="standard">计费标准</div>
			<hr>
			<div class="type">小面包车</div>
			<div class="message">载重：500kg，体积：1.8*1.3*1.1共计2.6方</div>
			<div class="standard">30元/每5公里，超程按2.8元/公里计费</div>
			<hr>
			<div class="type">中等面包车</div>
			<div class="message">载重：1000kg，体积：2.7*1.4*1.2共计4.5方</div>
			<div class="standard">56元/每5公里，超程按4元/公里计费</div>
			<hr>
			<div class="type">小货车</div>
			<div class="message">载重：1000kg，体积：2.7*1.5*1.7共计6.9方</div>
			<div class="standard">64元/每5公里，超程按4.5元/公里计费</div>
			<hr>
			<div class="type">中等货车</div>
			<div class="message">载重：1800kg，体积：4.2*1.8*1.8共计13.6方</div>
			<div class="standard">130元/每5公里，超程按5.6元/公里计费</div>
		</div>
		<br /> <br /> <br /> <br /> <br /> <br />
	</div>
	<jsp:include page="foot.html"></jsp:include>
</body>
</html>
