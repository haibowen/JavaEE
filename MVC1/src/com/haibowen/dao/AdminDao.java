package com.haibowen.dao;

import com.haibowen.entity.Admin;

public interface AdminDao {  //Dao类用来操作数据库
	
	public Admin seletOne(String userid,String password);
	

}
