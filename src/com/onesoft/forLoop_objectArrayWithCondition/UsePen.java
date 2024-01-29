package com.onesoft.forLoop_objectArrayWithCondition;

public class UsePen {
	public static void main(String[] args) {
		
		Pen pen1=new Pen();
		pen1.price=50;
		pen1.color="blue";
		pen1.tipWidth=2.5f;
		pen1.isRefill=true;
		
		Pen pen2=new Pen();
		pen2.price=55;
		pen2.color="black";
		pen2.tipWidth=3.0f;
		pen2.isRefill=false;
		
		Pen pen3=new Pen();
		pen3.price=60;
		pen3.color="blue";
		pen3.tipWidth=0.5f;
		pen3.isRefill=false;
		
		Pen pen4=new Pen();
		pen4.price=65;
		pen4.color="red";
		pen4.tipWidth=0.7f;
		pen4.isRefill=true;
		
		Pen pen5=new Pen();
		pen5.price=70;
		pen5.color="blue";
		pen5.tipWidth=2.0f;
		pen5.isRefill=false;
		
		Pen pen6=new Pen();
		pen6.price=35;
		pen6.color="blue";
		pen6.tipWidth=1.9f;
		pen6.isRefill=true;
		
		Pen[] pens= {pen1,pen2,pen3,pen4,pen5,pen6};
		int count=0;
		for(Pen p:pens) {
			if(p.color.equalsIgnoreCase("blue")) {
				count++;
			}
		}
		System.out.println(count);
		
		
	}

}
