package com.haibowen;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/servlet/dologin")
public class dologin extends HttpServlet {
  
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		  String zh=request.getParameter("zh");  
		  String na=request.getParameter("mm"); 		  
		  charset(zh);
		  byte[] a=zh.getBytes("ISO-8859-1");
		   zh=new String(a,"utf-8");
		  System.out.println("zh"+zh+"mm"+na);
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
		   request.getRequestDispatcher("/admin/OK.jsp").forward(request, response);   
		  }else{
		  //out.print("��¼ʧ��"); 
		   request.getRequestDispatcher("/admin/login.jsp").forward(request, response); 
		  }  
	
	}
	/**
	 * get�ύ��post�ύ�ıȽ�
	 * 
	 * 1.get�ǲ���ȫ�ģ�������url�У���������С����url��Ӱ�죬    get����ᱻ����     get��ִ��Ч�ʽϸ� 
	 * ����������͵�ַ������ ������get�ύ
	 * 2.post�����û��ǰ�ȫ�ģ���������������
	 * @param zh
	 * @return
	 */
	//����������� �ķ���
	public   String  charset (String zh){		
		 
		  try {
			  byte[] a=zh.getBytes("ISO-8859-1");
			   zh=new String(a,"utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return  zh;
		
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		  request.setCharacterEncoding("utf-8");
		  String zh=request.getParameter("zh");  
		  String na=request.getParameter("mm"); 		  
		 // charset(zh);
		  //byte[] a=zh.getBytes("ISO-8859-1");
		   //zh=new String(a,"utf-8");
		  System.out.println("zh"+zh+"mm"+na);
	}

}

