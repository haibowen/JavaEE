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
	 * 1.��������Ƶ���ת�ķ�ʽ������
	 * A url��ǩ a��ǩ
	 * B ��
	 * 2.���������Ƶ���ת��ʽ������  ת���ض���
	 * ���ߵ�����
	 * 
	 * A��䲻ͬ��
	 * 
	 * 
	 * B��ת·����ͬ
	 * ת���� ת��ǰ��·��
	 * �ض�������ת���·��
	 * 
	 * C���ֵ
	 * ת�����Ի�ô�������ֵ
	 * �ض��򲻿���
	 * 
	 * Dԭ��ͬ
	 * ת��û�в����µ�����  �������֪��  ��Ҫ�ڷ����� ��
	 * ������ͬһ������ ���Կ��Եõ����͵�ֵ������ת���Ĳ��������������֪ ���Ե�ַ���� �Ƿ������ڲ�����ת
	 * 
	 * ��¼�ɹ�  �ض��������֪�飬��ַ���
	 * 
	 * 
	 * 
	 */
	
  
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		  String zh=request.getParameter("zh");  
		  String na=request.getParameter("mm"); 		  
		   //����������֤
		  
		  if("".equals(zh)||zh==null){
			  request.setAttribute("mag","�˺Ų���Ϊ��(������)" );
			  //ת��
			  request.getRequestDispatcher("/admin2/login.jsp").forward(request,response);
			  
			  return;
		  }
		  
		  
		  
		  
		  //��֤
		   boolean t=false;
		   //ע���ָ��
		  if("111".equals(zh)&&"222".equals(na)){
		  
		     t=true;  
		     System.out.println("��ִ����");
		  } 
		  //��Ӧ
		  //��¼�ɹ���ʧ�� Ӧ����ת����
		  if(t){
		 // out.print("��½�ɹ�"); 
			  //ת��
			  request.setAttribute("ma", zh);
		  //request.getRequestDispatcher("/admin2/OK.jsp").forward(request, response); 
			 
			  //�ض���ķ�ʽ
			  response.sendRedirect("/Servlet5/admin2/OK.jsp");
		  }else{
		  //out.print("��¼ʧ��"); 
			  request.setAttribute("ma", "��¼ʧ��");
		   request.getRequestDispatcher("/admin2/login.jsp").forward(request, response); 
		  }  
	
	}
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 
	}

}

