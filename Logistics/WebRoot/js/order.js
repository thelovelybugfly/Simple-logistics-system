document.getElementById("logo1").innerHTML = "<img src='img/zq1.png' id='show1'>";
document.getElementById("logo2").innerHTML = "<img src='img/zq2.png' id='show2'>";
document.getElementById("logo3").innerHTML = "<img src='img/zq3.png' id='show3'>";

function openmap() {
	var mapdiv = document.getElementById('allmap');
	mapdiv.innerHTML = "<iframe id='baidumappage' src='jsp/test.html'></iframe>";
}

function changeColor(num) {
	for (var i = 1; i <= 3; i++) {
		var str = document.getElementById('header-native-' + i);
		if (i == num) {
			str.style.borderTop = "4px solid #f60";
		} else {
			str.style.borderTop = "0px solid #ffffff";
		}
	}
}

// function changeImg(num){
// for(var i=1;i<=3;i++){
// var str = document.getElementById('logo'+i);
// if(i=num){
// str.style.src="img/driver.png";
// }
// }
// }
// changeImg(2);

/**
 * 点击改变左侧栏的图片
 */
function changeImages(num) {
	for (var i = 1; i <= 3; i++) {
		var a = document.getElementById('show' + i);// 获取目标Id
		var str = document.getElementById('a' + i);
		if (i == num) {
			a.src = "img/zq" + i + "-active.png";// 替换位置
			str.style.color = '#f60f60';
		} else {
			a.src = "img/zq" + i + ".png";
			str.style.color = "#666666"
		}
	}

}
/**
 * 司机查询正在进行的订单
 */
function showInOrder(index) {
	var json = {
		"status" : index
	};	
			$.ajax({
				url : "/Trucks-trunk/orderByDriver.action",
				method : "post",
				async : true,
				dataType : "json",
				contentType : "application/json;charset=utf-8",
				data : JSON.stringify(json),
				success : function(data) {
					var list = data.list;
					console.log(list);
					$("#order").html("");
					if (index == 2) {
						console.log("1");
						for (var i = 0; i < list.length; i++) {
							var $goods = $("<div style='width:100%;height:20px'><div id='status' style='display:none'>"+list[i].status+"</div>"+
									"<div class='orderinfo,order1' style='width:10%;float:left'>"
									+ "正在运输"
									+ "</div>"
									+ "<div id='orderid"
									+ i
									+ "' class='order2,orderinfo' style='width:10%;float:left'>"
									+ list[i].id
									+ "</div>"
									+ "<div class='order3,orderinfo' style='width:20%;float:left'>"
									+ list[i].time
									+ "</div>"
									+ "<div class='order4,orderinfo'style='width:20%;float:left'>"
									+ list[i].driverBean.name
									+ "</div>"
									+ "<div class='order5,orderinfo'style='width:10%;float:left'>"
									+ list[i].userRequirementBean.cost
									+ "</div>"
									+ "<div class='order6,orderinfo' style='width:25%;float:left'> <button style='z-index=2' onclick='makeOrder("
									+ i + ")'>确认订单</button></div></div>"+
									" <div class='demo'><span id='button'"+
										"onclick='openDialog(),openmap()'>打开地图</span><div class='demo-bg'></div><div class='demo-txt' id='test'><div id='allmap'></div><button id='btn' onclick='closeDialog()'>关闭地图</button></div></div>"
							);
							$("#order").append($goods);
						}
					}
					else if(index<=2){
						for (var i = 0; i < list.length; i++) {
							var $goods = $(
									"<div style='width:100%'><div class='orderinfo,order1' style='width:10%;float:left'>"
									+ "已完成"
									+ "</div>"
									+ "<div id='orderid"
									+ i
									+ "' class='order2,orderinfo' style='width:10%;float:left'>"
									+ list[i].id
									+ "</div>"
									+ "<div class='order3,orderinfo' style='width:20%;float:left'>"
									+ list[i].time
									+ "</div>"
									+ "<div class='order4,orderinfo'style='width:20%;float:left'>"
									+ list[i].driverBean.name
									+ "</div>"
									+ "<div class='order5,orderinfo'style='width:35%;float:left'>"
									+ list[i].userRequirementBean.cost
									+ "</div></div>");
							$("#order").append($goods);
						}
					}
				}

			});
}
/**
 * 确认订单已到达，然后查询正在进行的订单。
 * 
 * @param
 */
