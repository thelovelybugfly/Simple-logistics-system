function getCode(){
	document.getElementById("vercodepicture").src="getcheckcode.action?a="+Math.random();
}
getCode();
function login(){
	$.ajax({
		url:"login.action",
		type:"post",
		dataType:"json",
		data:{
			account:$("#account").val(),
			passWord:$("#passWord").val(),
			checkCode:$("#checkCode").val(),
		},
		success:function(data){
			$("#result").html("");
			if(data=="用户登录成功"){
				$(location).attr("href","jsp/homeForUser.jsp");
			}else if(data=="司机登录成功"){
				$(location).attr("href","jsp/homeForDriver.jsp");
			}else if(data=="管理员登录成功"){
				$(location).attr("href","jsp/showAllCredentials.jsp");
			}else{
				$("#result").html(data);
				getCode();
			}
		}
	});
}