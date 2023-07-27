package com.velocity.java.starpatternprograms;

public class StarPatternForAscendingOrder {

	public static void main(String[] args) {
		int i = 5, j = 5;
		for (i = 0; i < 5; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("* ");

			}
			System.out.println();
		}

	}
}
