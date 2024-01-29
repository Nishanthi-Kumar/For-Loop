package com.onesoft.forLoop_example;

public class PrimeNo {
	public static void main(String[] args) {
		int num=11;boolean flag=true;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				flag=false;
			}
		}
			if(flag==true) {
				System.out.println("Prime");
			}else {
				System.out.println("Not a Prime");
			}
		
	}

}