function makeOrder(i) {
	var json = {
		"id" : $("#orderid" + i).text(),
		"status":$("#status").text()
	};
	console.log(json);
	$
			.ajax({
				url : "/Trucks-trunk/orderChange.action",
				method : "post",
				async : true,
				dataType : "json",
				contentType : "application/json;charset=utf-8",
				data : JSON.stringify(json),

				success : function(data) {
					console.log(data)
					var list = data.list;
					console.log(data.list)
					console.log(data.list[0]);
					$("#order").html("");
					for (var i = 0; i < list.length; i++) {
						var $goods = $(

						"<div style='width:100%'><div class='orderinfo,order1' style='width:10%;float:left'>"
								+ list[i].status
								+ "</div>"
								+ "<div id='orderid"
								+ i
								+ "' class='order2,orderinfo' style='width:10%;float:left'>"
								+ list[i].id
								+ "</div>"
								+ "<div class='order3,orderinfo' style='width:20%;float:left'>"
								+ list[i].time
								+ "</div>"
								+ "<div class='order4,orderinfo'style='width:20%;float:left'>"
								+ list[i].driverBean.name
								+ "</div>"
								+ "<div class='order5,orderinfo'style='width:10%;float:left'>"
								+ list[i].userRequirementBean.cost
								+ "</div>"
								+ "<div class='order6,orderinfo' style='width:25%;float:left'> <button onclick='makeOrder("
								+ i + ")'>确认订单</button></div></div>");
						$("#order").append($goods);
					}
				}

			});
}
/**
 * 查询已经完成了的订单
 */
function completedOrder() {

}
// 打开窗口
var demobg = document.querySelector(".demo-bg");
var demotxt = document.querySelector(".demo-txt");
function openDialog() {	 
	$(".demo-bg").show();
	$(".demo-txt").show();
}

function closeDialog() {
	 $(".demo-bg").hide();
	 $(".demo-txt").hide(); 
	
}
/**
 * 用户订单查询
*/
function showInOrderByUser(index) {
	var json = {
		"status" : index
	};	
			$.ajax({
				url : "/Trucks-trunk/orderByUser.action",
				method : "post",
				async : true,
				dataType : "json",
				contentType : "application/json;charset=utf-8",
				data : JSON.stringify(json),
				success : function(data) {
					var list = data.list;
					console.log(list);
					$("#order").html("");
					if (index >= 1) {
						console.log("1");
						for (var i = 0; i < list.length; i++) {
							var $goods = $("<div style='width:100%;height:20px'><div id='status' style='display:none'>"+list[i].status+"</div>"+
									"<div class='orderinfo,order1' style='width:10%;float:left'>"
									+ "正在运输"
									+ "</div>"
									+ "<div id='orderid"
									+ i
									+ "' class='order2,orderinfo' style='width:10%;float:left'>"
									+ list[i].id
									+ "</div>"
									+ "<div class='order3,orderinfo' style='width:20%;float:left'>"
									+ list[i].time
									+ "</div>"
									+ "<div class='order4,orderinfo'style='width:20%;float:left'>"
									+ list[i].driverBean.name
									+ "</div>"
									+ "<div class='order5,orderinfo'style='width:10%;float:left'>"
									+ list[i].userRequirementBean.cost
									+ "</div>"
									+ "<div class='order6,orderinfo' style='width:25%;float:left'> <button style='z-index=2' onclick='makeOrder("
									+ i + ")'>确认订单</button></div></div>"+
									" <div class='demo'><span id='button'"+
										"onclick='openDialog(),openmap()'>打开地图</span><div class='demo-bg'></div><div class='demo-txt' id='test'><div id='allmap'></div><button id='btn' onclick='closeDialog()'>关闭地图</button></div></div>"
							);
							$("#order").append($goods);
						}
					}
					else if(index<1){
						for (var i = 0; i < list.length; i++) {
							var $goods = $(
									"<div style='width:100%'><div class='orderinfo,order1' style='width:10%;float:left'>"
									+ "已完成"
									+ "</div>"
									+ "<div id='orderid"
									+ i
									+ "' class='order2,orderinfo' style='width:10%;float:left'>"
									+ list[i].id
									+ "</div>"
									+ "<div class='order3,orderinfo' style='width:20%;float:left'>"
									+ list[i].time
									+ "</div>"
									+ "<div class='order4,orderinfo'style='width:20%;float:left'>"
									+ list[i].driverBean.name
									+ "</div>"
									+ "<div class='order5,orderinfo'style='width:35%;float:left'>"
									+ list[i].userRequirementBean.cost
									+ "</div></div>");
							$("#order").append($goods);
						}
					}
				}

			});
}