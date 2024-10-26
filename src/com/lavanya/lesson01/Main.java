package com.lavanya.lesson01;

import java.util.Scanner;

//Data types

public class Main {

	public static void main(String[] args) {
		int b = 65;//Implicit conversion
		short s = 10000;
		int i = 1234569;
		long l = 9223372036854775807l;
		float f = 45.6f;
		double d = 987654321.0;
		boolean bool = true;
		char c = 'l';
		double dou = 1298.345;
		byte by = (byte) dou;//Explicit conversion
		String names = "lavanyavigneshpraveenaishu";
		String[] name = names.split("");
		int[] marks = new int[5];
		marks[0] = 45;
		StringBuilder sb = new StringBuilder("lavanya");
		sb.setCharAt(0, 'k');
		
//		for(int j=0;j<marks.length;j++) {
//			System.out.println(marks[j]);
//		}
		
//		for(String nam:name) {
//			System.out.println(nam);
//		}
		
		String input = "lavanya";
		int sum=0;
		for(int k=0;k<input.length();k++) {
			int ascii = input.charAt(k);
			sum+=ascii;
		}
		System.out.println(sum);
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		System.out.println(num1+num2);
	}
	
}


//Explore strings built-in functions.
//Explore Arrays built-in functions.


//Programming in java notepad
//input -> "vignesh,aishu,praveen,lavanya,sarala"
//output -> 
//vignesh-7
//aishu-5

//Explicit conversion
//input = lavanya
//output = summation