package com.velocity.java.starpatternprograms;

public class StarPatternProgram1 {

	public static void main(String[] args) {
		int i = 5, j = 5, k = 0;
		for (i = 0; i < 5; i++) {
			for (j = 5; j > i; j--) {
				System.out.print("*");

			}System.out.println();
			for(k=0;k<=i;k++) {
			System.out.print(" ");
			}
			}

		}

	}

