package com.onesoft.forLoop_basicBoardTask;

public class Average {
	public static void main(String[] args) {
	int count=0;
	int add=0;
	for(int i=0;i<=1000;i++) {
		count++;
		add=add+i;
	}
	System.out.println(add/count);
	
	}
}
