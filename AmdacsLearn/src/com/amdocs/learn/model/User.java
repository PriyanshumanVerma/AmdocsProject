package com.amdocs.learn.model;

public class User {
	private int id1;
	private String name;
	private int phone_number;
	private String email;
	private String addresss;
	private long date;
	private String password;
	public User()
	{
		
	}
	public User(int id1, String name, int phone_number, String email, String addresss, long date, String password) {
		super();
		this.id1 = id1;
		this.name = name;
		this.phone_number = phone_number;
		this.email = email;
		this.addresss = addresss;
		this.date = date;
		this.password = password;
	}
	
	public User(String name, int phone_number, String email, String addresss, long date, String password) {
		super();
		this.name = name;
		this.phone_number = phone_number;
		this.email = email;
		this.addresss = addresss;
		this.date = date;
		this.password = password;
	}
	public int getId1() {
		return id1;
	}
	public void setId1(int id1) {
		this.id1 = id1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddresss() {
		return addresss;
	}
	public void setAddresss(String addresss) {
		this.addresss = addresss;
	}
	public long getDate() {
		return date;
	}
	public void setDate(long date) {
		this.date = date;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	

}
