<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>添加评论</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="css/add_talk.css">
	

  </head>
  
  <body>
   <div id="head">
    <div id="logo"><img src="img/1.png" style="width:80px;height:80px;"></div>
    <div id="option">
        <div class="option1"><a href="jsp/homeForUser.jsp">主页</a></div>
        <div class="option1"><a href="#">发布需求</a></div>
        <div class="option1"><a href="#">订单管理</a></div>
        <div class="option1"><a href="#">评价查看</a></div>
        <div class="option1"><a href="#">站内消息</a></div>
        <div class="option1"><a href="#">账户查询</a></div>
        <div class="option1"><a href="#">关于我们</a></div>
        <div class="option1"><a href="#">退出</a></div>
    </div>
</div>
<div id="main">
    <div id="show_title">评论大厅</div>
    <div id="show_context">
        <form action="addtalk.action" method="post">
        <div id="title">请输入评论：</div>
        <textarea id="input_context"name="text"> </textarea>
        <input id="submit" type="submit" value="提交评论">
        </form>
    </div>

</div>
<div id="footer">
    <div class="about">公司地址：北京市南云路远威大厦</div>
    <div class="about">联系电话：010-90909090</div>
    <div class="about">公司邮箱：lahuola@163.com</div>
    <div>拉貨啦公司版权所有-京ICP备10046444-<img alt="" src="img/ghs.png"
        style="width:20px;height:20px;">京公网安备11010802020134号-京ICP证110507号
    </div>
</div>
  </body>
</html>
