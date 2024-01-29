package com.onesoft.forLoop_primitiveArray;

public class MaxStringCount {
	public static void main(String[] args) {
		String[] names= {"Nisha","Arun","Kamesh","Karthi","Kumar","Selvi"};
		int count=0;
		for(int i=0;i<names.length;i++) {
			if(names[i].length()>3) {
				count++;
			}
		}
		System.out.println(count);
		
	}
}
