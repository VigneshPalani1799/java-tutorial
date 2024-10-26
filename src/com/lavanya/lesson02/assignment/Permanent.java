package com.lavanya.lesson02.assignment;

public class Permanent extends Employee{
	
	
	public Permanent(String name,String id,String employeeType,int salary) {
		super(name,id,employeeType,salary);
	}
	
	public void displayEmployeeDetails() {
		System.out.println("Hello This is me Permanent Employee");
		super.displayEmployeeDetails();
	}

}
