<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'show_talk.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	<link rel="stylesheet" type="text/css" href="css/show_talk.css">
	

  </head>
  
  <body>
   <div id="head">
    <div id="logo"><img src="img/1.png" style="width:80px;height:80px;"></div>
    <div id="option">
        <div class="option1"><a href="jsp/homeForUser.jsp">主页</a></div>
        <div class="option1"><a href="#">发布需求</a></div>
        <div class="option1"><a href="#">订单管理</a></div>
        <div class="option1"><a href="showtalk.action">评价查看</a></div>
        <div class="option1"><a href="#">站内消息</a></div>
        <div class="option1"><a href="#">账户查询</a></div>
        <div class="option1"><a href="#">关于我们</a></div>
        <div class="option1"><a href="#">退出</a></div>
    </div>
</div>
<div id="main">
    <div id="show_title">评论大厅</div>
    <div id="show_context">
    <table id="table_p">
     <tr>
        <th class="th1">评论人</th>
        <th  class="show">评论内容</th>
        <th  class="th2">评论时间</th>
      </tr>
        <!-- 获取到服务器数据，动态显示 -->
    	<tbody>
    		 <c:forEach items="${list }" var="obj">
    			<tr>
    				<td class="th1">${obj.pname}</td>
    				<td class="show">${obj.text }</td>
    				<td class="th2">${obj.date }</td>
    			</tr>
    		</c:forEach> 
    	</tbody>
    </table>
    </div>
    <div id="add_context" ><a href="addtalk.action">添加评论</a></div>
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
