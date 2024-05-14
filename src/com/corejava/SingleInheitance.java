package com.corejava;
/**
 * This class is used for Map Collection Example
 * @author Hasnain
 */
public class Animal {

	/* eat method for eating */
	public void eat() {
		System.out.println("eating...");
	}

}
public class Dog extends Animal {

	/* eat method for barking */
	public void bark() {
		System.out.println("barking...");
	}

}
public class TestInheritance {

	public static void main(String args[]) {
		Dog dog = new Dog();
		dog.bark();
		dog.eat();
	}

}