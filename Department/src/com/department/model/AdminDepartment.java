package com.department.model;

public class AdminDepartment extends SuperDepartment {
	
	public String departmentName() {
		System.out.println("Admin Department");
		return null;
	}	
	public String getTodaysWork() {
		System.out.println("Complete your documents submission");
		return null;
			
		}
	public String getWorkDeadline() {
		System.out.println("Complete by EOD ");
		return null;
	}
	

}
