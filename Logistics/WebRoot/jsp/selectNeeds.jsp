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

<title>用户主页面</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script type="text/javascript"
	src="http://api.map.baidu.com/api?v=2.0&ak=iDxSTVtbVLQoQevRPayDE3ATYF7VNudG"></script>
<script src="http://libs.baidu.com/jquery/1.9.0/jquery.js"></script>
<script src="http://lib.sinaapp.com/js/jquery/1.9.1/jquery-1.9.1.min.js"></script>
<!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->
<style type="text/css">
#left {
	margin-top: 100px;
	/* margin-bottom:80px; */
	width: 18%;
	margin-right: 2%;
	height: 450px;
	/* border: solid 1px black; */
	float: left;
}

#right {
	margin-top: 100px;
	margin-left: 50px;
	/* margin-bottom:80px; */
	width: 90%;
	height: 450px;
	/* border: solid 1px black; */
	float: left;
}

#show {
	width: 65%;
	height: 440px;
	float: left;
}

#allmap {
	width: 35%;
	height: 440px;
	float: left;
}

.menu {
	width: 100%;
	height: 15%;
	text-align: center;
	line-height: 66px;
	/* border: solid 1px black; */
}

.menu:hover, .menu:visited {
	background-color: gray;
}

#condition {
	/* margin-top: 20px; */
	width: 89%;
	height: 80px;
	line-height: 20px;
	/* border: solid 1px black; */
}

#result {
	width: 99%;
	height: 350px;
	/* border: solid 1px black; */
}

.item {
	width: 100%;
	height: 35px;
	/* background-color: gray; */
}

.itemdetail {
	float: left;
	height: 100%;
	width: 30%;
	text-align: left;
}

#pageControl {
	width: 89%;
	height: 20px;
	text-align: center;
	/* border: solid 1px black;
    background-color: rgb(151, 116, 255); */
}

#pageControl a {
	text-decoration: none;
}

#number {
	width: 6%;
	height: 30px;
}

#count {
	width: 10%;
	height: 30px;
}
#adate{
width:15%;
height: 30px;
}
#operator{
    width:7%;
    height: 30px;
}
</style>
</head>

<body>
	<jsp:include page="head2.html"></jsp:include>
	<div id="right">
		<div id="show">
			<div id="condition">
				起点：<input id="origin" type="text" name="origin"
					style="border-collapse: collapse;width:150px;"><br>
				终点：<input id="destination" type="text" name="destination"
					style="border-collapse: collapse;width:150px;"><br>
				日期：<input id="date" type="date" name="departureTime"
					style="width:150px;">
				<button onclick="query()">查询</button>
			</div>
			<div id="result">
				<div class="item">
					<div class="itemdetail" id="number">编号</div>
					<div class="itemdetail">出发地</div>
					<div class="itemdetail">终点</div>
					<div class="itemdetail" id="adate">时间</div>
					<div class="itemdetail" id="count">金额</div>
					<div class="itemdetail" id="operator">操作</div>
				</div>
				<div id="content"></div>
			</div>
			<div id="pageControl">
				<a href="javascript:void(0);" onclick="prePage()">上一页</a> <span id="curPage" style="margin-left:10px;"> 1 </span> / <span id="pages"
					style="margin-right:10px;"> 1 </span> <a href="javascript:void(0);" onclick="nextPage()">下一页</a>
			</div>
		</div>
		<div id="allmap"></div>
	</div>
	<jsp:include page="foot.html"></jsp:include>
</body>
</html>
<script type="text/javascript">
	// 百度地图API功能
	var map = new BMap.Map("allmap");
	var point = new BMap.Point(116.331398, 39.897445);
	map.centerAndZoom(point, 12);
	map.enableScrollWheelZoom(); //启用滚轮放大缩小，默认禁用
	map.enableContinuousZoom(); //启用地图惯性拖拽，默认禁用
	function myFun(result) {
		var cityName = result.name;
		map.setCenter(cityName);
	}
	var myCity = new BMap.LocalCity();
	myCity.get(myFun);
	function query() {
		$.ajax({
			url : "/Trucks-trunk/queryRequirement.action",
			async : true,
			method : "post",
			dataType : "json",
			data : {
			    curPage:document.getElementById("curPage").innerHTML,
				origin : document.getElementById("origin").value,
				destination : document.getElementById("destination").value,
				departureTime : document.getElementById("date").value
			},
			success : function(data) {
				var list = data.list;
				var pages = data.pages;
				document.getElementById("pages").innerHTML=pages;
				var content = "";
				for(var i = 0; i < list.length; i++){
				    content += "<div class='item'>"
                + "<div class='itemdetail' id='number'>" + list[i].id + "</div>"
                + "<div class='itemdetail'>" +list[i].origin + "</div>"
                + "<div class='itemdetail'>" +list[i].destination + "</div>"
                + "<div class='itemdetail'  id='adate'>" +list[i].departureTime + "</div>"
                + "<div class='itemdetail' id='count'>" +list[i].cost + "</div>"
                + "<div class='itemdetail'  id='operator'><button onclick='order(" + list[i].id + ")'>接单</button></div>"
                + "</div>"
				}
				document.getElementById("content").innerHTML=content;
			}
		});
	}
	function prePage(){
	   var curPage = parseInt(document.getElementById("curPage").innerHTML);
	   if (curPage > 1){
	       curPage = curPage - 1;
	       document.getElementById("curPage").innerHTML = curPage;
	       query();
	   }
	}
	function nextPage(){
       var curPage = parseInt(document.getElementById("curPage").innerHTML);
       var pages = parseInt(document.getElementById("pages").innerHTML);
       if (curPage < pages ){
           curPage = curPage + 1;
           document.getElementById("curPage").innerHTML = curPage;
           query();
       }
    }
    function order(id){
	    $.ajax({
	            url : "/Trucks-trunk/order.action",
	            async : true,
	            method : "post",
	            dataType : "json",
	            data : {
	                id:id
	            },
	            success : function(data) {
	               alert(data);
	            }
	        });
	    }
</script>
