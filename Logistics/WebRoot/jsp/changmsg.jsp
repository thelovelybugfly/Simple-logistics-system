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
    <title>修改信息</title>
</head>
<body>
<div class="loginout">
    <div class="loginlogo">
        <div class="logo"><img src="img/1.png"/></div>
    </div>

    <div class="logininputout">
        <div class="logininputleft">账号：</div>
        <input type="text" value="aaaaa" class="nologininput" readonly="readonly"/>
        <div class="logininputright"></div>
    </div>

    <div class="partition"></div>

    <div class="logininputout">
        <div class="logininputleft">新密码：</div>
        <input type="text"/>
        <div class="logininputright"></div>
    </div>

    <div class="partition"></div>

    <div class="logininputout">
        <div class="logininputleft">姓名：</div>
        <input type="text"/>
        <div class="logininputright"></div>
    </div>

    <div class="partition"></div>

    <div class="logininputout">
        <div class="logininputleft">手机号码：</div>
        <input type="text"/>
        <div class="logininputright"></div>
    </div>

    <div class="partition"></div>

    <div class="logininputout">
        <div class="logininputleft">身份证号码：</div>
        <input type="text"/>
        <div class="logininputright"></div>
    </div>

    <div class="partition"></div>

    <div class="logininputout">
        <div class="logininputleft">性别：</div>
        <select class="otherinput">
            <option value="volvo">男</option>
            <option value="saab">女</option>
        </select>
        <input class="otherinput2"/>
        <div class="logininputright"></div>
    </div>

    <div class="partition"></div>

    <div class="loginbuttonout">
        <div class="loginbuttonleft">修改信息</div>
        <div class="loginbuttonright">错误信息显示</div>
    </div>

    <div class="backout">
        <div class="backindex"><a href="index.jsp">返回主页</a></div>
    </div>

</div>
</body>
</html>
