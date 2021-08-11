package com.amdocslearn.dao;

import java.sql.Connection;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.amdocs.learn.model.Contact;


public class ContactDao {
	private String dbUrl = "jdbc:mysql://localhost:3306/amdocs";
	private String dbUname = "root";
	private String dbPassword = "root";
	private String dbDriver = "com.mysql.cj.jdbc.Driver";
	
	public void loadDriver(String dbDriver)
	{
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Connection getConnection()
	{
		Connection con = null;
		try {
			con = DriverManager.getConnection(dbUrl, dbUname, dbPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	
	public String insert(Contact contact)
	{
		loadDriver(dbDriver);
		Connection con = getConnection();
		String result = "Data entered successfully";
		String sql = "insert into contact"+"(user_id,name,email,phone_no,message,contact_id)Values"+"(?,?,?,?,?,?)";
		
		PreparedStatement ps;
		try {
		ps = con.prepareStatement(sql);
		ps.setInt(1,contact.getUid());
		ps.setString(2, contact.getName());
		ps.setString(3, contact.getEmail());
		ps.setInt(4, contact.getPhoneNo());
		ps.setString(5, contact.getMessage());
		ps.setInt(6, contact.getCid());
		ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = "Data not entered";
		}
		return result;
	}
}
