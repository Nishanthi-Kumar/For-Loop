package com.onesoft.forLoop_objectArray;

public class UseLaptop {
	public static void main(String[] args) {
		
		Laptop laptop1=new Laptop();
		laptop1.brand="HP";
		laptop1.price=40000;
		laptop1.modelNo=230;
		laptop1.isTouchScreen=true;
		
		Laptop laptop2=new Laptop();
		laptop2.brand="Lenovo";
		laptop2.price=35000;
		laptop2.modelNo=231;
		laptop2.isTouchScreen=false;
		
		Laptop laptop3=new Laptop();
		laptop3.brand="Mac";
		laptop3.price=95000;
		laptop3.modelNo=232;
		laptop3.isTouchScreen=true;
		
		Laptop[] laps=new Laptop[3];
		laps[0]=laptop1;
		laps[1]=laptop2;
		laps[2]=laptop3;
		for(int i=0;i<laps.length;i++) {
			System.out.println(laps[i].brand);
		}
		for(int i=0;i<laps.length;i++) {
			System.out.println(laps[i].price);
		}
		for(int i=0;i<laps.length;i++) {
			System.out.println(laps[i].modelNo);
		}
		for(int i=0;i<laps.length;i++) {
			System.out.println(laps[i].brand+" "+laps[i].price+" "+laps[i].modelNo+" "+laps[i].isTouchScreen);
		}
	}

}
