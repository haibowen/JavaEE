<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'dologin.jsp' starting page</title>
    
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
  //1.接收前台数据
  //2.比较数据判断是否匹配  调用DAO
  //3.给客户端一个响应
  //request 是内置对象
  //获得前台文本框的内容
  String zh=request.getParameter("zh");  
  String na=request.getParameter("mm"); 
  //验证
   boolean t=false;
   //注意空指针
  if("111".equals(zh)&&"222".equals(na)){
  
     t=true;  
  } 
  //响应
  //登录成功或失败 应该跳转界面
  if(t){
 // out.print("登陆成功");  
   request.getRequestDispatcher("/admin/OK.jsp").forward(request, response);   
  }else{
  //out.print("登录失败"); 
   request.getRequestDispatcher("/admin/login.jsp").forward(request, response); 
  }  
   %>
   <!-- 两种方式向服务器发送请求   1.form表单（get  post）    2.超链接 -->   
  </body>
</html>
