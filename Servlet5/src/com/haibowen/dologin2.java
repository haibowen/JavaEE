package com.haibowen;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/servlet/dologin2")
public class dologin2 extends HttpServlet {
	
	/**
	 * 1.浏览器控制的跳转的方式有两种
	 * A url标签 a标签
	 * B 表单
	 * 2.服务器控制的跳转方式有两种  转发重定向
	 * 两者的区别：
	 * 
	 * A语句不同：
	 * 
	 * 
	 * B跳转路径不同
	 * 转发是 转发前的路径
	 * 重定向是跳转后的路径
	 * 
	 * C获得值
	 * 转发可以获得传过来的值
	 * 重定向不可以
	 * 
	 * D原理不同
	 * 转发没有产生新的请求  浏览器不知情  主要在服务器 端
	 * 由于是同一个请求 所以可以得到传送的值，由于转发的操作对浏览器不可知 所以地址不变 是服务器内部的跳转
	 * 
	 * 登录成功  重定向浏览器知情，地址会变
	 * 
	 * 
	 * 
	 */
	
  
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		  String zh=request.getParameter("zh");  
		  String na=request.getParameter("mm"); 		  
		   //服务器的验证
		  
		  if("".equals(zh)||zh==null){
			  request.setAttribute("mag","账号不能为空(服务器)" );
			  //转发
			  request.getRequestDispatcher("/admin2/login.jsp").forward(request,response);
			  
			  return;
		  }
		  
		  
		  
		  
		  //验证
		   boolean t=false;
		   //注意空指针
		  if("111".equals(zh)&&"222".equals(na)){
		  
		     t=true;  
		     System.out.println("我执行了");
		  } 
		  //响应
		  //登录成功或失败 应该跳转界面
		  if(t){
		 // out.print("登陆成功"); 
			  //转发
			  request.setAttribute("ma", zh);
		  //request.getRequestDispatcher("/admin2/OK.jsp").forward(request, response); 
			 
			  //重定向的方式
			  response.sendRedirect("/Servlet5/admin2/OK.jsp");
		  }else{
		  //out.print("登录失败"); 
			  request.setAttribute("ma", "登录失败");
		   request.getRequestDispatcher("/admin2/login.jsp").forward(request, response); 
		  }  
	
	}
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 
	}

}

