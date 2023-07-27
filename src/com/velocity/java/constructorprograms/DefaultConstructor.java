package com.velocity.java.constructorprograms;

public class DefaultConstructor {
	int a, b, c;

	public DefaultConstructor() {

		System.out.println("This is default constructor");

	}

	public DefaultConstructor(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		System.out.print("parameterised constructor ");
		System.out.println("A:" + a + " B:" + b + " C:" + c);

	}

	public static void main(String args[]) {
		new DefaultConstructor();// default constructor
		new DefaultConstructor(10, 20, 30);

	}

}
