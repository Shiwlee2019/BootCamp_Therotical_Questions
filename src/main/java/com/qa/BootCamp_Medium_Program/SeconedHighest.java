package com.qa.BootCamp_Medium_Program;

import java.util.Arrays;

public class SeconedHighest {
	/* arr[]= {1,9,5,6,9,7,10,12};
	 * second highest number is 10
	 * sort the array and pick the number at s-2 index
	 * Time complexity of sorting an array is o(nlogn)
	 * Sorting approach does not work if the element of array is repeated
	 */

	public static void main(String[] args) {
		//unsorted array
		int[] num = {1,9,5,6,9,7,10,12};
		int s = num.length;
	//Sorted the array
		Arrays.sort(num);
		System.out.println("SeconedHighest Number is:"+num[s-2]);

}
	}

