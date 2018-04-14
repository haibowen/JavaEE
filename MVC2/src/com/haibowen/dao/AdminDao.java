package com.haibowen.dao;

import com.haibowen.entil.Admin;

public interface AdminDao {
	public Admin selectOne (String uid,String pwd);

}
