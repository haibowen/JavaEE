package com.haibowen.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 // 继承httpservlet
public class servlet1 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		//super.doGet();  底层是一个异常方法，不要调用父类的方法
		// 解决中文乱码  需要放在对象定义 调用之前进行调用   位于代码的第一行
		resp.setContentType("text/html; charset=utf-8"); 
		//
		PrintWriter out= resp.getWriter();
		
	   out.print("<html>");
	   out.print("<h1>");
	   out.print("hello servlet");
	   out.print("你好");
	   out.print("</h1>");
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		     this.doGet(req, resp);
	}

}
