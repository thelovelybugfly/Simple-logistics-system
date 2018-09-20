<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="en">
<head>
	<base href="<%=basePath%>">
    <link rel="stylesheet" href="css/authentication.css">
    <meta charset="UTF-8">
    <title>车主认证</title>
</head>
<body>
    <div class="autooutdiv">
        <div class="autotop">车主认证</div>
        <div class="imageout">
            <div class="imageleft">
                <div class="imagetitle">身份证正面</div>
                <div class="imagelefttop">
                    <div class="imagein" id="preview"><img src="img/2.png"/></div>
                </div>
                <div class="imageleftbottom">
                    <input type="file" onchange="preview(this ,'preview')" >
                </div>
            </div>

            <div class="imageleft">
                <div class="imagetitle">身份证反面</div>
                <div class="imagelefttop">
                    <div class="imagein" id="preview2"><img src="img/2.png"/></div>
                </div>
                <div class="imageleftbottom">
                    <input type="file" onchange="preview(this ,'preview2')" >
                </div>
            </div>
        </div>

        <div class="imageout">
            <div class="imageleft">
                <div class="imagetitle">驾驶证正页</div>
                <div class="imagelefttop">
                    <div class="imagein" id="preview3"><img src="img/2.png"/></div>
                </div>
                <div class="imageleftbottom">
                    <input type="file" onchange="preview(this ,'preview3')" >
                </div>
            </div>

            <div class="imageleft">
                <div class="imagetitle">驾驶证副页</div>
                <div class="imagelefttop">
                    <div class="imagein" id="preview4"><img src="img/2.png"/></div>
                </div>
                <div class="imageleftbottom">
                    <input type="file" onchange="preview(this ,'preview4')" >
                </div>
            </div>
        </div>

        <div class="imageout">
            <div class="imageleft">
                <div class="imagetitle">行驶证正面</div>
                <div class="imagelefttop">
                    <div class="imagein" id="preview5"><img src="img/2.png"/></div>
                </div>
                <div class="imageleftbottom">
                    <input type="file" onchange="preview(this ,'preview5')" >
                </div>
            </div>

            <div class="imageleft">
                <div class="imagetitle">行驶证反面</div>
                <div class="imagelefttop">
                    <div class="imagein" id="preview6"><img src="img/2.png"/></div>
                </div>
                <div class="imageleftbottom">
                    <input type="file" onchange="preview(this ,'preview6')" >
                </div>
            </div>
        </div>

        <div class="buttonout">
            <div class="buttonin">提交证件</div>
        </div>
    </div>
    <script type="text/javascript" src="../js/private/authentications.js"></script>
    <script type="text/javascript" src="../js/public/jquery.1.9.1.js"></script>
</body>
</html>
