package com.velocity.java.stringprograms;

public class StringCountUpperAndLowerCase {

	public static void main(java.lang.String[] args) {
		String name = "AaabBBczTTt";
		int smallLetter = 0, capitalLetter = 0;

		for (int i = 0; i < name.length(); ++i) {
			char ch = name.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				++smallLetter;
			} else if (ch >= 'A' && ch <= 'Z') {
				++capitalLetter;

			}

		}
		System.out.println("This is small letter count in Given string: " + smallLetter);

		System.out.println("This is capital letter count in Given string: " + capitalLetter);

	}
}
