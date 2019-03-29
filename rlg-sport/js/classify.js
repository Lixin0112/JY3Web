$(function(){
	$("body").html("<div id='search'></div><div id='index'></div><div id='goods'></div>");
	
	$("#search").append("<input id='write' type='search'/><input id='click' type='submit' value='搜索'>")
	$("#index").append("<ul>"
	+"<li><a id='p-1' href='classify-n/p-1.html' target='goto'><img src='http://pp0gijgoa.bkt.clouddn.com/%E8%B7%91%E6%AD%A5%E6%9C%BA%20%281%29.svg'/>跑步机</a></li>"
	+"<li><a id='p-2' href='classify-n/p-2.html' target='goto'><img src='http://pp0gijgoa.bkt.clouddn.com/%E5%8A%A8%E6%84%9F%E5%8D%95%E8%BD%A6.svg'/>动感单车</a></li>"
	+"<li><a id='p-3' href='classify-n/p-3.html' target='goto'><img src='http://pp0gijgoa.bkt.clouddn.com/%E8%82%8C%E8%82%89.svg'/>肌肉训练</a></li>"
	+"<li><a id='p-4' href='classify-n/p-4.html' target='goto'><img src='http://pp0gijgoa.bkt.clouddn.com/%E5%93%91%E9%93%83.svg'/>哑铃</a></li>"
	+"<li><a id='p-5' href='classify-n/p-5.html' target='goto'><img src='http://pp0gijgoa.bkt.clouddn.com/%E7%91%9C%E4%BC%BD.svg'/>瑜伽运动</a></li>"
	+"<li><a id='p-6' href='classify-n/p-6.html' target='goto'><img src='http://pp0gijgoa.bkt.clouddn.com/%E5%A8%B1%E4%B9%90-%E6%B8%B8%E6%B3%B3.svg'/>泳具</a></li>"
	+"<li><a id='p-7' href='classify-n/p-7.html' target='goto'><img src='http://pp0gijgoa.bkt.clouddn.com/%E9%98%B2%E6%8A%A4%E6%9C%8D.svg'/>护具装备</a></li></ul>")
	$("#goods").append("<iframe src='classify-n/p-1.html' name='goto'></iframe>")
})
