package com.qa.BootCamp_Medium_Program;

public class StringReverse {

	public static void main(String[] args) {
		String str = "JavaAndSelenium";
		// convert string into charArray
		char[] chars = str.toCharArray();
		//to check the length of charArray
		int length =chars.length;
		System.out.println("String lehgth is:"+ length);
		//using for loop to reverse the String
		for(int i= length-1;i>=0; i--) {
		System.out.print(chars[i]);	
		}
	} 

}
