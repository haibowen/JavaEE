package com.haibowen.test;

import com.haibowen.dao.AdminDao;
import com.haibowen.dao.impl.AdminDaoImpl;
import com.haibowen.entity.Admin;

public class test {
	
	public static void main(String[] args) {
		AdminDao  adminDao=new AdminDaoImpl();
		Admin seletOne = adminDao.seletOne("wenhaibo", "123");
		System.out.println(seletOne);
	}
}
