package com.haibowen.entity;

import java.util.Date;



public class Admin {
	
	private String  userid;
	private String username;
	private String password;
	private int age;
	private  float score;
	private Date  enterDate;
	private String hobby;
	
	
	public Admin() {
		super();
	}
	public Admin(String userid, String username, String password,
			int age, float score, Date enterDate, String hobby) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.age = age;
		this.score = score;
		this.enterDate = enterDate;
		this.hobby = hobby;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	public Date getEnterDate() {
		return enterDate;
	}
	public void setEnterDate(Date enterDate) {
		this.enterDate = enterDate;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	@Override
	public String toString() {
		return "Admin [userid=" + userid + ", username=" + username
				+ ", password=" + password + ", age=" + age
				+ ", score=" + score + ", enterDate=" + enterDate
				+ ", hobby=" + hobby + "]";
	}
	
	

}
