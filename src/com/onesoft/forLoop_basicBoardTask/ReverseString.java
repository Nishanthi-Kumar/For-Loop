package com.onesoft.forLoop_basicBoardTask;

public class ReverseString {
	public static void main(String[] args) {
		String name="Nisha";
		String temp=" ";
		for(int i=name.length()-1;i>=0;i--) {
			temp=temp+name.charAt(i);
			System.out.println(temp);
		}
		//System.out.println(temp);
	}

}
