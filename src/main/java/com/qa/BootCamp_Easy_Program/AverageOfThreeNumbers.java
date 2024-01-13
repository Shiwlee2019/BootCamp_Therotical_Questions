package com.qa.BootCamp_Easy_Program;

public class AverageOfThreeNumbers {

	public static void main(String[] args) {

		int num1 = 20;
		int num2 = 30;
		int num3 = 50;

		int average = calculateAverage(num1, num2, num3);
		System.out.println("The given numbers:" + num1 + "," + num2 + "," + num3);
		System.out.println("The average of the three numbers are :" + average);

	}

	private static int calculateAverage(int num1, int num2, int num3) {

		return (num1 + num2 + num3) / 3;
	}

}