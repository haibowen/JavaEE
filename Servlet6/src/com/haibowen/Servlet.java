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
		
		//�����ͷ��Ϣ
		System.out.println(req.getHeader("user-agent"));
		//��ȡurl��Ϣ
		//��ȡǰ̨��ֵ  һ��  ����
		String b=req.getParameter("zh");
		String [] c=req.getParameterValues("����");
		//getAttribute()  setAttribute()  ��������Ե�  ���ܻ���
		req.setAttribute("n", "hello");
		
	  String d= (String)req.getAttribute("n");
	  System.out.println(d);
	// cookie  session
	Cookie[] cookies = req.getCookies();
	HttpSession session = req.getSession();
	//·����ת
	req.getRequestDispatcher("").forward(req,resp);
		//�������
	req.setCharacterEncoding("utf-8");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
	}

}
