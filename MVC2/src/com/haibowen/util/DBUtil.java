package com.haibowen.util;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {
	// 1.��������
	public static Connection getConnection(){
		
		Connection connection=null;
		
		try {
			//��������
			Class.forName("com.mysql.jdbc.Driver");
			//��ȡ������
			
				connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/zhangpei?"  
  
                + "user=root&password=123456&useUnicode=true&characterEncoding=UTF8");
		}
			 catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		 catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
		
	}
	//2.�ر����ݿ�ķ���
	public static void closeAll(ResultSet resultSet,Statement statement,Connection connection){
		
		
		if(resultSet==null){
			try {
				resultSet.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(statement==null){
			
			try {
				((Connection) statement).close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	   if(connection==null){
		   
		   
		   try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
	}
	
	//3.��ѯ
	public static int executeUpdate(String sql,Object[]prams){
		
		
		Connection connection=null;
	    PreparedStatement preparedStatement=null;
		connection=getConnection();
		int n=0;
		try {
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			for(int i=0;i<prams.length;i++){
				preparedStatement.setObject(i+1, prams[i]);
				
			}
			n=preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	           return n;	
	}
	//4.���صĲ�ѯ���
	
	public static ResultSet execque(String sql,Object[]prames){
		
		
		
		Connection connection =null;
		PreparedStatement preparedStatement=null;
		ResultSet resultSet=null;
		connection=getConnection();
		try {
			preparedStatement=connection.prepareStatement(sql);
			for(int i=0;i<prames.length;i++){
				preparedStatement.setObject(i+1,prames[i]);
				
			}
			resultSet=preparedStatement.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultSet;
	
		
	}

}
