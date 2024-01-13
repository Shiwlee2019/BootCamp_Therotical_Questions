package com.qa.BootCamp_Easy_Program;

public class Palindrome_or_not {
	public static void main(String[] args) {
		String inputString = "madam";

		if (isPalindrome(inputString)) {
			System.out.println("\"" + inputString + "\"is a palindrome.");
		} else {
			System.out.println("\"" + inputString + "\"is not a palindrome.");

		}

	}

	private static boolean isPalindrome(String str) {
		str = str.toLowerCase().replaceAll("^a-zA-ZO-9", "");

		int left = 0;
		int right = str.length() - 1;

		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

}
