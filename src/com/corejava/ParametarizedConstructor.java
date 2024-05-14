package com.corejava;
/**
 * This class is used for Parameterized COnstructor Example 
 * @author Hasnain
 */
public class ParametarizedConstructor {

	String cities;	
	/* Parameterized Constructor */
	public ParametarizedConstructor(String c) {
		cities = c;
		System.out.println("Cities: " + c);

	}
	public static void main(String[] args) {
		ParametarizedConstructor parametarizedConstructor = new ParametarizedConstructor("Ahmedabad");
		ParametarizedConstructor parametarizedConstructor2 = new ParametarizedConstructor("Baroda");
	}

}