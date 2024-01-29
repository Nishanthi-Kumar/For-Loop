package com.onesoft.forLoop_primitiveArray;

public class FindMini {
	public static void main(String[] args) {
		int []nums= {35,57,68,6,47,97};
		int mini=nums[0];
		for(int i=0;i<nums.length;i++) {
			if(nums[i]<mini) {
				mini=nums[i];
				
			}
		}
		System.out.println(mini);
	}

}
