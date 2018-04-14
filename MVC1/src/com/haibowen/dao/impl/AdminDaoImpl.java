package com.haibowen.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.haibowen.dao.AdminDao;
import com.haibowen.entity.Admin;
import com.haibowen.util.DBUtil;

public class AdminDaoImpl  implements AdminDao{

	@Override
	public Admin seletOne(String uid, String pwd) {
		String sqlString="select * from shuju1 where uid=? and pwd=?" ;
		Object [] prames ={uid,pwd};
		ResultSet executeQuery = DBUtil.executeQuery(sqlString, prames);
		Admin  admin=null;
		try {
			while(executeQuery.next()){
				//登录成功保存数据
				
				admin=new Admin();
				admin.setUsername(executeQuery.getString("uid"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		
		
		
		
		
		return admin;
	}

}
