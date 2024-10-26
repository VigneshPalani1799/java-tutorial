package com.lavanya.lesson03.methodoverloading;

public class MethodOverloading {
	
	int ab=0;
	public int add(int a,int b) {
		ab = 10;
		return add(a,b,0);
	}
	
	public int add(int a,int b,int c) {
		ab=10;
		return a+b+c;
	}
	
	public double add(double a,double b) {
		return a+b;
	}
	
}
