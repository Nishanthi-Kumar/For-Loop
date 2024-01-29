package com.onesoft.forLoop_indexArray;

public class Break_Skip {
	public static void main(String[] args) {
		int num=10;
		for(int i=0;i<=num;i++) {
			if(i%2==0) {
				continue;
			}
			else if(i==10) {
				break;
			}
			System.out.println(i);
		}
	}

}
