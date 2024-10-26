package com.lavanya.lesson04.abstractlesson.interfaceexample;

public interface Draw {
	
	void draw();
	
	default void display() {
		System.out.println("Understand I'm a shape");
	}
	
//	void display();

}
