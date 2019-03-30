$(function(){
	$("#nav-bar").html(
	"<img id='rlg' src='http://pp0gijgoa.bkt.clouddn.com/rlg-logo.png' />"+
	"<ul><li id='li-1'><a href='home-page.html' target='go'>首页</a></li>"+
	"<li id='li-2'><a href='classify.html' target='go'>商品分类</a></li>"+
	"<li id='li-3'><a href='me.html' target='go'>我</a></li>"+
	"<li id='li-4'><a href='shopping-cart.html' target='go'>购物车</a></li></ul>"
	)
	$("#li-1").click(function(){
		$("#li-1").css("background-color","#FF9933");
		$("#li-2").css("background-color","white");
		$("#li-3").css("background-color","white");
		$("#li-4").css("background-color","white");
	})
	$("#li-2").click(function(){
		$("#li-2").css("background-color","#FF9933");
		$("#li-1").css("background-color","white");
		$("#li-3").css("background-color","white");
		$("#li-4").css("background-color","white");
	})
	$("#li-3").click(function(){
		$("#li-3").css("background-color","#FF9933");
		$("#li-2").css("background-color","white");
		$("#li-1").css("background-color","white");
		$("#li-4").css("background-color","white");
	})
	$("#li-4").click(function(){
		$("#li-4").css("background-color","#FF9933");
		$("#li-2").css("background-color","white");
		$("#li-3").css("background-color","white");
		$("#li-1").css("background-color","white");
	})
})	