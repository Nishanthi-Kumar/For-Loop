package com.onesoft.forLoop_objectArrayWithCondition;

public class UseFruit {
	public static void main(String[] args) {
		Fruit fruit1=new Fruit();
		fruit1.fruitName="apple";
		fruit1.price=450;
		fruit1.weight=1.5f;
		fruit1.isHyybrid=true;
		
		Fruit fruit2=new Fruit();
		fruit2.fruitName="strfrt";
		fruit2.price=150;
		fruit2.weight=1.0f;
		fruit2.isHyybrid=false;
		
		Fruit fruit3=new Fruit();
		fruit3.fruitName="pineapple";
		fruit3.price=650;
		fruit3.weight=3.5f;
		fruit3.isHyybrid=true;
		
		Fruit[] fruits= {fruit1,fruit2,fruit3};
		//String name="";
		for(Fruit f:fruits) {
			String word=f.fruitName.toUpperCase();
			if(word.contains("A")||word.contains("E")||word.contains("I")||word.contains("O")||word.contains("U")) {
			System.out.println(f.fruitName);	
			}
		}
		//System.out.println(name);
		
	}

}
