package com.corejava;
/**
 * This class is used for Compile time Polymorphism Example
 * @author Hasnain
 */
public class CompiletimePolymorphism {

	public static void main(String args[]) {
		CompileTimePolymorphismExample compileTimePolymorphismExample = new CompileTimePolymorphismExample();
		compileTimePolymorphismExample.display();
		compileTimePolymorphismExample.display("Polymorphism");
	}

}
	public class CompileTimePolymorphismExample {

		/* The display method is used for without parameter example */
		public void display() {
			System.out.println("In Display without parameter");
		}

		/* The display method is used for with parameter example */
		public void display(String value) {
			System.out.println("In Display with parameter " + value);
		}

}