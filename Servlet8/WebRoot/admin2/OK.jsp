<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
   
    
    <title>My JSP 'OK.jsp' starting page</title>
    
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
                           欢迎<%=session.getAttribute("ma1")%>登录<br>
         SessionID<%=session.getId() %>  <br>
         <a href="admin2/add.jsp">add.jsp</a><br>
         session的最大活动时间
         <%=session.getMaxInactiveInterval( ) %>
         <% session.setMaxInactiveInterval(5); %>
         <hr>
         <a href="servlet/loginout">注销</a>
   
  </body>
</html>
