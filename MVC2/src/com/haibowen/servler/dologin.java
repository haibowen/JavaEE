package com.haibowen.servler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.haibowen.entil.Admin;
import com.haibowen.service.AdminService;
import com.haibowen.service.im.AdminServiceIm;
@WebServlet("/servlet/dologin")
public class dologin extends HttpServlet {

	
     @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    		throws ServletException, IOException {
    	 
    	
    
    } 
     @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
    		throws ServletException, IOException {
    	 
    	 
    	 String uid=req.getParameter("uid");
    	 String pwd=req.getParameter("pwd");
    	 
    	AdminService adminService=new AdminServiceIm();
    	Admin login = adminService.Login(uid, pwd);
 		
    	 if(login!=null){
    		 req.getRequestDispatcher("/admin/ok.jsp").forward(req, resp);
    	 }else{

    		 req.getRequestDispatcher("/admin/login.jsp").forward(req, resp);
    	 }
    	
    	 }
      
    	 

}
