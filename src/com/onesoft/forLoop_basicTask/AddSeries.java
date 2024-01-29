package com.onesoft.forLoop_basicTask;

public class AddSeries {
	public static void main(String[] args) {
		int total=0;
		int sqtotal=0;
		for(int i=1;i<=10;i++) {
			total=total+i;
			sqtotal=sqtotal+total;
			
		}
		System.out.println(sqtotal);
	}

}
