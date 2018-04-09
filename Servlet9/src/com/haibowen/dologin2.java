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
		  
		  
		  
		  //编码格式
		  byte[] a1=zh.getBytes("ISO-8859-1");
		   zh=new String(a1,"utf-8");
		   //服务器的验证
		  
		  
		  if("".equals(zh)||zh==null){
			  request.setAttribute("mag","账号不能为空(服务器)" );
			  //转发
			  request.getRequestDispatcher("/admin2/login.jsp").forward(request,response);
			  
			  return;
		  }
		
		  
		  
		  
		  //验证
		   boolean t=false;
		   //注意空指针
		  if("张三".equals(zh)&&"222".equals(na)){
		  
		     t=true;  
		     System.out.println("我执行了");
		  } 
		 

		  //记住密码
		  if(t){
			 
			 //编码格式解决中文账户 乱码问题 
			  String zh1= URLEncoder.encode(zh,"utf-8");
			  System.out.print(zh1);
			//1.申请卡片
			  Cookie cookie=new Cookie("zh", zh1);
			  Cookie cookie2=new Cookie("mm", na);
			  
			  //2指出卡的有效范围
			  cookie.setPath("Servlet7/servlet/dologin2/");
			  cookie2.setPath("Servlet7/servlet/dologin2/");
			  
			  
			  if("yes".equals(ch)){
				  
			 
			  //3.有效时间
			  cookie.setMaxAge(60*60*24*10);//10天
			  cookie2.setMaxAge(60*60*24*10);
			  }else{
				 cookie.setMaxAge(0);//0天
				 cookie2.setMaxAge(0);  
			  }
			  //4.获得结果给客户
			  response.addCookie(cookie);
			  response.addCookie(cookie2);
			 
		  }
		
		  //登录成功或失败 应该跳转界面
		  if(t){
		 
			
			 // request.setAttribute("ma1", "张三");
			  //转发  
			  //session设置
			 HttpSession session = request.getSession();
			 session.setAttribute("ma1", zh);
			
			 System.out.println( session.getId());
			 
			 //统计访问次数
			 ServletContext servletContext = request.getServletContext();
		        Integer attribute = (Integer)servletContext.getAttribute("count");
		        if(attribute==null){
		        	attribute=1;
		        	
		        }else{
		        	attribute++;
		        }
		        servletContext.setAttribute("count",attribute);
		        
		  request.getRequestDispatcher("/admin2/OK.jsp").forward(request, response); 
			  //重定向
			  //request.setAttribute("ma1", "张三");
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

