package com.onesoft.forLoop_objectArrayWithCondition;

public class UseShirt {
	public static void main(String[] args) {
		Shirt shirt1=new Shirt();
		shirt1.brand="otto";
		shirt1.price=999;
		shirt1.isChecked=false;
		
		Shirt shirt2=new Shirt();
		shirt2.brand="peter england";
		shirt2.price=1500;
		shirt2.isChecked=true;
		
		Shirt shirt3=new Shirt();
		shirt3.brand="ramraj";
		shirt3.price=500;
		shirt3.isChecked=false;
		
		Shirt[] shirts= {shirt1,shirt2,shirt3};
		int mini=shirts[0].price;
		String name="";
		for(Shirt s:shirts) {
		if(s.price<mini) {
			mini=s.price;
			name=s.brand;
		}
		
		
			if(s.brand.contains("a")||s.brand.contains("e")||s.brand.contains("i")||s.brand.contains("o")||s.brand.contains("u")) {
				name=s.brand;
				System.out.println("Contains");
			}
			else {
				System.out.println("Does not Contains");
			}
		}
		System.out.println(name);
		
		
	}

}
