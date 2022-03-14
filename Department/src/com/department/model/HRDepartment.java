package com.department.model;

public class HRDepartment extends SuperDepartment {
	
	public String departmentName() {
		System.out.println("HR Department ");
		return null;
	}
public String getTodaysWork() {
	System.out.println("Fill today’s timesheet and mark your attendance");
	return null;
		
	}
public String getWorkDeadline() {
	System.out.println("Complete by EOD ");
	return null;
}
public String doActivity() {
	System.out.println("team Lunch ");
	return null;
}
}
