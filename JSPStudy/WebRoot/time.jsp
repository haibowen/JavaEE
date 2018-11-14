<%@page import="javax.xml.crypto.Data"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'time.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script >
	<!--  利用js获得客户端时间-->
	  function a1(){
	  var a=document.getElementById("div1");
	  var  b= new Date();
	  a.innerHTML=b.toLocaleString() ;	  
	  }

	</script>
  </head> 
  <body onload="a1()">
   当前的时间是：<div id="div1"> </div>
   <!-- 小脚本 只书写java代码  获得是服务器的时间 -->
   <p> 当前服务器的时间是<p/>
   <%  
   Date da =new Date();
   //out jsp本身提供的内置对象
   out.print(" 第一种写法："+da.toLocaleString());
    %>
    <br/>
   第二种写法： <%=da.toLocaleString()%>
   <br/>
   <%
    Date dd=new Date();
    out.print("显示小时"+dd.getHours());
     %>
     <br/>
     <% Date ff =new Date();
     out.print("显示分钟"+ff.getMinutes()+ff.getMonth());
     
      %>
      
      <!-- 项目运行不正常
           1.检查项目有没有部署
           2.检查服务器是否启动
           3.项目名称和访问路径有没有写错
           http协议下的端口号 -->
  </body>
</html>
