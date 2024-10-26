package com.lavanya.lesson02.assignment;

public class Temporary extends Employee{
	
	public Temporary(String name,String id,String employeeType,int salary) {
		super(name,id,employeeType,salary);
	}
	
	public void displayEmployeeDetails() {
		System.out.println("Hello This is me Temporary Employee");
		super.displayEmployeeDetails();
	}
	
	
}
