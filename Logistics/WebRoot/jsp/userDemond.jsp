<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'userDemond.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
		function highlight1(){
			var obj1=document.getElementById("img1");
			var obj2=document.getElementById("img2");
			var obj3=document.getElementById("img3");
			var obj4=document.getElementById("img4");
				obj1.style.opacity=1;
				obj2.style.opacity=0.3;
				obj3.style.opacity=0.3;
				obj4.style.opacity=0.3;
		}
		function highlight2(){
			var obj1=document.getElementById("img1");
			var obj2=document.getElementById("img2");
			var obj3=document.getElementById("img3");
			var obj4=document.getElementById("img4");
				obj1.style.opacity=0.3;
				obj2.style.opacity=1;
				obj3.style.opacity=0.3;
				obj4.style.opacity=0.3;
		}
		function highlight3(){
			var obj1=document.getElementById("img1");
			var obj2=document.getElementById("img2");
			var obj3=document.getElementById("img3");
			var obj4=document.getElementById("img4");
				obj1.style.opacity=0.3;
				obj2.style.opacity=0.3;
				obj3.style.opacity=1;
				obj4.style.opacity=0.3;
		}
		function highlight4(){
			var obj1=document.getElementById("img1");
			var obj2=document.getElementById("img2");
			var obj3=document.getElementById("img3");
			var obj4=document.getElementById("img4");
				obj1.style.opacity=0.3;
				obj2.style.opacity=0.3;
				obj3.style.opacity=0.3;
				obj4.style.opacity=1;
		}
		function showdiv1(){
			var obj=document.getElementById("show1");
			obj.style.display="block";
		}
		function hiddendiv1(){
			var obj=document.getElementById("show1");
			obj.style.display="none";
		}
		function showdiv2(){
			var obj=document.getElementById("show2");
			obj.style.display="block";
		}
		function hiddendiv2(){
			var obj=document.getElementById("show2");
			obj.style.display="none";
		}
		function showdiv3(){
			var obj=document.getElementById("show3");
			obj.style.display="block";
		}
		function hiddendiv3(){
			var obj=document.getElementById("show3");
			obj.style.display="none";
		}
		function showdiv4(){
			var obj=document.getElementById("show4");
			obj.style.display="block";
		}
		function hiddendiv4(){
			var obj=document.getElementById("show4");
			obj.style.display="none";
		}
	</script>
	<style type="text/css">
		#title-bar{
			width:100%;
			height:30;
			margin-top:0;
			background-color:red;
		}
		#title{
			width:1000px;
			height:50px;
			margin:auto;
			font-size:18px;
			font-family:宋体;
			font-weight:bold;
			line-height:50px;
		}
		#outer-div1{
			width:1000px;
			height:200px;
			margin:auto;
		}
		#truck-type{
			width:1000px;
			height:50px;
			line-height:50px;
			font-size:16px;
			font-family:宋体;
			font-weight:bold;
		}
		#picture-div{
			width: 1000px;
			height:150px;
		}
		.truck-picture-div{
			width:245px;
			height:130px;
			text-align:center;
			vertical-align:bottom;
			float:left;
			font-size:14px;
			font-family:宋体;
			font-weight:bold;
		}
		.truck-picture-img{
			width:170px;
			height:100px;
			opacity:0.3;
		}
		.hidden-div{
			width:150;
			height:50;
			margin:auto;
			font-size:13px;
			font-family:宋体;
			font-weight:normal;
			display:none;
			color:blue;
		}
		#info{
			width:1000px;
			height:50px;
			margin:auto;
			font-size:18px;
			font-family:宋体;
			font-weight:bold;
			line-height:50px;
		}
		#showinfo{
			width:1000px;
			margin:auto;
		}
		.smalldiv{
			width:600px;
			height:50px;
			font-size:14px;
			font-family:宋体;
			font-weight:bold;
			line-height:50px;
		}
		.tabel{
			width:200px;
			height:50px;
			float:left;
		}
		.input-div{
			width:400px;
			height:50px;
			float:left;
		}
		.input-value{
			width:250px;
			height:25px;
			margin-top:14px;
			border:0;
		}
		.select{
			width:250px;
			height:25px;
			margin-top:14px;
		}
		#receiver{
			width:360px;
			height:50px;
			font-size:14px;
			font-family:宋体;
			font-weight:bold;
			line-height:50px;
			margin:auto;
		}
		#include-div{
			width:320px;
			height:140px;
			margin:auto;
			border:solid 1px black;
			padding:20px;
		}
		.info-div{
			width:320px;
			height:60px;
		}
		.logo-img{
			width: 25px;
			height: 25px;
			margin-top:20px;
			margin-left:10px;
		}
		.input-info{
			width:200px;
			height:25px;
			margin-top:20px;
			margin-left:5px;
			border:0;
		}
		#button-div{
			width:360px;
			height:100px;
			margin:auto;
		}
		.foot{
			width:180px;
			height:100px;
			float:left;
		}
		.button2{
			width:180px;
			height:100px;
			font-size:20px;
			font-family:宋体;
			color:blue;
			border:0px;
			background-color:transparent;
		}
	</style>
  </head>
  
  <body>
    <jsp:include page="head1.html"></jsp:include>
    <div id="title">用货需求<hr></div><br>
    <div id="outer-div1">
    	<div id="truck-type">车型选择（必选）<hr></div><br>
    	<div id="picutre-div">
    		<div class="truck-picture-div"><img class="truck-picture-img" src="img/small_van.png" onclick="highlight1()" id="img1" onmouseover="showdiv1()" onmouseout="hiddendiv1()"><br><br>小面包车<div class="hidden-div" id="show1">载重:500公斤<br>长宽高:1.8*1.3*1.1<br>载货体积:2.6方</div></div>
    		<div class="truck-picture-div"><img class="truck-picture-img" src="img/medium_van.jpg" id="img2" onclick="highlight2()" onmouseover="showdiv2()" onmouseout="hiddendiv2()"><br><br>中面包车<div class="hidden-div" id="show2">载重:1吨<br>长宽高:2.7*1.4*1.2<br>载货体积:4.5方</div></div>
    		<div class="truck-picture-div"><img class="truck-picture-img" src="img/buggy.png" id="img3" onclick="highlight3()" onmouseover="showdiv3()" onmouseout="hiddendiv3()"><br><br>小货车<div class="hidden-div" id="show3">载重:1吨长宽高:2.7*1.5*1.7载货体积:6.9方</div></div>
    		<div class="truck-picture-div"><img class="truck-picture-img" src="img/medium_truck.png" id="img4" onclick="highlight4()" onmouseover="showdiv4()" onmouseout="hiddendiv4()"><br><br>中货车<div class="hidden-div" id="show4">载重:1.8吨<br>长宽高:4.2*1.8*1.8<br>载货体积:13.6方</div></div>
    		<br><br><br><br><br><br><br><br><hr>
    	</div>
    </div> <br><br><br>
    <div id="info">运货信息<hr></div><br>
    
    <table id="showinfo">
    	<tr height="350px">
    		<td width="600px">
    			<div class="smalldiv">
    				<div class="tabel">货物类型（必选）</div>
    				<div class="input-div">
    					<select class="select">
    						<option>普通货物</option>
    						<option>特种货物</option>
    						<option>轻泡货物</option>
    					</select>
    				
    				</div>
    			</div><hr>
    			<div class="smalldiv">
    				<div class="tabel">始发地（必填）</div>
    				<div class="input-div"><input type="text" class="input-value" placeholder="按此输入起点"></div>
    			</div><hr>
    			<div class="smalldiv">
    				<div class="tabel">目的地（必填）</div>
    				<div class="input-div"><input type="text" class="input-value" placeholder="按此输入目的地"></div>
    			</div><hr>
    			<div class="smalldiv">
    				<div class="tabel">出发时间（必填）</div>
    				<div class="input-div"><input type="date" class="input-value" placeholder="按此输入出发时间"></div>
    			</div><hr>
    			<div class="smalldiv">
    				<div class="tabel">货物重量（选填）</div>
    				<div class="input-div"><input type="text" class="input-value" placeholder="按此输入重量"></div>
    			</div><hr>
    		</td>
    		<td width="400px">
    			<div id="receiver">收货人资料（必填）</div>
    			<div id="include-div">
    				<div class="info-div">
    					<div style="float:left"><img src="img/linkpeople.jpg" class="logo-img"></div>
    					<div style="float:left"><input type="text" class="input-info" placeholder="联系人称呼"></div>
    				</div>
    				<div class="info-div">
    					<div style="float:left"><img src="img/telephone.jpg" class="logo-img"></div>
    					<div style="float:left"><input type="text" class="input-info" placeholder="联系人电话"></div>
    				</div>
    			</div>
    			<div id="button-div">
    				<div class="foot"><button class="button2">发布需求</button></div>
    				<div class="foot"><button class="button2">查找匹配</button></div>
    			</div>
    		</td>
    	</tr>
    </table>
    <br><br><br>
    <jsp:include page="foot.html"></jsp:include>
  </body>
</html>
