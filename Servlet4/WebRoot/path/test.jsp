<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   <%--<base href="<%=basePath%>"> --%> 
   <base href="<%=basePath%>">
   <% 
        out.print(basePath); %>
    
    <title>My JSP 'test.jsp' starting page</title>
    
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
  
    
<h3>绝对路径 包含协议和ip地址和端口号和访问路径</h3>
<a href="http://127.0.0.1:8888/Servlet4/path/sub.jsp">同一个项目同一个文件夹同一级文件sub.jsp</a></br>
<a href="http://127.0.0.1:8888/Servlet4/path/path2/add.jsp">同一个项目下一级文件夹中文件path1/path2/add.jsp</a></br>
<a href="http://127.0.0.1:8888/Servlet4/path3/update.jsp">同一个项目同级文件夹下的文件path3/update.jsp</a></br>
<a href="http://127.0.0.1:8888/Servlet4/index.jsp">同一个项目上级文件夹中文件</a></br>
<a href="http://127.0.0.1:8888/Servlet1/admin/login.jsp">不同项目下的文件</a></br>
<a href="">不同服务器中的文件 （局域网）</a></br>
<a href="http://www.baidu.com">访问外网的文件 （百度）</a></br>
<h3>根路径           以/开始 （没有IP地址 没有协议）根路径的范围是当前服务器的所有项目         （访问的上下文的路径      web）（/代表当前服务器的路径）</h3>
<a href="/Servlet4/path/sub.jsp">同一个项目同一个文件夹同一级文件sub.jsp</a></br>
<a href="/Servlet4/path/path2/add.jsp">同一个项目下一级文件夹中文件path1/path2/add.jsp</a></br>
<a href="/Servlet4/path3/update.jsp">同一个项目同级文件夹下的文件path3/update.jsp</a></br>
<a href="/Servlet4/index.jsp">同一个项目上级文件夹中文件</a></br>
<a href="/Servlet1/admin/login.jsp">不同项目下的文件</a></br>
<a href="这里不能省略">不同服务器中的文件 （局域网）</a></br>

<h3>相对路径1 相对于本身的  当前服务器的所有项目 </h3>
<a href="sub.jsp">同一个项目同一个文件夹同一级文件sub.jsp</a></br>
<a href="path2/add.jsp">同一个项目下一级文件夹中文件path1/path2/add.jsp</a></br>
<a href="../path3/update.jsp">同一个项目同级文件夹下的文件path3/update.jsp</a></br>
<a href="../index.jsp">同一个项目上级文件夹中文件</a></br>
<a href="../../Servlet1/admin/login.jsp">不同项目下的文件 (相当于在webroot下建了一个Servlet1文件夹)</a></br>




<h3>相对路径2  相对于base标签</h3>
<a href="path/sub.jsp">同一个项目同一个文件夹同一级文件sub.jsp</a></br>
<a href="path/path2/add.jsp">同一个项目下一级文件夹中文件path1/path2/add.jsp</a></br>
<a href="path3/update.jsp">同一个项目同级文件夹下的文件path3/update.jsp</a></br>
<a href="index.jsp">同一个项目上级文件夹中文件</a></br>
<a href="/Servlet1/admin/login.jsp">不同项目下的文件</a></br>

  </body>
</html>
