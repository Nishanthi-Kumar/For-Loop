package com.onesoft.forLoop_objectArrayWithCondition;

public class UseWaterBottle1 {
	public static void main(String[] args) {
		WaterBottle waterbottle1=new WaterBottle();
		waterbottle1.bottleType="Metal";
		waterbottle1.brand="tubberware";
		waterbottle1.price=500;
		waterbottle1.isQuality=true;
		
		WaterBottle waterbottle2=new WaterBottle();
		waterbottle2.bottleType="Glass";
		waterbottle2.brand="tubber20";
		waterbottle2.price=500;
		waterbottle2.isQuality=true;
		
		WaterBottle waterbottle3=new WaterBottle();
		waterbottle3.bottleType="Copper";
		waterbottle3.brand="tub";
		waterbottle3.price=500;
		waterbottle3.isQuality=true;
		
		WaterBottle waterbottle4=new WaterBottle();
		waterbottle4.bottleType="Steel";
		waterbottle4.brand="tubbberwaree";
		waterbottle4.price=500;
		waterbottle4.isQuality=true;
		
		WaterBottle[] bottles= {waterbottle1,waterbottle2,waterbottle3,waterbottle4};
		int max=0;
		String temp="";
		for(WaterBottle w:bottles) {
			if(w.brand.length()>max) {
				max=w.brand.length();
				temp=w.brand;
		}
		
	}
		System.out.println(temp);

}
}
