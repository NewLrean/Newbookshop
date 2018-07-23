package com.book.entiy;

import java.io.Serializable;

public class User implements Serializable{
	private int id;
	private String name;
	private String pwd;
	private String userimg;
	private String phonenumber;
	private String sex;
	private String lasttime;
	private String loginsize;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getUserimg() {
		return userimg;
	}
	public void setUserimg(String userimg) {
		this.userimg = userimg;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getLasttime() {
		return lasttime;
	}
	public void setLasttime(String lasttime) {
		this.lasttime = lasttime;
	}
	public String getLoginsize() {
		return loginsize;
	}
	public void setLoginsize(String loginsize) {
		this.loginsize = loginsize;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", pwd=" + pwd + ", userimg=" + userimg + ", phonenumber="
				+ phonenumber + ", sex=" + sex + ", lasttime=" + lasttime + ", loginsize=" + loginsize + "]";
	}
	
	
	
}
