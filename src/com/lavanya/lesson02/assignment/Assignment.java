package com.lavanya.lesson02.assignment;

public class Assignment {
	
	public static void main(String[] args) {
		Permanent permanent = new Permanent("Vignesh","1234","Permanent",50000);
		Temporary temporary = new Temporary("Lavanya","2345","Temporary",80000);
		
		permanent.displayEmployeeDetails();
		temporary.displayEmployeeDetails();
		permanent.setSalary(-10000);
		permanent.displayEmployeeDetails();
	}

}
