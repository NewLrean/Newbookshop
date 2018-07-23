package com.book.utilPage;

import java.util.List;

import com.book.entiy.Book;

public class Page {
	private List<Book> records;
	
	private int currentPageNum=1;//当前页面
	
	private int totalPage;//总页面数
	private int pageSize=16;//每页显示
	private int totalRecord;//总记录条数
	private int prePageNum;//上一页
	private int nextPageNum;//下一页
	private int startIndex;//刚开始显示
	
	
}
