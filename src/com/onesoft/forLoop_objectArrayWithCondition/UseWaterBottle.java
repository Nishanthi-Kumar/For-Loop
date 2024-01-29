package com.onesoft.forLoop_objectArrayWithCondition;

public class UseWaterBottle {
	public static void main(String[] args) {
		WaterBottle waterbottle1=new WaterBottle();
		waterbottle1.bottleType="Metal";
		waterbottle1.brand="tubberware";
		waterbottle1.price=500;
		waterbottle1.isQuality=true;
		
		WaterBottle waterbottle2=new WaterBottle();
		waterbottle2.bottleType="Glass";
		waterbottle2.brand="tubberware2";
		waterbottle2.price=500;
		waterbottle2.isQuality=true;
		
		WaterBottle waterbottle3=new WaterBottle();
		waterbottle3.bottleType="Copper";
		waterbottle3.brand="tubberware3";
		waterbottle3.price=500;
		waterbottle3.isQuality=true;
		
		WaterBottle waterbottle4=new WaterBottle();
		waterbottle4.bottleType="Steel";
		waterbottle4.brand="tubb4";
		waterbottle4.price=500;
		waterbottle4.isQuality=true;
		
		WaterBottle[] bottles= {waterbottle1,waterbottle2,waterbottle3,waterbottle4};
		for(WaterBottle w:bottles) {
			if(w.bottleType.equals("Glass")) {
				System.out.println(w.brand+" "+w.bottleType);
			}
		}
		
	}

}
