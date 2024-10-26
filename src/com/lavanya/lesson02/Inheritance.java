package com.lavanya.lesson02;

import com.lavanya.lesson02.inheritance.Animal;
import com.lavanya.lesson02.inheritance.Cat;
import com.lavanya.lesson02.inheritance.Dog;

public class Inheritance {
	
	public static void main(String[] args) {
		Animal animalObject = new Animal();
		
		String animalName = animalObject.getName();
		System.out.println(animalName);
		
		animalObject.setName("Dog");
		System.out.println(animalObject.getName());
		
		Dog dog = new Dog("Julie");
		System.out.println(dog.getName());
		Dog dog1 = new Dog("Vicky");
		System.out.println(dog1.getName());
		Cat cat = new Cat("Kutty");
		cat.beingBossy();
		
	}

}

//Create a class Student and Assign Name, Id, Gender, Course - 01
//Create a class Employee and Extend Temporary Employee and Permanent Employee
// Add functionalities like String Id, String name, String Department differentContractType
//write a function stating how long will they work.