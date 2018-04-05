package com.haibowen.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class lifeservlet extends HttpServlet {
	
	 //servlet 单实例 多线程    类似于runable（）接口 
	//私有化构造方法（单例） 注意区分单实例 和单例，
	
	
	/**
	 * servlet生命周期
	 * 1.类加载
	 * 
	 * web.xml  联系路径  
	 * /servlet/lifeservlet------lifeservlet----lifeservlet--com.haibowen.servlet.lifeservlet
	 * Class  class =Class.forName("com.haibowen.servlet.lifeservlet")  //反射 
	 *    
	 *    任何一个类都含有一个隐含的静态成员变量 class
	 *    获取反射机制有三种方法  通常用下面的方法
	 *    Class 通过class对象的 forName（）来获取用的最多  但是可能会抛出异常
	 *    
	 *    
 	 * 2.构造方法/实例化对象
	 * 3.init（）方法//初始化
	 * 4.serves 调用服务请求
	 * 5.doGet()/doPost()
	 * 6.ondestory()
	 * 
	 * 
	 * 
	 */
	/**
	 * 类加载的时机
	 * 1.第一次请求的时候加载
	 * 2.一启动服务器的时候加载  <load-on-startup>0</load-on-startup>
	 * 
	 * 
	 * 
	 */
	public lifeservlet(){
		System.out.println("lifeservlet()");
	}
//  doGet()  doPost()  方法必须重写    父类的方法是根据协议 抛出错误的405.。。。。。。
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
	//决定调用那个方法
	 
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
		System.out.println("调用错误");
	}
	
	}

	//关闭服务器之前调用
	@Override
	public void destroy() {
		System.out.println("destroy()");
		
	}
  //无论请求多少次 只会执行一次  初始化对象，创建完对象以后
	@Override
	public void init() throws ServletException {
		System.out.println("init()");
		
	}
	
	
	
	

}
