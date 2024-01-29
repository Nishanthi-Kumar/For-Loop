package com.onesoft.forLoop_objectArrayWithCondition;

public class UseBag {
	public static void main(String[] args) {
		Bag bag1=new Bag();
		bag1.numberOfZips=4;
	    bag1.bagType="school Bag";
	    bag1.brand="abc";
	    bag1.isWaterProof=false;
	    
	    Bag bag2=new Bag();
		bag2.numberOfZips=2;
	    bag2.bagType="College Bag";
	    bag2.brand="abcd";
	    bag2.isWaterProof=false;
	    
	    Bag bag3=new Bag();
		bag3.numberOfZips=5;
	    bag3.bagType="Tour Bag";
	    bag3.brand="abcde";
	    bag3.isWaterProof=true;
	    
	    Bag bag4=new Bag();
		bag4.numberOfZips=2;
	    bag4.bagType="tour Bag";
	    bag4.brand="abcdef";
	    bag4.isWaterProof=true;
	    
	    Bag[] bags= {bag1,bag2,bag3,bag4};
	    for(Bag b:bags) {
	    	if(b.bagType.equalsIgnoreCase("tour bag")) {
	    		System.out.println(b.brand+" "+b.numberOfZips);
	    	}
	    }
	    
	    
	}

}
