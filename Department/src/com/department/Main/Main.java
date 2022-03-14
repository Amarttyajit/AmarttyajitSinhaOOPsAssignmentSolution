package com.department.Main;

import com.department.model.AdminDepartment;
import com.department.model.HRDepartment;
import com.department.model.TechDepartment;

public class Main {
	
public static void main(String args[]) {
		
		AdminDepartment adminD= new AdminDepartment();
		
		System.out.print("Welcome to ");
		adminD.departmentName();
		adminD.getTodaysWork();
		adminD.getWorkDeadline();
		adminD.isTodayAHoliday();
		System.out.println();
		
		HRDepartment hrD= new HRDepartment();
		
		System.out.print("Welcome to ");
		hrD.departmentName();
		hrD.doActivity();
		hrD.getTodaysWork();
		hrD.getWorkDeadline();
		hrD.isTodayAHoliday();
		System.out.println();
		
		TechDepartment techD= new TechDepartment();
		
		System.out.print("Welcome to ");
		techD.departmentName();
		techD.getTodaysWork();
		techD.getWorkDeadline();
		techD.getTechStackInformation();
		techD.isTodayAHoliday();
	
	}

}



