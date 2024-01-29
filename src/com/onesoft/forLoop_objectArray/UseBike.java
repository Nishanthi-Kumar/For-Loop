package com.onesoft.forLoop_objectArray;

public class UseBike {
	public static void main(String[] args) {
		
		Bike bike1=new Bike();
		bike1.brand="Honda";
		bike1.price=85000;
		bike1.isWarranty=true;
		bike1.discountAmount=bike1.price*15/100;
		
		Bike bike2=new Bike();
		bike2.brand="R15";
		bike2.price=175000;
		bike2.isWarranty=true;
		bike2.discountAmount=bike2.price*15/100;
		
		Bike bike3=new Bike();
		bike3.brand="Pulzar220";
		bike3.price=95000;
		bike3.isWarranty=false;
		bike3.discountAmount=bike3.price*15/100;
		
		
		Bike[] bikes= {bike1,bike2,bike3};
		for(Bike x:bikes) {
			System.out.println(x.discountAmount);
		}
	}

}
