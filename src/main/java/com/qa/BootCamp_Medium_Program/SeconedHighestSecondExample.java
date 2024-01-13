package com.qa.BootCamp_Medium_Program;

import java.util.Arrays;

import java.util.Arrays;

public class SeconedHighestSecondExample {
	/*
	 * arr[]= {1,12,5,6,9,7,10,12}; second highest number is 10 sort the array and
	 * pick the number at s-2 index Time complexity of sorting an array is o(nlogn)
	 * Sorting approach does not work if the element of array is repeated
	 */

	public static void main(String[] args) {
		// unsorted array
		int[] num = { 1, 12, 5, 6, 9, 7, 10, 12 };
		int n = num.length;

		int highest = Integer.MIN_VALUE;
		int seconedHighest = Integer.MIN_VALUE;
		// traversing Array
		for (int i = 0; i < n; i++) {
			if (num[i] > highest) {
				seconedHighest = highest;
				highest = num[i];
			}
			if (num[i] < highest && num[i]>seconedHighest ) {
				seconedHighest = num[i];
			}
		}

		System.out.println("SeconedHighest Number is:" + seconedHighest);
	}
}