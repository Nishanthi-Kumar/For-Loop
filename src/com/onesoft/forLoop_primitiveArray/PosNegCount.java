package com.onesoft.forLoop_primitiveArray;

public class PosNegCount {
	public static void main(String[] args) {
		int[]nums= {56,-97,77,55,-92,-11,68,34};
		int pcount=0;
		int ncount=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>0) {
	           pcount++;
			}else {
				ncount++;
			}
		}
		System.out.println(pcount);
		System.out.println(ncount);
	}

}
