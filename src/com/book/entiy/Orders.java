package com.book.entiy;

public class Orders {
	private int id;
	private String orderDate;
	private int userId;
	private double TotalPrice;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public double getTotalPrice() {
		return TotalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		TotalPrice = totalPrice;
	}
	@Override
	public String toString() {
		return "Orders [id=" + id + ", orderDate=" + orderDate + ", userId=" + userId + ", TotalPrice=" + TotalPrice
				+ "]";
	}
	
	
}
