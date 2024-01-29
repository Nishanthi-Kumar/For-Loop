package com.onesoft.forLoop_primitiveArray;

public class PrintMarks {
	public static void main(String[] args) {
		int[] marks= {450,890,423,411,400,745,234};
		for(int i=0;i<marks.length;i++) {
			if(marks[i]>=400&&marks[i]<=450) {
				System.out.println(marks[i]);
			}
		}
	}

}
