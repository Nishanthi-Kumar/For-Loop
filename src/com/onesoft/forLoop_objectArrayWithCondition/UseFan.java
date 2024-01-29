
package com.onesoft.forLoop_objectArrayWithCondition;

public class UseFan {
	public static void main(String[] args) {
		Fan fan1=new Fan();
		fan1.brand="Usha";
		fan1.price=1000;
		fan1.color="brown";
		fan1.isWarranty=true;
		
		Fan fan2=new Fan();
		fan2.brand="Orient";
		fan2.price=2500;
		fan2.color="black";
		fan2.isWarranty=false;
		
		Fan fan3=new Fan();
		fan3.brand="Venus";
		fan3.price=2000;
		fan3.color="white";
		fan3.isWarranty=true;
		
		Fan[] fans= {fan1,fan2,fan3};
		int max=0;
		for(Fan f:fans) {
			if(f.price>max) {
				max=f.price-f.price*5/100;
			}
	      
		}
		System.out.println(max);
		
		
	}

}
