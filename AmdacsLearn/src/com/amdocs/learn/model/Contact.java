package com.amdocs.learn.model;

public class Contact{
	private int uid;
	private String name;
	private String email;
	private int phoneNo;
	private String message;
	private int Cid;
	public Contact() {
		
		// TODO Auto-generated constructor stub
	}
	public Contact(int uid, String name, String email, int phoneNo, String message, int cid) {
		super();
		this.uid = uid;
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.message = message;
		Cid = cid;
	}
	/**
	 * @return the uid
	 */
	public int getUid() {
		return uid;
	}
	/**
	 * @param uid the uid to set
	 */
	public void setUid(int uid) {
		this.uid = uid;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the phoneNo
	 */
	public int getPhoneNo() {
		return phoneNo;
	}
	/**
	 * @param phoneNo the phoneNo to set
	 */
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the cid
	 */
	public int getCid() {
		return Cid;
	}
	/**
	 * @param cid the cid to set
	 */
	public void setCid(int cid) {
		Cid = cid;
	}
	
	
}