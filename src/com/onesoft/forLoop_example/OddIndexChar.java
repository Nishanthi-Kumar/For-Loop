package com.onesoft.forLoop_example;

public class OddIndexChar {
	public static void main(String[] args) {
		String name="Nishanthi";
//		char[]a=name.toCharArray();
//		for(int i=0;i<a.length;i++) {
//			if(i%2!=0) {
//				System.out.println(a[i]);
//			}
//			
//		}
		for(int i=0;i<name.length();i++) {
			if(i%2!=0) {
				System.out.print(name.charAt(i));
			}
		}
	}

}
