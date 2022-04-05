package com.company.university.beans;

import org.springframework.data.annotation.Id;

/**
 * 
 * @author Chetan
 * @version 2.0
 * @see Employee bean class
 *
 */


public class University {
	
	@Id
	private Integer empId;
	private String username;
	private String password;
	private String name;
	
	private String departmentName;
	private String emailId;
	private String programDetails;
	private int experience;
	
	private String mobileNumber;
	
	private String feedback;
	
	
	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", username=" + username + ", password=" + password + ", name=" + name
				+ ", companyName=" + departmentName + ", emailId=" + emailId + ", mobileNumber=" + mobileNumber
				+ ", feedback=" + feedback + ", programDetails=" + programDetails + ", progress=" + experience + "]";
	}
	public University() {
	}
	
	
	public University(int empId, String username, String password, String name, String departmentName, String emailId,
			String mobileNumber, String feedback, String programDetails, int experience) {
		this.empId = empId;
		this.username = username;
		this.password = password;
		this.name = name;
		this.departmentName = departmentName;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.feedback = feedback;
		this.programDetails = programDetails;
		this.experience = experience;
	}
	

	/**
	 * 
	 * @author Chetan
	 * @version 2.0
	 * @see Employee getter and setter function
	 *
	 */
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setCompanyName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public String getProgramDetails() {
		return programDetails;
	}
	public void setProgramDetails(String programDetails) {
		this.programDetails = programDetails;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int Experience) {
		this.experience = Experience;
	}
	

}
