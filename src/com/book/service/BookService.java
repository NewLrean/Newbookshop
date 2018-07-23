package com.book.service;

import java.util.List;

import com.book.entiy.Book;
import com.book.entiy.Categories;
import com.book.entiy.Publishers;

public interface BookService {
	public boolean addBook(Book book);
	public List<Book> getBooksall();
	public boolean deleteBook(int id);
	public boolean updateBook(int id,String name,String author,int publisherId,String publishDate,
			String isbn,int wordsCount,float unitPrice,String contentDescription,String AurhorDescription,
			String EditorComment,int CategoryId,int quantity,String wwwimage,String address,String baoyou);
	public List<Publishers> getPublishersall();
	public List<Book> getlikeBooks(String title);
	public List<Categories> getCategoriesall();
	public List<Book> getpubIdBooks(int id);
	public List<Book> getcateIdBooks(int id);
}
