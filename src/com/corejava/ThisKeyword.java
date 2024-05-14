package com.corejava;
/**
 * This class is used for This Keyword Example
 * @author Hasnain
*/
public class ThisKeyword {

	int x;
	/* Methos for This Keyword */
	public ThisKeyword(int x) {
		this.x = x;
	}
	public static void main(String[] args) {
		ThisKeyword thisKeyword = new ThisKeyword(5);
		System.out.println("Value of x is: " + thisKeyword.x);
	}

}