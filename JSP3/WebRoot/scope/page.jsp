<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    
    <title>My JSP 'page.jsp' starting page</title>
    
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
   <% 
       pageContext.setAttribute("name", "haibo");
        
        
        
        
         %>
         page1:<%= pageContext.getAttribute("name") %>
         
         <%@include file="page2.jsp" %>  <!-- 静态包含 -->
         <jsp:include page="page2.jsp"></jsp:include> <!-- 动态包含  得不到 -->
  </body>
</html>
