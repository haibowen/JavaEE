package com.haibowen.im;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.haibowen.dao.AdminDao;
import com.haibowen.entil.Admin;
import com.haibowen.util.DBUtil;

public class AdminDaoIm  implements AdminDao{

	@Override
	public Admin selectOne(String uid, String pwd) {
		// TODO Auto-generated method stub
		String sql="select * from shuju1 where uid=? and pwd=?";
		Object[]prames={uid,pwd};
		ResultSet execque = DBUtil.execque(sql, prames);
		
		Admin admin=null;		
		try {
			while(execque.next())
	
				admin=new Admin();
			admin.setUid(execque.getString("uid"));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return admin;
	}

}
