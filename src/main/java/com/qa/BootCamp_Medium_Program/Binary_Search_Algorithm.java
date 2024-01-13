package com.qa.BootCamp_Medium_Program;

public class Binary_Search_Algorithm {
public static void main(String[] args) {
		
		int [] sortedArray = {12,22,32,42,52,62,72,82,92,102};
		int targetElement = 42;
		int result = binarySearch(sortedArray, targetElement);
		
		if(result == -1) {
			 System.out.println("Element not present in array");
			 
		}else {
			System.out.println("Element found at index"+ " "+ result);
		}
}
 public static int binarySearch(int[]arr, int target) {
		 int low =0;
         int high = arr.length -1;
         
         while(low<= high) {
        	 int mid = low + (high - low)/2;
        	 
        	 if(arr[mid] == target) {
        		 return mid;
        	 }
         
         if(arr[mid] < target) {
        	  low = mid+1;
         }
         else {
        	 high = mid -1;
         }
        }
		return -1;
	}

}


