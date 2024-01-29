package com.onesoft.forLoop_indexArray;

public class UpperCaseCount {
	public static void main(String[] args) {
		String name="NiShaNthIKumAR";
		int count=0;
		String a=name.toUpperCase();
		
		for(int i=0;i<name.length();i++) {
		    /*if(name.charAt(i)>='A'&&name.charAt(i)<='Z') {
		    	count++;
		    }*/
		
			
			if(name.charAt(i)==a.charAt(i)) {
				count++;
			}
		}
		System.out.println(count);
	}

}
