package com.qa.BootCamp_Easy_Program;

import java.util.Scanner;

public class FahrenheithToCelcius {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter tempreture in fahrenheit:");
		double fahrenheit = scanner.nextDouble();

		double celsius = (fahrenheit - 32) * 5 / 9;

		System.out.println("temperature in celsius:" + celsius);
		scanner.close();

	}
}
