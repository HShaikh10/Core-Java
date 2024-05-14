package com.corejava;
import java.util.Scanner;
/**
 * This class is used for String Example Example
 * @author Hasnain
 */
public class StringExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first string:");
		String string = scanner.nextLine();
		System.out.println("Enter the second string:");
		String string2 = scanner.nextLine();
		System.out.println("Concatenation: " + string.concat(string2));
		System.out.println("Equals: " + string.equals(string2)); 
		if (string.length() >= 3) {
		System.out.println("Character at index 2: " + string.charAt(2));
		} else {
		System.out.println("First string is too short to get character at index 2.");
		}
	System.out.println("Lowercase: " + string.toLowerCase());
	System.out.println("Uppercase: " + string2.toUpperCase());
	System.out.println("Comparison: " + string.compareTo(string2));
	System.out.println("Length of second string: " + string2.length());
	System.out.println("Splitting first string using second string: ");
	for (String s : string.split(string2)) {
		System.out.println(s);
	}
	scanner.close();
	}

}