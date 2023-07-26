
package com.velocity.java.staticprograms;

import java.util.Scanner;

public class StaticVariablesMethod {
	public static int num1, num2;
	static String name="Mayur";
	Scanner scan = new Scanner(System.in);

	static void getStatic() {
		System.out.println("It is static method");
		
		System.out.println("The name is: "+name);
		
		
	}

	void display() {
		StaticVariablesMethod.getStatic();
		name="warghane";
		System.out.println("The name is: "+name);
		System.out.println("Enter the 1st number: ");
		num1 = scan.nextInt();
		System.out.println("Enter the 2nd number: ");
		num2 = scan.nextInt();
		System.out.println("The result is: " + (num1 + num2));

	}
	static {
		System.out.println("It is static block");
	}

	public static void main(String[] args) {
		StaticVariablesMethod svm=new StaticVariablesMethod();
		svm.display();
	}

}
