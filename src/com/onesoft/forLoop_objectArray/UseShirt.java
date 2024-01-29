package com.onesoft.forLoop_objectArray;

public class UseShirt {
	public static void main(String[] args) {
		
		Shirt shirt1=new Shirt();
		shirt1.brand="otto";
		shirt1.shirtPrice=999;
		shirt1.isChecked=false;
		shirt1.discountPercentage=10;
		
		Shirt shirt2=new Shirt();
		shirt2.brand="Black";
		shirt2.shirtPrice=1200;
		shirt2.isChecked=true;
		shirt2.discountPercentage=15;
		
		Shirt[] shirts= {shirt1,shirt2};
		for(Shirt x:shirts) {
			System.out.println(x.shirtPrice*x.discountPercentage/100);
		}
		
	}

}
