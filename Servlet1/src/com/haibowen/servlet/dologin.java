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
		  //��֤
		   boolean t=false;
		   //ע���ָ��
		  if("111".equals(zh)&&"222".equals(na)){
		  
		     t=true;  
		  } 
		  //��Ӧ
		  //��¼�ɹ���ʧ�� Ӧ����ת����
		  if(t){
		 // out.print("��½�ɹ�");  
		   request.getRequestDispatcher("/admin/OK.jsp").forward(request, response);   
		  }else{
		  //out.print("��¼ʧ��"); 
		   request.getRequestDispatcher("/admin/login.jsp").forward(request, response); 
		  }  
	
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
	}

}
