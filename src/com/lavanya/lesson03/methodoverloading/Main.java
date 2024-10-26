package com.lavanya.lesson03.methodoverloading;

public class Main {

	public static void main(String[] args) {
		MethodOverloading method = new MethodOverloading();
		System.out.println(method.add(5, 10));
		System.out.println(method.add(5,10,15));
		System.out.println(method.add(10.5,99.9));
	}
}
