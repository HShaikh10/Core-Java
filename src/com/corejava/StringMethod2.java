package com.corejava;
import java.math.BigDecimal;
import java.util.Scanner;
/**
 * This class is used for String, Integer, BigDecimal Example
 * @author Hasnain
 */
public class StringMethod2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first string:");
		String string1 = scanner.nextLine();
		System.out.println("Enter the second string:");
		String string2 = scanner.nextLine();
		System.out.println("String comparison using ==: " + (string1 == string2));
		System.out.println("String comparison using equals method: " + string1.equals(string2));
		System.out.println("Enter the first integer:");
		int integer1 = scanner.nextInt();
		System.out.println("Enter the second integer:");
		int integer2 = scanner.nextInt();
		System.out.println("Integer comparison using ==: " + (integer1 == integer2));
		System.out.println("Integer comparison using equals method: " + Integer.valueOf(integer1).equals(integer2));
		System.out.println("Enter the first BigDecimal:");
		BigDecimal bigDecimal1 = new BigDecimal(scanner.next());
		System.out.println("Enter the second BigDecimal:");
		BigDecimal bigDecimal2 = new BigDecimal(scanner.next());
		System.out.println("BigDecimal comparison using ==: " + (bigDecimal1 == bigDecimal2));
		System.out.println("BigDecimal comparison using equals method: " + bigDecimal1.equals(bigDecimal2));
		scanner.close();
	}

}