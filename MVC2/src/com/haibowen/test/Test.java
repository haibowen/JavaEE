package com.haibowen.test;

import com.haibowen.dao.AdminDao;
import com.haibowen.entil.Admin;
import com.haibowen.im.AdminDaoIm;

public class Test {
	public static void main(String[] args) {
		AdminDao adminDao=new AdminDaoIm();
		Admin admin=adminDao.selectOne("123", "456");
		System.out.println(admin);
		
	}

}
