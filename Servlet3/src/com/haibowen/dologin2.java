package com.haibowen;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/servlet/dologin2")
public class dologin2 extends HttpServlet {
	
  
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		  String zh=request.getParameter("zh");  
		  String na=request.getParameter("mm"); 		  
		   //服务器的验证
		  
		  if("".equals(zh)||zh==null){
			  request.setAttribute("mag","账号不能为空(服务器)" );
			  request.getRequestDispatcher("/admin2/login.jsp").forward(request,response);
			  
			  return;
		  }
		  
		  System.out.println("数据库执行了");
		  
		  
		  //验证
		   boolean t=false;
		   //注意空指针
		  if("海波".equals(zh)&&"222".equals(na)){
		  
		     t=true;  
		  } 
		  //响应
		  //登录成功或失败 应该跳转界面
		  if(t){
		 // out.print("登陆成功");  
		   request.getRequestDispatcher("/admin2/OK.jsp").forward(request, response);   
		  }else{
		  //out.print("登录失败"); 
		   request.getRequestDispatcher("/admin2/login.jsp").forward(request, response); 
		  }  
	
	}
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 
	}

}

