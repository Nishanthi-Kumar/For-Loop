package com.onesoft.forLoop_basicBoardTask;

public class StringCharBackward {
	public static void main(String[] args) {
		String name="Nisha";
		for(int i=name.length()-1;i>=0;i--) {
			System.out.println(name.charAt(i));
		}
	}

}
