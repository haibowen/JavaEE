package com.haibowen;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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
			  cookie.setPath("Servlet7/servlet/dologin2/");
			  cookie2.setPath("Servlet7/servlet/dologin2/");
			  
			  
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
		 
			
			 // request.setAttribute("ma1", "����");
			  //ת��  
			  //session����
			 HttpSession session = request.getSession();
			 session.setAttribute("ma1", zh);
			
			 System.out.println( session.getId());
			 
			 //ͳ�Ʒ��ʴ���
			 ServletContext servletContext = request.getServletContext();
		        Integer attribute = (Integer)servletContext.getAttribute("count");
		        if(attribute==null){
		        	attribute=1;
		        	
		        }else{
		        	attribute++;
		        }
		        servletContext.setAttribute("count",attribute);
		        
		  request.getRequestDispatcher("/admin2/OK.jsp").forward(request, response); 
			  //�ض���
			  //request.setAttribute("ma1", "����");
			//response.sendRedirect("/Servlet8/admin2/OK.jsp");
			
		  }else{
		 
			  
		   request.getRequestDispatcher("/admin2/login.jsp").forward(request, response); 
		  }  
	
	}
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 
	}

}

