package com.qa.BootCamp_Medium_Program;

import java.util.Scanner;

public class BubbleSorting {
	static void bubbleSort(int []arr) {
		for (int i= 0; i<arr.length-1; i++) {
			for (int j = 0; j <arr.length-i-1; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}

			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// number of element from the user
		int n = scan.nextInt();
		//array of the size
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}

		bubbleSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
	}
}
