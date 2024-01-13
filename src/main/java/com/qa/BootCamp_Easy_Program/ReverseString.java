package com.qa.BootCamp_Easy_Program;

public class ReverseString {
	public static void main(String[] args) {
		String str = "I love Java";
		String newStr = "";
		for(int i =0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			newStr = ch+newStr;
		}
		System.out.println(newStr);
		
			
		
	}
}
