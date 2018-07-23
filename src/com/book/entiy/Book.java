package com.book.entiy;

import java.io.Serializable;

import javax.persistence.Basic;

public class Book {
	
	private int id;
	private String title;
	private String author;
	private int publisherId;
	private String publishDate;
	private String isbn;
	private int wordsCount;
	private float unitPrice;
	private String contentDescription;
	private String AurhorDescription;
	private String EditorComment;
	private String TOC;
	private int CategoryId;
	private int Clicks;
	private String BooksImages;
	private int quantity;
	private String wwwimage;
	private String souhuo;
	private String address;
	private String baoyou;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPublisherId() {
		return publisherId;
	}
	public void setPublisherId(int publisherId) {
		this.publisherId = publisherId;
	}
	public String getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getWordsCount() {
		return wordsCount;
	}
	public void setWordsCount(int wordsCount) {
		this.wordsCount = wordsCount;
	}
	public float getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getContentDescription() {
		return contentDescription;
	}
	public void setContentDescription(String contentDescription) {
		this.contentDescription = contentDescription;
	}
	public String getAurhorDescription() {
		return AurhorDescription;
	}
	public void setAurhorDescription(String aurhorDescription) {
		AurhorDescription = aurhorDescription;
	}
	public String getEditorComment() {
		return EditorComment;
	}
	public void setEditorComment(String editorComment) {
		EditorComment = editorComment;
	}
	public String getTOC() {
		return TOC;
	}
	public void setTOC(String tOC) {
		TOC = tOC;
	}
	public int getCategoryId() {
		return CategoryId;
	}
	public void setCategoryId(int categoryId) {
		CategoryId = categoryId;
	}
	public int getClicks() {
		return Clicks;
	}
	public void setClicks(int clicks) {
		Clicks = clicks;
	}
	public String getBooksImages() {
		return BooksImages;
	}
	public void setBooksImages(String booksImages) {
		BooksImages = booksImages;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getWwwimage() {
		return wwwimage;
	}
	public void setWwwimage(String wwwimage) {
		this.wwwimage = wwwimage;
	}
	public String getSouhuo() {
		return souhuo;
	}
	public void setSouhuo(String souhuo) {
		this.souhuo = souhuo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBaoyou() {
		return baoyou;
	}
	public void setBaoyou(String baoyou) {
		this.baoyou = baoyou;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", publisherId=" + publisherId
				+ ", publishDate=" + publishDate + ", isbn=" + isbn + ", wordsCount=" + wordsCount + ", unitPrice="
				+ unitPrice + ", contentDescription=" + contentDescription + ", AurhorDescription=" + AurhorDescription
				+ ", EditorComment=" + EditorComment + ", TOC=" + TOC + ", CategoryId=" + CategoryId + ", Clicks="
				+ Clicks + ", BooksImages=" + BooksImages + ", quantity=" + quantity + ", wwwimage=" + wwwimage
				+ ", souhuo=" + souhuo + ", address=" + address + ", baoyou=" + baoyou + "]";
	}
	
	
	
}
