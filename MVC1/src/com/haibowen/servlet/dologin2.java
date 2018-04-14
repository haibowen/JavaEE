package com.haibowen.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.haibowen.dao.AdminDao;
import com.haibowen.dao.impl.AdminDaoImpl;
import com.haibowen.entity.Admin;
@WebServlet("/servlet/dologin")
public class dologin2 extends HttpServlet {
	
	
	
  
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		  
	}
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

		  String uid=request.getParameter("userid");  
		  String pwd=request.getParameter("password"); 

		 
		  //查看数据库
		  
		    AdminDao  adminDao=new AdminDaoImpl();
			Admin seletOne = adminDao.seletOne(uid, pwd);
			if(seletOne!=null){
		 
			  //转发
			  
		  request.getRequestDispatcher("/admin2/OK.jsp").forward(request, response); 
			 
			
		  }else{
		 
			  
		   request.getRequestDispatcher("/admin2/login.jsp").forward(request, response); 
		  }  
		 
	}

}

