package com.onesoft.forLoop_primitiveArray;

public class OddEvenArray {
	public static void main(String[] args) {
		int[] nums= {100,859,357,678,245,908};
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2==0) {
				System.out.println(nums[i]+" is even");
			}else {
				System.out.println(nums[i]+" is odd");
			}
		}
	}

}
