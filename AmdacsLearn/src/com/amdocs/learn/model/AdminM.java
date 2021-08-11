package com.amdocs.learn.model;

public class AdminM {
	private int Admin_id;
	private String Name;
	private String Email;
	private String Password;
	public AdminM()
	{
		
	}
	public AdminM(int admin_id, String name, String email, String password) {
		super();
		Admin_id = admin_id;
		Name = name;
		Email = email;
		Password = password;
	}
	public AdminM(String name, String email, String password) {
		super();
		Name = name;
		Email = email;
		Password = password;
	}
	/**
	 * @return the admin_id
	 */
	public int getAdmin_id() {
		return Admin_id;
	}
	/**
	 * @param admin_id the admin_id to set
	 */
	public void setAdmin_id(int admin_id) {
		Admin_id = admin_id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return Email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		Email = email;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return Password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		Password = password;
	}
	

}