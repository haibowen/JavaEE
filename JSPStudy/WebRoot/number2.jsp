<%@page import="haibowen.Show"%>
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
  <!--   指令标识  taglib include page   静态包含-->
  <%@ include file="head.jsp" %> 
  
  <!--   动作标识  jsp：forward   动态包含  -->
  <jsp:include page="head.jsp"></jsp:include>
  <br/>
  <!--  声明式 -->
   <%!
      int nu =0;
   
    %>
   <!-- 小脚本中 的变量是局部变量 -->
   <%
      
      nu++;
      out.print("你是第"+nu+"访问该网站的人"); %>
    
     
     <jsp:include page="foot.jsp" ></jsp:include> 
     <% 
         Show sh=new Show();
         sh.a();           %>
  </body>
</html>
  <!--
  两种包含的区别   
  1.动态包含相当于方法的调用，静态包含是复制页面
  2.动态包含产生java文件，静态的不会产生。
  3.动态包含可以有同名的变量，静态包含不可以
  4.产生的时机不同  动态包含在第三个阶段产生，静态包含在第一个阶段产生          转译 -编译-解释执行
  
     
 -->
