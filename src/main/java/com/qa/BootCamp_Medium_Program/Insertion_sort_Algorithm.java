package com.qa.BootCamp_Medium_Program;

import java.util.Arrays;

public class Insertion_sort_Algorithm {

	public static void main(String[] args) {
		int[] numbers = { 95, 89, 76, 65, 52, 43, 36, 25, 19, 12, 6 };
		System.out.println("Original array:" + " " + Arrays.toString(numbers));
		insertationSort(numbers);
		System.out.println("Sorted array" + " " + Arrays.toString(numbers));
	}

	public static void insertationSort(int[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}

	}

}
