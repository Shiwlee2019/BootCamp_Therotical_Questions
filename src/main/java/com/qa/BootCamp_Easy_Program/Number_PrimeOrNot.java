package com.qa.BootCamp_Easy_Program;

public class Number_PrimeOrNot {
	public static void main(String[] args) {
		int[] numbers = { 10, 2, 20, 97, 43, 19, 7 };
		for (int number : numbers) {
			if (isPrime(number)) {
				System.out.println(number + " " + "is a prime number!");
			} else {
				System.out.println(number + " " + "is not a prime number!");
			}

		}

	}

	private static boolean isPrime(int number) {

		if (number <= 1) {
			return false;

		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
