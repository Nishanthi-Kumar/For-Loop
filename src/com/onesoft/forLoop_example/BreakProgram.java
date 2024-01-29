package com.onesoft.forLoop_example;

public class BreakProgram {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i%8==0) {
				break;
			}
			else {
				System.out.println(i);
			}
		}
	}

}
