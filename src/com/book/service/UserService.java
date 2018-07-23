package com.book.service;

import java.util.List;

import com.book.entiy.User;

public interface UserService {
	public boolean login(String name,String password);
	public boolean rigister(User user);
	
	public List<User> getUserall();
	
	public boolean deleteUser(int id);
	public boolean updateUser(int id,String name,String pwd,String userimg,String phonenumber,String sex,String lasttime,String loginsize);

}
