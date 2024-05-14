package com.corejava;
import java.util.Scanner;
/**
 * This class is used for Calculator Example
 * @author Hasnain
 */
public class Calculator {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			try {
			System.out.println("Enter Principle Amount");
			double principle = scanner.nextDouble();
			System.out.println("Enter Rate: ");
			double rate = scanner.nextDouble();
			System.out.println("Enter time: ");
			double time = scanner.nextDouble();
			rate = rate / (12 * 100);
			time = time * 12;
			double emi = (principle * rate * Math.pow(1 + rate, time)) / (Math.pow(1 + rate, time) - 1);
			System.out.println("Monthly Emi is: " + emi + "\n");
			} catch (Exception e) {
			System.out.println("Invalid input. Please enter valid numeric values.");
			} finally {
				scanner.close();
			}
	}

}