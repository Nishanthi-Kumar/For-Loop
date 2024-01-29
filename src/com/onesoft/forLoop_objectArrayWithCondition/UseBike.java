package com.onesoft.forLoop_objectArrayWithCondition;

public class UseBike {
	public static void main(String[] args) {
		Bike bike1=new Bike();
		bike1.registerNumber="TN 07";
		bike1.speed=60;
		bike1.color="red";
		bike1.brand="Bullet";
		
		Bike bike2=new Bike();
		bike2.registerNumber="AP 07";
		bike2.speed=40;
		bike2.color="white";
		bike2.brand="pulsar";
		
		Bike bike3=new Bike();
		bike3.registerNumber="TN 08";
		bike3.speed=100;
		bike3.color="blue";
		bike3.brand="R15";
		
		Bike bike4=new Bike();
		bike4.registerNumber="MP 09";
		bike4.speed=80;
		bike4.color="red";
		bike4.brand="rx";
		
		Bike[] bikes= {bike1,bike2,bike3,bike4};
		for(Bike b:bikes) {
			if(b.registerNumber.contains("TN")) {
				System.out.println(b.brand+" "+b.color);
			}
		}
		
	}

}
