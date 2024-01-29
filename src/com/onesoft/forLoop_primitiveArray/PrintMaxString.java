package com.onesoft.forLoop_primitiveArray;

public class PrintMaxString {
	public static void main(String[] args) {
		String[] names= {"Nisha","Kumar","Kamesh","Karthi","ArunThangaraj","Selvi"};
		String temp="";
		//int max=0;
		for(int i=0;i<names.length;i++) {
			if(names[i].length()>temp.length()) {
			//max=names[i].length();
			temp=names[i];
			}
		}
		System.out.println(temp);
	}

}
