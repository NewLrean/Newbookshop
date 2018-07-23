package com.book.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.book.dao.BookDao;
import com.book.dao.impl.BookDaoImpl;
import com.book.entiy.Book;
import com.book.entiy.Categories;
import com.book.entiy.Publishers;
import com.book.service.BookService;
import com.book.service.impl.BookServiceImpl;

public class Bookservlet extends HttpServlet {

	 
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	BookService bookdao = new BookServiceImpl();
	
	
	
	


	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		System.out.println("开始初始化");
	}


	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		System.out.println("接受请求");
		
		String method = request.getParameter("method");
		session.removeAttribute("listbook");
		session.removeAttribute("title");
		
		session.removeAttribute("count");
		
		
		 switch (method) {
		 
		 
		case "searchbooks" :
			session.removeAttribute("listpublisher");
			String title=request.getParameter("title");
			/*String utf=new String(request.getParameter(title).getBytes("iso8859-1"),"utf-8");*/
			System.out.println(title);
			
			if(title==""||title==null){
				List<Book> listbook= bookdao.getBooksall();
				/*System.out.println(listbook.get(0).getTitle());*/
				List<Publishers> listpublisher=bookdao.getPublishersall();
				List<Categories> listcategorie=bookdao.getCategoriesall();
				session.setAttribute("title", "所有书籍");
				
				session.setAttribute("listpublisher", listpublisher);
				session.setAttribute("listcategorie", listcategorie);
				System.out.println(listpublisher.get(0).getName());
				session.setAttribute("count", listbook.size());
				if(listbook.size()!=0){
				
				session.setAttribute("listbook", listbook);
				}
				else
					System.out.println("没有请求数据");
				
				
				 
			}else{
				session.removeAttribute("listpublisher");
				List<Book> listbook=bookdao.getlikeBooks(title);
				/*System.out.println(listbook.get(0).getTitle());*/
				List<Publishers> listpublisher=bookdao.getPublishersall();
				session.setAttribute("listpublisher", listpublisher);
				session.setAttribute("title", title);
				session.setAttribute("count", listbook.size());
				if(listbook.size()!=0){
					
					session.setAttribute("listbook", listbook);
			}
					else
					System.out.println("没有请求数据");
			}
			break;

		case "publisher" :
			int id =Integer.parseInt(request.getParameter("value"));
			String title2=request.getParameter("title");
			System.out.println(id);
			List<Book> booklist=bookdao.getpubIdBooks(id);
			session.setAttribute("title", title2);
			session.setAttribute("count", booklist.size());
			if(booklist.size()!=0){
			
			session.setAttribute("listbook", booklist);
			}else{
				System.out.println("没有请求数据");
	}
			break;
			
			
		case "categorie":
			int id2 =Integer.parseInt(request.getParameter("value"));
			String title3=request.getParameter("title");
			System.out.println(id2);
			List<Book> booklist3=bookdao.getpubIdBooks(id2);
			session.setAttribute("title", title3);
			session.setAttribute("count", booklist3.size());
			if(booklist3.size()!=0){
			
			session.setAttribute("listbook", booklist3);
			}else{
				System.out.println("没有请求数据");
	}
		default:
			break;
		}
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response); //
	}

}
