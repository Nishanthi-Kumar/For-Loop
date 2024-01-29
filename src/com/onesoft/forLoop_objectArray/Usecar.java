package com.onesoft.forLoop_objectArray;

public class Usecar {
	public static void main(String[] args) {
		
		Car car1=new Car();
		car1.brand="Honda";
		car1.price=400000;
		car1.modelNo=123;
		car1.taxAmount=car1.price*10/100;
		
		Car car2=new Car();
		car2.brand="Bmw";
		car2.price=800000;
		car2.modelNo=124;
		car2.taxAmount=car2.price*10/100;
		
		Car car3=new Car();
		car3.brand="Nano";
		car3.price=100000;
		car3.modelNo=125;
		car3.taxAmount=car3.price*10/100;
		
		Car[] cars= {car1,car2,car3};
		for(Car x:cars) {
			System.out.println(x.taxAmount);
		}
	}

}
