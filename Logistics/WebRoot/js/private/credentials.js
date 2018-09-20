function showAllCredentials(thisPage){
	$.ajax({
		url:"showAllCredentials.action",
		type:"post",
		dataType:"json",
		data:{
			pageForJSP:thisPage,
		},
		success:function(data){
			$("#context").html("");
			var totalPage = data.totalPage;
			var credentialsList = data.credentialsBeans;
			var licenseState = "";
			var driveringState = "";
			var carInfoState = "";
			for (var i = 0; i < credentialsList.length; i++) {
				var credentials = credentialsList[i];
				if(credentials.licenseFront!=null && credentials.licenseBack!=null){
					licenseState = "已上传";
				}
				if(credentials.driveringFront!=null && credentials.driveringBack!=null){
					driveringState = "已上传";
				}
				if(credentials.truckBean!=null){
					carInfoState = "已上传";
				}
				var htmlStr = "<div id='context-info' class='context-info'>" +
									"<div id='context-order' class='order'>"+ (i+1) +"</div>" +
									"<div class='number' id='context-number'>"+credentials.id+"</div>" +
									"<div id='context-name' class='name'>"+credentials.driverBean.realName+"</div>" +
									"<div id='context-license' class='license'>"+licenseState+"</div>" +
									"<div id='context-drivering' class='drivering'>"+driveringState+"</div>" +
									"<div id='context-car-info' class='info'>"+carInfoState+"</div>" +
									"<div id='context-state' class='state'>"+credentials.state+"</div>" +
									"<div id='context-manage' class='manage' onclick='checkDriver()'>"+"通过审核"+"</div>" +
							  "</div>";
				$("#context").append(htmlStr);
				alert(htmlStr);
			}
			
			$("#allPage").append(totalPage);
			
		}
	});
}

showAllCredentials(1);

function checkDriver(){
	$.ajax({
		url:"checkDriver.action",
		type:"post",
		dataType:"json",
		data:{
			realName:name,
		},
		success:function(data){
			
		}
	});
}