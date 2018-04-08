package com.haibowen;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/servlet/servlet1")
public class Servlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Enumeration<String> headerNames = req.getHeaderNames();
		while(headerNames.hasMoreElements()){
			String a=headerNames.nextElement();
			System.out.println(a);
		}
		
		//具体的头信息
		System.out.println(req.getHeader("user-agent"));
		//获取url信息
		//获取前台的值  一个  或多个
		String b=req.getParameter("zh");
		String [] c=req.getParameterValues("爱好");
		//getAttribute()  setAttribute()  方法是配对的  不能混用
		req.setAttribute("n", "hello");
		
	  String d= (String)req.getAttribute("n");
	  System.out.println(d);
	// cookie  session
	Cookie[] cookies = req.getCookies();
	HttpSession session = req.getSession();
	//路径跳转
	req.getRequestDispatcher("").forward(req,resp);
		//解决乱码
	req.setCharacterEncoding("utf-8");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
	}

}
