package com.corejava;
/**
 * This class is used for Hierarchy Inheritance Example 
 * @author Hasnain
 */
public class Animal {

	/* Method for eat */
	public void eat() {
		System.out.println("eating...");
	}

}
public class Dog extends Animal {

	/* Method for bark */
	public void bark() {
		System.out.println("barking...");
	}

}
public class Cat extends Animal {

	/* Method for meow */
	public void meow() {
		System.out.println("meowing...");
	}

}
public class TestInheritance {

	public static void main(String args[]) {
		Cat cat = new Cat();
		cat.meow();
		cat.eat();
	}

}