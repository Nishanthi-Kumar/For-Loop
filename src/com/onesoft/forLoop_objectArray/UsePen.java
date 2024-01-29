package com.onesoft.forLoop_objectArray;

public class UsePen {
	public static void main(String[] args) {
		
		Pen pen1=new Pen();
		pen1.price=25;
		pen1.color="Black";
		pen1.isRefillable=true;
		
		Pen pen2=new Pen();
		pen2.price=30;
		pen2.color="Blue";
		pen2.isRefillable=false;
		
		Pen pen3=new Pen();
		pen3.price=50;
		pen3.color="Red";
		pen3.isRefillable=true;
		
		Pen[] pens= {pen1,pen2,pen3};
		for(Pen x:pens) {
			System.out.println(x.price+" "+x.color+" "+x.isRefillable);
		}
	}

}
