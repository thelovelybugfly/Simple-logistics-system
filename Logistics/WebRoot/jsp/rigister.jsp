<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="en">
<head>
	<base href="<%=basePath%>">
    <link href="css/rigister.css" type="text/css" rel="stylesheet"/>
    <meta charset="UTF-8">
    <title>注册</title>
</head>
<body>
<div class="loginout2">
    <div class="loginlogo">
        <div class="logo"><img src="img/1.png"/></div>
    </div>

    <div class="logininputout">
        <div class="logininputleft">手机号码：</div>
        <input type="text" id="phonecode"/>
        <div class="logininputright"></div>
    </div>

    <div class="partition"></div>

    <div class="logininputout">
        <div class="logininputleft">密码：</div>
        <input type="text" id="password"/>
        <div class="logininputright"></div>
    </div>

    <div class="partition"></div>

    <div class="logininputout">
        <div class="logininputleft">确认密码：</div>
        <input type="text" id="repassword"/>
        <div class="logininputright"></div>
    </div>

    <div class="partition"></div>

    <div class="logininputout">
        <div class="logininputleft">姓名：</div>
        <input type="text" id="relName"/>
        <div class="logininputright"></div>
    </div>


    <div class="partition"></div>

    <div class="logininputout">
        <div class="logininputleft">身份证号码：</div>
        <input type="text" id="phonenumber"/>
        <div class="logininputright"></div>
    </div>

    <div class="partition"></div>

    <div class="logininputout">
        <div class="logininputleft">性别：</div>
        <select class="otherinput" id="sexs">
            <option value="volvo">男</option>
            <option value="saab">女</option>
        </select>
        <input class="otherinput2"/>
        <div class="logininputright"></div>
    </div>

    <div class="partition"></div>

    <div class="verification">
        <div class="verificationleft" onclick="getCode()">获取短信验证</div>
        <input type="text" class="verificationinput" id="checkCode"/>
        <div class="verificationimage" id="outtime">0</div>
    </div>

    <div class="loginbuttonout">
        <div class="loginbuttonleft" onclick="rigiste()">注册</div>
        <div class="loginbuttonright" id="resultmsg"></div>
    </div>

    <div class="backout">
        <div class="backindex"><a href="jsp/login.jsp">跳转登录</a></div>
    </div>

</div>
    <script type="text/javascript" src="js/private/registe.js"></script>
    <script type="text/javascript" src="js/public/jquery.1.9.1.js"></script>
</body>
</html>
