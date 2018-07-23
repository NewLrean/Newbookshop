package com.book.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.book.dao.UserDao;
import com.book.dao.impl.UserDaoImpl;
import com.book.entiy.User;
import com.book.service.UserService;
import com.book.service.impl.UserServiceImpl;

public class Userservlet extends HttpServlet{
	
	UserService userdao = new UserServiceImpl();
	
	
	
	
	

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
        doPost(request, response);  //
    }
	
	 public void doPost(HttpServletRequest request, HttpServletResponse response)  
	            throws ServletException, IOException {  
		 
		 User user=new User();
		 String method = request.getParameter("method");
		 
		 
		 switch (method) {
		case "login":
			String name = request.getParameter("name");
			 
			String pwd=request.getParameter("pwd");
			 
			 
			 
			 if(userdao.login(name, pwd)) {
				 System.out.println(name+"开始登陆");
				System.out.println("欢迎用户"+name);
				response.sendRedirect("index.jsp");
				 System.out.println("登录成功");
			 }else{
				 response.sendRedirect("login.jsp");
			 }
			break;
		case "register":
			String uname =request.getParameter("name");
			String upwd =request.getParameter("pwd");
			String sex =request.getParameter("sex");
			System.out.println("0为男,1为女:"+sex);
			String phone = request.getParameter("pgone");
			
			user.setName(uname);  
	        user.setPwd(upwd);  
	        user.setSex(sex);  
	        user.setPhonenumber(phone);
	        
	        
			if(userdao.rigister(user)){
				System.out.println("注册成功,跳转到登录页面");
				response.sendRedirect("login.jsp");
			}else{
				response.sendRedirect("register.jsp");
			}
			
			break;
		default:
			break;
		}
		 
	      
	    }  
}
