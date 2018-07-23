package com.book.entiy;

public class Orderbook {
	private int id;
	private int orderId;
	private int bookId;
	private int Quantity;
	private float UnitPrice;
	private int amount;
	private char orderDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public float getUnitPrice() {
		return UnitPrice;
	}
	public void setUnitPrice(float unitPrice) {
		UnitPrice = unitPrice;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public char getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(char orderDate) {
		this.orderDate = orderDate;
	}
	@Override
	public String toString() {
		return "Orderbook [id=" + id + ", orderId=" + orderId + ", bookId=" + bookId + ", Quantity=" + Quantity
				+ ", UnitPrice=" + UnitPrice + ", amount=" + amount + ", orderDate=" + orderDate + "]";
	}
	
	
	
}
