package com.book.service.impl;

import java.util.List;

import com.book.dao.BookDao;
import com.book.dao.impl.BookDaoImpl;
import com.book.entiy.Book;
import com.book.entiy.Categories;
import com.book.entiy.Publishers;
import com.book.service.BookService;

public class BookServiceImpl implements BookService {

	
	BookDao bookdao = new BookDaoImpl();
	@Override
	public boolean addBook(Book book) {
		// TODO Auto-generated method stub
		return bookdao.addBook(book);
	}

	@Override
	public List<Book> getBooksall() {
		// TODO Auto-generated method stub
		return bookdao.getBooksall();
	}

	@Override
	public boolean deleteBook(int id) {
		// TODO Auto-generated method stub
		return bookdao.deleteBook(id);
	}

	@Override
	public boolean updateBook(int id, String name, String author, int publisherId, String publishDate, String isbn,
			int wordsCount, float unitPrice, String contentDescription, String AurhorDescription, String EditorComment,
			int CategoryId, int quantity, String wwwimage, String address, String baoyou) {
		// TODO Auto-generated method stub
		return bookdao.updateBook(id, name, author, publisherId, publishDate, isbn, wordsCount, unitPrice, contentDescription, AurhorDescription, EditorComment, CategoryId, quantity, wwwimage, address, baoyou);
	}

	@Override
	public List<Publishers> getPublishersall() {
		// TODO Auto-generated method stub
		return bookdao.getPublishersall();
	}

	@Override
	public List<Book> getlikeBooks(String title) {
		// TODO Auto-generated method stub
		return bookdao.getlikeBooks(title);
	}

	@Override
	public List<Categories> getCategoriesall() {
		// TODO Auto-generated method stub
		return bookdao.getCategoriesall();
	}

	@Override
	public List<Book> getpubIdBooks(int id) {
		// TODO Auto-generated method stub
		return bookdao.getpubIdBooks(id);
	}

	@Override
	public List<Book> getcateIdBooks(int id) {
		// TODO Auto-generated method stub
		return bookdao.getcateIdBooks(id);
	}

}
