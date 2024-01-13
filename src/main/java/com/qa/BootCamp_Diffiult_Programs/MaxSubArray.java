package com.qa.BootCamp_Diffiult_Programs;

public class MaxSubArray {

	public static void main(String[] args) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSumArray(nums));

	}

	public static int maxSumArray(int[] nums) {
		int  sum =0;
		int max_size =nums[0];
		for (int i=0; i<nums.length; i++){
			sum = sum+nums[i];
			if(sum>max_size)
			{
				max_size =sum;
			}
			if(sum<0)
			{
				sum =0;
			}
			}
		
		return max_size;
	}
}
