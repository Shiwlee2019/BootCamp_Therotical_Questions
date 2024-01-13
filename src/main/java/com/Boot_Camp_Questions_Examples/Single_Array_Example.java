package com.Boot_Camp_Questions_Examples;

public class Single_Array_Example {
	public static void main(String[] args) {

		int[] intArray = { 10, 20, 30 };
		char[] charArray = { 's', 'h', 'a' };
		String[] stringArray = { "Hello", "Mr", "Kumar" };

		for (int i = 0; i < intArray.length; i++) {
			System.out.println("Integer" + " " + intArray[i]);
			System.out.println("Character" + " " + charArray[i]);
			System.out.println("String" + " " + stringArray[i]);
			System.out.println("<----><----->");
		}

	}
}