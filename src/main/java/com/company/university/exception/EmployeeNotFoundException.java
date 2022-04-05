package com.company.university.exception;

public class EmployeeNotFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	final private String message;
	public EmployeeNotFoundException() {
		this.message="User is not found! Please Try Again ";
	}
	public EmployeeNotFoundException(String msg)
{
		this.message=msg;
		}
	
	public String message() {
		return message;
	}

}
