package com.onesoft.forLoop_primitiveArray;

public class NameCount {
	public static void main(String[] args) {
		String[] names= {"Aaru","Balu","Raj","Sathish","Karthi","Arjun","Arun"};
		int count=0;
		for(int i=0;i<names.length;i++) {
			if(names[i].startsWith("A")) {
				count++;
			}
		}
		System.out.println(count);
	}

}
