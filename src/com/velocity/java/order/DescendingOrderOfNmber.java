package com.velocity.java.order;

public class DescendingOrderOfNmber {

	public static void main(String[] args) {

		int arr[] = { 5, 2, 8, 7, 1 };
		int temp = 0, i, j;
		System.out.print("Given Array Order: ");
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		for (i = 0; i < arr.length; i++) {
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}

		}
		System.out.println("\n");
		System.out.print("After Descending order: ");
		for (i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}

	}

}
