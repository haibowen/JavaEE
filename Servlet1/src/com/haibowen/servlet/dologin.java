package com.haibowen.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class dologin extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
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
	
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
	}

}
