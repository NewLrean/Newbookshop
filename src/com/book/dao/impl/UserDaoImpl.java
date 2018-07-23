package com.book.dao.impl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.book.dao.UserDao;
import com.book.entiy.Book;
import com.book.entiy.User;
import com.book.util.Dbconn;

public class UserDaoImpl implements UserDao {

	@Override
	public boolean login(String name, String password) {
		boolean flag = false;
		Connection conn;
		// TODO Auto-generated method stub
		try{
			
		
		
		conn = Dbconn.getConnection();
		PreparedStatement ps=conn.prepareStatement("select * from admin where username=? and password=?");
		ps.setString(1, name);
		ps.setString(2, password);
		ResultSet rs=ps.executeQuery();
		while(rs.next()){  
             if(rs.getString("username").equals(name) && rs.getString("password").equals(password)){  
                 flag = true;  
             }  
         }  
		 Dbconn.closeConn();  
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return flag;
	}

	@Override
	public boolean rigister(User user) {
		// TODO Auto-generated method stub
		 boolean flag = false;  
	         
	        int i =Dbconn.addUpdDel("insert into admin(username,password,sex,phonenumber) " +  
	                "values('"+user.getName()+"','"+user.getPwd()+"','"+user.getSex()+"','"+user.getPhonenumber()+"')");	
	        if(i>0){  
	            flag = true;  
	        }  
	        Dbconn.closeConn();  
	        return flag;  
	}
	
	

	@Override
	public List<User> getUserall() {
		// TODO Auto-generated method stub
		List<User> userlist = new ArrayList<User>();
		
		
		try{
			
		
		
		ResultSet rs= Dbconn.selectSql("select * from admin");
		while(rs.next()){  
            User user = new User();  
            user.setId(rs.getInt("id"));  
            user.setName(rs.getString("username"));
            user.setSex(rs.getString("sex"));  
            user.setPhonenumber(rs.getString("phonenumber"));
            userlist.add(user);  
        }  
		Dbconn.closeConn();
		return userlist;
		
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

	

	
	
	@Override
	public boolean deleteUser(int id) {
		// TODO Auto-generated method stub
		 boolean flag = false; 
		try{
			
			String sql = "delete  from admin where id="+id;  
			int i=Dbconn.addUpdDel(sql);
			if(i>0){
				flag=true;
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		Dbconn.closeConn();
		return flag;
	}

	@Override
	public boolean updateUser(int id, String name, String pwd, String userimg, String phonenumber, String sex,
			String lasttime, String loginsize) {
		// TODO Auto-generated method stub
		 boolean flag = false; 
		 try{
			
			 String sql="update admin set username ='"+name  
		                +"' , password ='"+pwd  
		                +"' , sex ='"+sex  
		                +"' , phonenumber ='"+phonenumber+"'where id = "+id;
			 int i =Dbconn.addUpdDel(sql);  
		        if(i>0){  
		            flag = true;  
		        }  
		        Dbconn.closeConn();  
		        return flag; 
			 
		 }catch (Exception e) {
			// TODO: handle exception
			 e.printStackTrace();
		}
		 Dbconn.closeConn();
		 return flag;
	}

	


	

	

}
