package com.haibowen.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 // �̳�httpservlet
public class servlet1 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		//super.doGet();  �ײ���һ���쳣��������Ҫ���ø���ķ���
		// �����������  ��Ҫ���ڶ����� ����֮ǰ���е���   λ�ڴ���ĵ�һ��
		resp.setContentType("text/html; charset=utf-8"); 
		//
		PrintWriter out= resp.getWriter();
		
	   out.print("<html>");
	   out.print("<h1>");
	   out.print("hello servlet");
	   out.print("���");
	   out.print("</h1>");
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		     this.doGet(req, resp);
	}

}
