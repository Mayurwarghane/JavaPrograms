package com.velocity.java.superprograms;

public class SuperVariableMethodImple extends SuperVariableMethod {

	String name = "Warghane";
	String city = "Nagpur";

	void display() {
		super.display();
		System.out.println("SureName: " + name);
		System.out.println("City: " + super.city);
		System.out.println("Current City: " + city);

	}
}
