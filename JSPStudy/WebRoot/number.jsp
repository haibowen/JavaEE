<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'number.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <!--  声明式 -->
   <%!
      int nu =0;
   
    %>
   <!-- 小脚本中 的变量是局部变量 -->
   <%
      
      nu++;
      out.print("你是第"+nu+"访问该网站的人"); %>
      <br/>
     <%--<%=nu %> --%> 
     
      
  </body>
</html>
<!-- 小脚本和声明的区别；
1.小脚本中声明的变量是局部的，  在声明中的变量是成员的
2.在小脚本中不可以声明一个方法  在声明式里是可以的 
3.小脚本里可以使用out，内置对象，声明中不行
 -->
 <!-- 
      1.html中的注释方式  <!-- -->
      2.jsp的注释方式  <%-- --%>   安全系数高 推荐使用
      3.java 中的注释  /**  **/      //
      注释方式
     
  -->
