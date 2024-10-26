package com.lavanya.lesson02.assignment;

public class Employee {
	
	private String employeeName;
	private String employeeId;
	private String employeeType;
	private int salary;
	
	public Employee(String employeeName, String employeeId, String employeeType, int salary) {
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.employeeType = employeeType;
		this.salary = salary;
	}
	
	public void displayEmployeeDetails() {
		System.out.println("Employee Name is "+this.employeeName);
		System.out.println("Employee ID is "+this.employeeId);
		System.out.println("Employee Type is "+this.employeeType);
		System.out.println("Employee Salary is "+this.salary);
	}
	
	public void setSalary(int salary) {
		if(salary>0)
			this.salary = salary;
		else
			this.salary = 0;
	}
	
	
	
}
