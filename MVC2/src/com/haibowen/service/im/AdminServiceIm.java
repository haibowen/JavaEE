package com.haibowen.service.im;

import com.haibowen.dao.AdminDao;
import com.haibowen.entil.Admin;
import com.haibowen.im.AdminDaoIm;
import com.haibowen.service.AdminService;

public class AdminServiceIm implements AdminService {

	@Override
	public void OrderItem() {
		
		
	}

	@Override
	public Admin Login(String uid,String pwd) {
		 AdminDao adminDao=new AdminDaoIm();
 		 Admin admin=adminDao.selectOne(uid, pwd);
 		
		
		
		return admin;
	}

}
