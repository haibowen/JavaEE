<%@page import="java.net.URLDecoder"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  
   
   
   <%
    //1.获得所有cookie 
   Cookie[]a= request.getCookies(); 
   String zh="";
   String mm="";
   String che="";
   if(a!=null){
   for(int i=0;i<a.length;i++){
   
   if("zh".equals(a[i].getName())){
   
      zh= a[i].getValue();
      
     zh= URLDecoder.decode(zh,"utf-8");
      che="checked";
   
   }if("mm".equals(a[i].getName())){
      mm= a[i].getValue();
   
   }
   
    }
    
    }
   
    %>
  </head>
  
  <body>
    <h3>用户登录</h3>
    
    <form action ="servlet/dologin2"  method="get">
    账号：<input type="text"   name="zh" value=<%=zh %>  > </br>    
     密码：<input type="password" name="mm" value=<%=mm %> ></br>
  记住密码：<input   type="checkbox" name="ch" value="yes" <%=che %>><br/>   
  <input type="submit"value ="提交"/>  
    
    </form>
  </body>
</html>
