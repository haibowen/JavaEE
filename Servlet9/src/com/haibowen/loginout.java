package com.haibowen;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/servlet/loginout")
public class loginout extends HttpServlet {
   @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	   
	   //1.ע��session
	   req.getSession().invalidate();

	   //2.���ص�¼����
	   resp.sendRedirect("/Servlet9/admin2/login.jsp");

}
   @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
	}
}
