package com.haibowen.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class lifeservlet extends HttpServlet {
	
	 //servlet ��ʵ�� ���߳�    ������runable�����ӿ� 
	//˽�л����췽���������� ע�����ֵ�ʵ�� �͵�����
	
	
	/**
	 * servlet��������
	 * 1.�����
	 * 
	 * web.xml  ��ϵ·��  
	 * /servlet/lifeservlet------lifeservlet----lifeservlet--com.haibowen.servlet.lifeservlet
	 * Class  class =Class.forName("com.haibowen.servlet.lifeservlet")  //���� 
	 *    
	 *    �κ�һ���඼����һ�������ľ�̬��Ա���� class
	 *    ��ȡ������������ַ���  ͨ��������ķ���
	 *    Class ͨ��class����� forName��������ȡ�õ����  ���ǿ��ܻ��׳��쳣
	 *    
	 *    
 	 * 2.���췽��/ʵ��������
	 * 3.init��������//��ʼ��
	 * 4.serves ���÷�������
	 * 5.doGet()/doPost()
	 * 6.ondestory()
	 * 
	 * 
	 * 
	 */
	/**
	 * ����ص�ʱ��
	 * 1.��һ�������ʱ�����
	 * 2.һ������������ʱ�����  <load-on-startup>0</load-on-startup>
	 * 
	 * 
	 * 
	 */
	public lifeservlet(){
		System.out.println("lifeservlet()");
	}
//  doGet()  doPost()  ����������д    ����ķ����Ǹ���Э�� �׳������405.������������
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("doGet()");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("doPost()");
		
	}
	//���������Ǹ�����
	 
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
	String string= request.getMethod();
	System.out.println(string);
	if("GET".equals(string)){
		this.doGet(request, response);
		System.out.println("doGet()");
	}else if("Post".equals(string)) {
		this.doPost(request, response);
		System.out.println("doPost()");
	}
	 else{
		System.out.println("���ô���");
	}
	
	}

	//�رշ�����֮ǰ����
	@Override
	public void destroy() {
		System.out.println("destroy()");
		
	}
  //����������ٴ� ֻ��ִ��һ��  ��ʼ�����󣬴���������Ժ�
	@Override
	public void init() throws ServletException {
		System.out.println("init()");
		
	}
	
	
	
	

}
