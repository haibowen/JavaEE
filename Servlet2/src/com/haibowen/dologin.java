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
		  //验证
		   boolean t=false;
		   //注意空指针
		  if("海波".equals(zh)&&"222".equals(na)){
		  
		     t=true;  
		  } 
		  //响应
		  //登录成功或失败 应该跳转界面
		  if(t){
		 // out.print("登陆成功");  
		   request.getRequestDispatcher("/admin/OK.jsp").forward(request, response);   
		  }else{
		  //out.print("登录失败"); 
		   request.getRequestDispatcher("/admin/login.jsp").forward(request, response); 
		  }  
	
	}
	/**
	 * get提交和post提交的比较
	 * 
	 * 1.get是不安全的，数据在url中，数据量较小，受url的影响，    get请求会被缓存     get的执行效率较高 
	 * 超链接请求和地址栏请求 必须是get提交
	 * 2.post对于用户是安全的，数据量不受限制
	 * @param zh
	 * @return
	 */
	//解决中文乱码 的方法
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

