package com.Boot_Camp_Questions_Examples;

public class SumOfFirst100Numbers {
	public static void main(String[] args) {
		// Initializing a variable to store the sum
		int sum = 0;

		// Using a for loop to iterate from 1 to 100
		for (int i = 1; i <= 100; i++) {
			// Adding the current number to the sum
			sum += i;
		}

		// Printing the sum
		System.out.println("Sum of the first 100 numbers is: " + sum);
	}
}
