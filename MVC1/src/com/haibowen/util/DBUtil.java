package com.haibowen.util;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class DBUtil {
	
	//����һ������
	public  static Connection getConnection(){
		Connection connection=null;
		try {
			//��������
			Class.forName("com.mysql.jdbc.Driver");
			//��ȡ����
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/zhangpei?"  
  
                + "user=root&password=123456&useUnicode=true&characterEncoding=UTF8");
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		

		return connection;

	}
	//�ر����ݿ�ķ���
	public static void closeAll(ResultSet resultSet,Statement statement,Connection connection){
		
		try {
			if(resultSet!=null){
				resultSet.close();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (statement!=null) {
				((Connection) statement).close();
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (connection!=null) {
				connection.close();
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
		
	}
	//��ѯ����
	public   static int executeUpdate(String sqlString,Object[] prams ){
		
		
		
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		connection=getConnection();
		int n=0;
		try {
			preparedStatement=connection.prepareStatement(sqlString);
			for(int i=0;i<prams.length;i++){
				preparedStatement.setObject(i+1, prams[i]);
				
			}
			n=preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
		
	}
	//��ѯ���  ����һ������ 
	public static ResultSet executeQuery( String sqlString,Object[] prames ){
		
		
		
		Connection connection =null;
		PreparedStatement preparedStatement=null;
		ResultSet resultSet=null;
		connection=getConnection();
		try {
			preparedStatement=connection.prepareStatement(sqlString);
			for(int i=0;i<prames.length;i++){
				preparedStatement.setObject(i+1,prames[i]);
				
			}
			resultSet=preparedStatement.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultSet;
	}
   public static void main(String[] args) {
	Connection connection = getConnection();
	try {
		if(!connection.isClosed()){
			System.out.println("helloworld");
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
  
}