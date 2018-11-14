<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'jspzhishidian.jsp' starting page</title>
    
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
  <!-- 
    1.静态内容  html静态文本
    2. 小脚本   <% java  代码   %>
    3.表达式  <%=表达式   %>
    4.声明<%!   %>
    5.jsp标签       指令标签  动作标签
    6.动态网页可以进行数据交互  html属于静态网页
    静态网页访问速度较快，常用的动态网页技术  jsp asp/asp.net PHP
    7.理解b/s 和c/s  模式   
     B  浏览器   S   服务器
     B/S的优点  只需要开发一个服务器端的程序  ，后期维护性较好   用户体验效果不及CS
     C  客户端    S   服务器
     C/S的优点     和用户交互较好   
     8.常用的服务器  
       Tomcat  支持jsp servlet
       Jboss   EJB    
       Websphere/weblogic  商业   jsp servlet   
    
    
  
   -->
    This is my JSP page. <br>
  </body>
</html>
