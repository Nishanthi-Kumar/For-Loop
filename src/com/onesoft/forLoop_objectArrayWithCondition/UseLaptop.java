package com.onesoft.forLoop_objectArrayWithCondition;

public class UseLaptop {
	public static void main(String[] args) {
		Laptop laptop1=new Laptop();
		laptop1.brand="Hp";
		laptop1.price=30000;
		laptop1.color="Black";
		laptop1.version=2010;
		laptop1.isTouchScreen=false;
		
		Laptop laptop2=new Laptop();
		laptop2.brand="Apple";
		laptop2.price=130000;
		laptop2.color="Red";
		laptop2.version=2013;
		laptop2.isTouchScreen=true;
		
		Laptop laptop3=new Laptop();
		laptop3.brand="lenovo";
		laptop3.price=20000;
		laptop3.color="white";
		laptop3.version=2011;
		laptop3.isTouchScreen=false;
		
		Laptop[] laps= {laptop1,laptop2,laptop3};
		for(Laptop l:laps) {
			if(l.isTouchScreen==true) {
				System.out.println(l.brand+" "+l.price);
			}
		}
		
	}

}
