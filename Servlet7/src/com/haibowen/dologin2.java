package com.haibowen;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
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
		  String ch=request.getParameter("ch");
		  
		  
		  
		  //�����ʽ
		  byte[] a1=zh.getBytes("ISO-8859-1");
		   zh=new String(a1,"utf-8");
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
		  if("����".equals(zh)&&"222".equals(na)){
		  
		     t=true;  
		     System.out.println("��ִ����");
		  } 
		 

		  //��ס����
		  if(t){
			 
			 //�����ʽ��������˻� �������� 
			  String zh1= URLEncoder.encode(zh,"utf-8");
			  System.out.print(zh1);
			//1.���뿨Ƭ
			  Cookie cookie=new Cookie("zh", zh1);
			  Cookie cookie2=new Cookie("mm", na);
			  
			  //2ָ��������Ч��Χ
			  cookie.setPath("/Servlet7/servlet/dologin2");
			  cookie2.setPath("/Servlet7/servlet/dologin2");
			  
			  
			  if("yes".equals(ch)){
				  
			 
			  //3.��Чʱ��
			  cookie.setMaxAge(60*60*24*10);//10��
			  cookie2.setMaxAge(60*60*24*10);
			  }else{
				 cookie.setMaxAge(0);//0��
				 cookie2.setMaxAge(0);  
			  }
			  //4.��ý�����ͻ�
			  response.addCookie(cookie);
			  response.addCookie(cookie2);
			 
		  }
		
		  //��¼�ɹ���ʧ�� Ӧ����ת����
		  if(t){
		 
			  //ת��
			  
		  request.getRequestDispatcher("/admin2/OK.jsp").forward(request, response); 
			 
			
		  }else{
		 
			  
		   request.getRequestDispatcher("/admin2/login.jsp").forward(request, response); 
		  }  
	
	}
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 
	}

}

