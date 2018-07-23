package com.book.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.book.dao.BookDao;
import com.book.entiy.Book;
import com.book.entiy.Categories;
import com.book.entiy.Publishers;
import com.book.util.Dbconn;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class BookDaoImpl implements BookDao {

	@Override
	public boolean addBook(Book book) {
		// TODO Auto-generated method stub
		boolean flag = false;  
         
        int i =Dbconn.addUpdDel("insert into books(title,author,publisherId,publishDate,isbn,wordsCount,unitPrice,ContentDescription,"
        		+ "AurhorDescription,EditorComment,CategoryId,quantity,wwwimage,address,baoyou) " +  
                "values('"+book.getTitle()+"','"+book.getAuthor()+"','"+book.getPublisherId()+"',"
                		+ "'"+book.getPublishDate()+"','"+book.getIsbn()+"','"+book.getWordsCount()+"','"+book.getUnitPrice()+"',"
                				+ "'"+book.getContentDescription()+"','"+book.getAurhorDescription()+"','"+book.getEditorComment()+"',"
                						+ "'"+book.getCategoryId()+"','"+book.getQuantity()+"','"+book.getWwwimage()+"',"
                								+ "'"+book.getAddress()+"','"+book.getBaoyou()+"')");	
        if(i>0){  
            flag = true;  
        }  
         
        return flag;  
	}

	@Override
	public List<Book> getBooksall() {
		// TODO Auto-generated method stub
		List<Book> booklist=new ArrayList<Book>();
		
		try{
			
		
		
		ResultSet rs= Dbconn.selectSql("select * from books");
		while(rs.next()){  
            Book book=new Book();  
            book.setId(rs.getInt("id"));  
            book.setTitle(rs.getString("title"));  
            book.setAuthor(rs.getString("author"));  
            book.setPublisherId(rs.getInt("publisherId"));  
            book.setPublishDate(rs.getString("publishDate"));
            book.setIsbn(rs.getString("isbn"));
            book.setWordsCount(rs.getInt("wordsCount"));
            book.setUnitPrice(rs.getFloat("unitPrice"));
            book.setContentDescription(rs.getString("ContentDescription"));
            book.setAurhorDescription(rs.getString("AurhorDescription"));
            book.setEditorComment(rs.getString("EditorComment"));
            book.setCategoryId(rs.getInt("CategoryId"));
            book.setQuantity(rs.getInt("quantity"));
            book.setWwwimage(rs.getString("wwwimage"));
            book.setAddress(rs.getString("address"));
            book.setBaoyou(rs.getString("baoyou"));
            booklist.add(book);  
        }  
		Dbconn.closeConn();
		return booklist;
		
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean deleteBook(int id) {
		// TODO Auto-generated method stub
		 boolean flag = false; 
			try{
				
				String sql = "delete  from books where id="+id;  
				int i=Dbconn.addUpdDel(sql);
				if(i>0){
					flag=true;
				}
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			return flag;
	}

	@Override
	public boolean updateBook(int id, String name, String author, int publisherId, String publishDate, String isbn,
			int wordsCount, float unitPrice, String contentDescription, String AurhorDescription, String EditorComment,
			int CategoryId, int quantity, String wwwimage, String address, String baoyou) {
		// TODO Auto-generated method stub
		boolean flag = false; 
		 try{
			
			 String sql="update books set name ='"+name  
		                +"' , author ='"+author  
		                +"' , publisherId ='"+publisherId  
		                +"' , publishDate ='"+publishDate
		                +"' , isbn ='"+isbn
		                +"' , wordsCount='"+wordsCount
		                +"' , unitPrice='"+unitPrice
		                +"' , contentDescription='"+contentDescription
		                +"' , AurhorDescription ='"+AurhorDescription
		                +"' , EditorComment='"+EditorComment
		                +"' , CategoryId='"+CategoryId
		                +"' , quantity='"+quantity
		                +"' , wwwimage='"+wwwimage
		                +"' , address='"+address
		                +"' , baoyou='"+baoyou+"'where id = "+id;
			 int i =Dbconn.addUpdDel(sql);  
		        if(i>0){  
		            flag = true;  
		        }  
		         
		        return flag; 
			 
		 }catch (Exception e) {
			// TODO: handle exception
			 e.printStackTrace();
		}
		 Dbconn.closeConn();
		 return flag;
	}

	@Override
	public List<Publishers> getPublishersall() {
		// TODO Auto-generated method stub
		List<Publishers> publisherlist=new ArrayList<Publishers>();
		
		try{
			
		
		
		ResultSet rs= Dbconn.selectSql("select * from publishers");
		while(rs.next()){  
            Publishers publisher=new Publishers();  
            publisher.setId(rs.getInt("id"));  
            publisher.setName(rs.getString("name"));
            publisherlist.add(publisher);
        }  
		Dbconn.closeConn();
		return publisherlist;
		
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Book> getlikeBooks(String title) {
		// TODO Auto-generated method stub
List<Book> booklist=new ArrayList<Book>();
		
		try{
			
		
		
		ResultSet rs= Dbconn.selectSql("select * from books where title like '%"+title+"%'");
		while(rs.next()){  
            Book book=new Book();  
            book.setId(rs.getInt("id"));  
            book.setTitle(rs.getString("title"));  
            book.setAuthor(rs.getString("author"));  
            book.setPublisherId(rs.getInt("publisherId"));  
            book.setPublishDate(rs.getString("publishDate"));
            book.setIsbn(rs.getString("isbn"));
            book.setWordsCount(rs.getInt("wordsCount"));
            book.setUnitPrice(rs.getFloat("unitPrice"));
            book.setContentDescription(rs.getString("ContentDescription"));
            book.setAurhorDescription(rs.getString("AurhorDescription"));
            book.setEditorComment(rs.getString("EditorComment"));
            book.setCategoryId(rs.getInt("CategoryId"));
            book.setQuantity(rs.getInt("quantity"));
            book.setWwwimage(rs.getString("wwwimage"));
            book.setAddress(rs.getString("address"));
            book.setBaoyou(rs.getString("baoyou"));
            booklist.add(book);
        }  
		Dbconn.closeConn();
		return booklist;
		
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Book> getpubIdBooks(int id) {
		// TODO Auto-generated method stub
		List<Book> booklist=new ArrayList<Book>();
		
		try {
			
			
			ResultSet rs= Dbconn.selectSql("select * from books where publisherId = "+id);
			while(rs.next()){
				while(rs.next()){  
		            Book book=new Book();  
		            book.setId(rs.getInt("id"));  
		            book.setTitle(rs.getString("title"));  
		            book.setAuthor(rs.getString("author"));  
		            book.setPublisherId(rs.getInt("publisherId"));  
		            book.setPublishDate(rs.getString("publishDate"));
		            book.setIsbn(rs.getString("isbn"));
		            book.setWordsCount(rs.getInt("wordsCount"));
		            book.setUnitPrice(rs.getFloat("unitPrice"));
		            book.setContentDescription(rs.getString("ContentDescription"));
		            book.setAurhorDescription(rs.getString("AurhorDescription"));
		            book.setEditorComment(rs.getString("EditorComment"));
		            book.setCategoryId(rs.getInt("CategoryId"));
		            book.setQuantity(rs.getInt("quantity"));
		            book.setWwwimage(rs.getString("wwwimage"));
		            book.setAddress(rs.getString("address"));
		            book.setBaoyou(rs.getString("baoyou"));
		            booklist.add(book);
				}
				
			}
			Dbconn.closeConn();
			
			return booklist;
		}
			 catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			return null;
	}

	@Override
	public List<Categories> getCategoriesall() {
		// TODO Auto-generated method stub
		List<Categories> categories= new ArrayList<Categories>();
		try{
			
			
			
			ResultSet rs= Dbconn.selectSql("select * from categories");
			while(rs.next()){  
	            Categories categorie=new Categories();  
	            categorie.setId(rs.getInt("id"));  
	            categorie.setName(rs.getString("name"));
	            categories.add(categorie);
	        }  
			Dbconn.closeConn();
			return categories;
			
			}catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			return null;
	}

	@Override
	public List<Book> getcateIdBooks(int id) {
		// TODO Auto-generated method stub
			List<Book> booklist=new ArrayList<Book>();
		
		try {
			
			
			ResultSet rs= Dbconn.selectSql("select * from books where categoryId = "+id);
			while(rs.next()){
				while(rs.next()){  
		            Book book=new Book();  
		            book.setId(rs.getInt("id"));  
		            book.setTitle(rs.getString("title"));  
		            book.setAuthor(rs.getString("author"));  
		            book.setPublisherId(rs.getInt("publisherId"));  
		            book.setPublishDate(rs.getString("publishDate"));
		            book.setIsbn(rs.getString("isbn"));
		            book.setWordsCount(rs.getInt("wordsCount"));
		            book.setUnitPrice(rs.getFloat("unitPrice"));
		            book.setContentDescription(rs.getString("ContentDescription"));
		            book.setAurhorDescription(rs.getString("AurhorDescription"));
		            book.setEditorComment(rs.getString("EditorComment"));
		            book.setCategoryId(rs.getInt("CategoryId"));
		            book.setQuantity(rs.getInt("quantity"));
		            book.setWwwimage(rs.getString("wwwimage"));
		            book.setAddress(rs.getString("address"));
		            book.setBaoyou(rs.getString("baoyou"));
		            booklist.add(book);
				}
				
			}
			Dbconn.closeConn();
			
			return booklist;
		}
			 catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			return null;
	}

	
}
