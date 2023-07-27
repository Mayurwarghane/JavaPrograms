package com.velocity.java.finalprograms;

public class FinalVariableMethod {
	int id;
	String name;
	final String college = "RCERT";

	public FinalVariableMethod(int id, String name) {
		this.name = name;
		this.id = id;
		// college="BIT";
		System.out.println("Id: " + id + " Name: " + name + " College " + college);

	}

	public static void main(String[] args) {
		new FinalVariableMethod(101, "Mayur");
		new FinalVariableMethod(102, "Pavan");

	}

}
