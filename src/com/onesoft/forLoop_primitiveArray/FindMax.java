package com.onesoft.forLoop_primitiveArray;

public class FindMax {
	public static void main(String[] args) {
		int[]nums= {12,33,56,78,35,95,67};
		int max=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>max) {
				max=nums[i];
			}
		}
		System.out.println(max);
		
	}

}
