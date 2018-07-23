package com.book.entiy;

public class User_log {
	private int id;
	private String username;
	private String operation;
	private String time;
	private String exception;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getException() {
		return exception;
	}
	public void setException(String exception) {
		this.exception = exception;
	}
	@Override
	public String toString() {
		return "User_log [id=" + id + ", username=" + username + ", operation=" + operation + ", time=" + time
				+ ", exception=" + exception + "]";
	}
	
}
