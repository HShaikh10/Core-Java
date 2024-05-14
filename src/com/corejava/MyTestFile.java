package com.corejava;
import java.io.File;
import java.util.Scanner;
/**
 * This class is used for myTestFile Scanner Class Example
 * @author Hasnain
 */
public class MyTestFile {

	public static void main(String[] args) {
		try {
			File file = new File("TestFile.txt");
			if (file.exists()) {
				System.out.println("File Created" + file.getAbsolutePath());
			} else {
				System.out.println("File Exists in class");
			}
		} catch (Exception e) {
			System.out.println("Erorr");
			e.printStackTrace();
		}
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter username");
		String userName = scanner.nextLine();
		System.out.println("Enter city");
		String city = scanner.nextLine();
		System.out.println("State");
		String state = scanner.nextLine();
		System.out.println("Country");
		String country = scanner.nextLine();
		System.out.println("Your name is: " + userName);
		System.out.println("Your city is: " + city);
		System.out.println("Your state is: " + state);
		System.out.println("Your counry is: " + country);
		scanner.close();
	}

}