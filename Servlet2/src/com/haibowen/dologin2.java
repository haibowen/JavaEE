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
		   //����������֤
		  
		  if("".equals(zh)||zh==null){
			  request.setAttribute("mag","�˺Ų���Ϊ��(������)" );
			  request.getRequestDispatcher("/admin2/login.jsp").forward(request,response);
			  
			  return;
		  }
		  
		  System.out.println("���ݿ�ִ����");
		  
		  
		  //��֤
		   boolean t=false;
		   //ע���ָ��
		  if("����".equals(zh)&&"222".equals(na)){
		  
		     t=true;  
		  } 
		  //��Ӧ
		  //��¼�ɹ���ʧ�� Ӧ����ת����
		  if(t){
		 // out.print("��½�ɹ�");  
		   request.getRequestDispatcher("/admin2/OK.jsp").forward(request, response);   
		  }else{
		  //out.print("��¼ʧ��"); 
		   request.getRequestDispatcher("/admin2/login.jsp").forward(request, response); 
		  }  
	
	}
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 
	}

}

