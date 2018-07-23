package com.book.service.impl;

import java.util.List;

import com.book.dao.UserDao;
import com.book.dao.impl.UserDaoImpl;
import com.book.entiy.User;
import com.book.service.UserService;

public class UserServiceImpl implements UserService {

	
	
	UserDao userdao = new UserDaoImpl();
	@Override
	public boolean login(String name, String password) {
		// TODO Auto-generated method stub
		return userdao.login(name, password);
	}

	@Override
	public boolean rigister(User user) {
		// TODO Auto-generated method stub
		return userdao.rigister(user);
	}

	@Override
	public List<User> getUserall() {
		// TODO Auto-generated method stub
		return userdao.getUserall();
	}

	@Override
	public boolean deleteUser(int id) {
		// TODO Auto-generated method stub
		return userdao.deleteUser(id);
	}

	@Override
	public boolean updateUser(int id, String name, String pwd, String userimg, String phonenumber, String sex,
			String lasttime, String loginsize) {
		// TODO Auto-generated method stub
		return false;
	}

}
