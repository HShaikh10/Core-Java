package com.corejava;
/**
 * This class is used for abstraction
 * @author Hasnain 
 */
abstract class Animal {

	public abstract void animalSound();
	/* Sleep Method */
	public void sleep() {
		System.out.println("Cat");
	}

}
public class Cat extends Animal {

	/* Animal Sound method */
	public void animalSound() {
		System.out.println("Cat");
	}	

}
public class Main {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.animalSound();
		cat.sleep();
	}

}