package com.model;

public class MessagePojo {

	private int sn;
	private String name;
	private String email;
	private String message;
	private String date;
	public MessagePojo(int sn, String name, String email, String message, String date) {
		super();
		this.sn = sn;
		this.name = name;
		this.email = email;
		this.message = message;
		this.date = date;
		
	}
	public int getSn() {
		return sn;
	}
	public void setSn(int sn) {
		this.sn = sn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
}
