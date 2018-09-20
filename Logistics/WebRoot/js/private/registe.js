function counttime(){
	var a=$("#outtime").html();
	var b=parseInt(a)-1;
	$("#outtime").html(b);
	if(b<0){
		$("#outtime").html(0);
		return;
	}
	setTimeout(counttime, 1000);
}
function getCode(){
	var a=$("#outtime").html();
	
	if(a!="0"){
		$("#resultmsg").html("5分钟后才能重新获取验证吗");
		return ;
	}
	$.ajax({
		url:"getCode.action",
		type:"post",
		dataType:"json",
		data:{
			phone:$("#phonecode").val(),
		},
		success:function(data){
			if(data=="成功"){
				$("#outtime").html("300");
				counttime();
			}else{
				$("#resultmsg").html(data);
			}
		}
	});
}
function rigiste(){
	$.ajax({
		url:"registe.action",
		type:"post",
		dataType:"json",
		data:{
			name:$("#phonecode").val(),
			pass:$("#password").val(),
			realName:$("#relName").val(),
			idNumber:$("#phonenumber").val(),
			sex:$("#sexs option:selected").text(),
			passConfirm:$("#repassword").val(),
			checkCode:$("#checkCode").val(),
		},
		success:function(data){
			if(data=="成功"){
				$(location).attr("href","jsp/login.jsp");
			}else{
				$("#resultmsg").html(data);
			}
			
		}
	});
}