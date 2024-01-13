package com.qa.BootCamp_Medium_Program;

public class Factoral_Num_With_Recursion {
	public static void main(String[] args) {
		int num = 50;

		if (num < 0) {

			System.out.println("Plese enter a non-negative integer.");
		} else {
			long factorialresult = calculateFactorial(num);
			System.out.println("Factoral of" + " " + num + " " + "is" + " " + factorialresult);
		}

	}

	private static long calculateFactorial(int num) {
		if (num == 0 || num == 1) {
			return 1;
		} else {

		}
		return num * calculateFactorial(num - 1);
	}

}
