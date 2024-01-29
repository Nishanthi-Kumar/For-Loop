package com.onesoft.forLoop_objectArray;

public class UseBag {
	public static void main(String[] args) {
		
		Bag bag1=new Bag();
		bag1.colorOfBag="Black";
		bag1.bagType="Schoolbag";
		bag1.numberOfZip=5;
		
		Bag bag2=new Bag();
		bag2.colorOfBag="Azh";
		bag2.bagType="Girlsbag";
		bag2.numberOfZip=3;
		
		Bag bag3=new Bag();
		bag3.colorOfBag="Red";
		bag3.bagType="Laptopbag";
		bag3.numberOfZip=2;
		
		Bag[] bags=new Bag[3];
		bags[0]=bag1;
		bags[1]=bag2;
		bags[2]=bag3;
		
		for(Bag x:bags) {
			System.out.println(x.bagType+" "+x.colorOfBag+" "+x.numberOfZip);
		}
	}

}
