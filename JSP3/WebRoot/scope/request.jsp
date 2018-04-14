<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  
    <title>My JSP 'request.jsp' starting page</title>
    
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
  <% request.setAttribute("name", "haibo");
   %>
   request1 :<%=request.getAttribute("name") %>
  <%@include file="request2.jsp" %>
 <%-- <jsp:include page="request2.jsp"></jsp:include><br>--%> 
 <%-- <% request.getRequestDispatcher("/scope/request2.jsp").forward(request, response); %> --%>
  <%--  <jsp:forward page="/scope/request2.jsp"></jsp:forward>   --%>
    
    <% 
        response.sendRedirect(request.getContextPath()+"/scope/request2.jsp");%>
  </body>
</html>
