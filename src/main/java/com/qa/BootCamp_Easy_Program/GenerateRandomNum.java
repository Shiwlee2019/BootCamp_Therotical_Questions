package com.qa.BootCamp_Easy_Program;

import java.util.Random;

public class GenerateRandomNum {
	public static void main(String[] args) {

		Random random = new Random();

		int randomNumber = random.nextInt(100) + 1;
		System.out.println("random Number between 1 and 100 is:" + randomNumber);
	}
}
