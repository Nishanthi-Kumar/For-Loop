package com.onesoft.forLoop_objectArray;

public class UseBagg {
	public static void main(String[] args) {
		Bagg bag1=new Bagg();
		bag1.brand="Lapbag";
		bag1.color="Red";
		bag1.price=450;
		
		Bagg bag2=new Bagg();
		bag2.brand="Schoolbag";
		bag2.color="Blue";
		bag2.price=600;
		
		Bagg[] bags= {bag1,bag2};
		int total=0;
		for(Bagg x:bags) {
			total=total+x.price;
			
		}
		System.out.println(total);
		
	}

}
