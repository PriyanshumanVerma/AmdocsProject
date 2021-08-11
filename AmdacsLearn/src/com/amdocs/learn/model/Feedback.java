package com.amdocs.learn.model;

public class Feedback {
 private int U_id;
 private String name;
 private String email;
 private int Fid;
 private String feedback;
public Feedback() {
	super();
	// TODO Auto-generated constructor stub
}
public Feedback(int u_id, String name, String email, int fid, String feedback) {
	super();
	U_id = u_id;
	this.name = name;
	this.email = email;
	Fid = fid;
	this.feedback = feedback;
}
/**
 * @return the u_id
 */
public int getU_id() {
	return U_id;
}
/**
 * @param u_id the u_id to set
 */
public void setU_id(int u_id) {
	U_id = u_id;
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
 * @return the fid
 */
public int getFid() {
	return Fid;
}
/**
 * @param fid the fid to set
 */
public void setFid(int fid) {
	Fid = fid;
}
/**
 * @return the feedback
 */
public String getFeedback() {
	return feedback;
}
/**
 * @param feedback the feedback to set
 */
public void setFeedback(String feedback) {
	this.feedback = feedback;
}
 
 
}
