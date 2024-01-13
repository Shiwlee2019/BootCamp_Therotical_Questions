package com.Boot_Camp_Questions_Examples;

public class EvenNumbers {
	public static void main(String[] args) {
		// Using a for loop to iterate from 1 to 100
		int number =100;
		System.out.println("list of even number from 1 to "
				+ number+":");
		
		for (int i = 1; i <=100 ; i++) {
			// Checking if the current number is even
			if (i % 2 == 0) {
				// Printing the even number
				System.out.print(i+ " ");
			}
		}
	}
}
