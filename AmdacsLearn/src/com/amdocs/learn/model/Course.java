package com.amdocs.learn.model;

public class Course {
	private int course_id;
	private String name;
	private String description;
	private int fees;
	private String resource;
	/**
	 * @return the course_id
	 */
	public int getCourse_id() {
		return course_id;
	}
	/**
	 * @param course_id the course_id to set
	 */
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the fees
	 */
	public int getFees() {
		return fees;
	}
	/**
	 * @param fees the fees to set
	 */
	public void setFees(int fees) {
		this.fees = fees;
	}
	/**
	 * @return the resource
	 */
	public String getResource() {
		return resource;
	}
	/**
	 * @param resource the resource to set
	 */
	public void setResource(String resource) {
		this.resource = resource;
	}
	public Course(int course_id, String name, String description, int fees, String resource) {
		super();
		this.course_id = course_id;
		this.name = name;
		this.description = description;
		this.fees = fees;
		this.resource = resource;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
