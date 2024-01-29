package com.onesoft.forLoop_objectArray;

public class UseFan {
	public static void main(String[] args) {
		Fan fan1=new Fan();
		fan1.brand="usha";
		fan1.speed=70;
		fan1.isFourWings=true;
		
		Fan fan2=new Fan();
		fan2.brand="venus";
		fan2.speed=80;
		fan2.isFourWings=false;
		
		Fan[] fans= {fan1,fan2};
		for(int i=fans.length-1;i>=0;i--) {
			System.out.println(fans[i].brand+" "+fans[i].speed+" "+fans[i].isFourWings);
		}
		
	}

}
