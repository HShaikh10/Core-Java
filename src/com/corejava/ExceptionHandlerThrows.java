package com.corejava;
/**
 * This class is used for Exception Handler using Throws Example
 * @author Hasnain
 */
public class ExceptionHandlerThrows {

		/* Static method for arithmetic exception using throws keyword */
		public static void check() throws ArithmeticException {
			System.out.println("Inside check function");
			throw new ArithmeticException("demo");
		}
		public static void main(String args[]) {
			try {
				check();
			} catch (ArithmeticException e) {
				System.out.println("caught" + e);
			}
		}

}