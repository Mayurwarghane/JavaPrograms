package com.velocity.java.thisprograms;

public class ThisVariableMethod {
	int id, year;
	String name;
	double salary;

	public ThisVariableMethod(int id, String name, double salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
		this.disp();
	}

	public void disp() {
		System.out.println("Id: " + id + "\nName: " + name + "\nSalary: " + salary);
	}

	public static void main(String[] args) {
		ThisVariableMethod thisvariablemethod = new ThisVariableMethod(101, "Mayur warghane", 25000);
	}
}
