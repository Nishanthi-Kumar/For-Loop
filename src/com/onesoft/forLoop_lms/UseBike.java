package com.onesoft.forLoop_lms;

public class UseBike {
	public static void main(String[] args) {
		String[] a=args[0].split(",");
		Bike bike1=new Bike();
		bike1.model=a[0];
		bike1.price=Integer.parseInt(a[1]);
		bike1.color=a[2];
		
		String[] b=args[1].split(",");
		Bike bike2=new Bike();
		bike2.model=b[0];
		bike2.price=Integer.parseInt(b[1]);
		bike2.color=b[2];
		
		Bike[] bikes= {bike1,bike2};
		for(Bike x:bikes) {
			System.out.println(x.model+" "+x.price+" "+x.color);
		}
	}

}
