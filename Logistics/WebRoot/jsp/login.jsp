<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="en">
<head>
	<base href="<%=basePath%>">
    <link href="css/login.css" type="text/css" rel="stylesheet"/>
    <meta charset="UTF-8">
    <title>登录</title>
</head>
<body>
    <div class="loginout">
        <div class="loginlogo">
            <div class="logo"><img src="img/1.png"/></div>
        </div>

        <div class="logininputout">
            <div class="logininputleft">账号：</div>
            <input type="text"  id="account"/>
            <div class="logininputright"></div>
        </div>

        <div class="partition"></div>

        <div class="logininputout">
            <div class="logininputleft">密码：</div>
            <input type="text" id="passWord"/>
            <div class="logininputright"></div>
        </div>

        <div class="partition"></div>

        <div class="verification">
            <div class="verificationleft">验证码：</div>
            <div class="verificationright"><input type="text" id="checkCode"/></div>
            <div class="verificationimage" onclick="getCode()"><img id="vercodepicture"></div>
        </div>

        <div class="loginbuttonout">
            <div class="loginbuttonleft" onclick="login()">登录</div>
            <div class="loginbuttonright" id="result"></div>
        </div>

        <div class="backout">
            <div class="backindex"><a href="jsp/rigister.jsp">注册账号</a></div>
            <div class="backindex"><a href="jsp/home.jsp">返回主页</a></div>
        </div>

    </div>
    <script type="text/javascript" src="js/private/login.js"></script>
    <script type="text/javascript" src="js/public/jquery.1.9.1.js"></script>
</body>
</html>
