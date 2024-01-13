package com.qa.BootCamp_Easy_Program;

public class OddOrEven_Number {

	public static void main(String[] args) {
		int[] numbers = { 12, 8, 9, 13 };

		for (int number : numbers) {
			if (isEven(number)) {
				System.out.println("Even number is" + " " + number);
			} else {
				System.out.println("Odd number is" + " " + number);
			}

		}

	}

	private static boolean isEven(int number) {

		return number % 2 == 0;
	}

}
