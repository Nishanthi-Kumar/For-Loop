package com.onesoft.forLoop_basicBoardTask;

public class AddSeries {
	public static void main(String[] args) {
		int sequenceTotal=0;
		int total=0;
		for(int i=1;i<5;i++) {
			total=total+i;
			sequenceTotal=sequenceTotal+total;
			System.out.println(sequenceTotal);
		}
		//System.out.println(sequenceTotal);
	}

}
