package com.onesoft.forLoop_indexArray;

public class PrimeNos {
	public static void main(String[] args) {
		int num=7;
		boolean flag=true;
		for(int i=2;i<7;i++) {
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
