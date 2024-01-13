package com.qa.BootCamp_Medium_Program;

public class Plaindrome_Num_Or_not {
	public static void main(String[] args) {
		int inputnum = 12321;
		
		if(isPalindrome(inputnum)) {
			System.out.println("\""+ inputnum+ "\"is a palindrome.");
		}else {
			System.out.println("\""+ inputnum + "\"is not a palindrome.");
			
		}

	}

	private static boolean isPalindrome(int num) {
        
        String str = String.valueOf(num);

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

