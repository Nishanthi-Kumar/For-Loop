package com.onesoft.forLoop_objectArray;

public class UseFruit {
	public static void main(String[] args) {
		
		Fruit fruit1=new Fruit();
		fruit1.fruitName="Apple";
		fruit1.price=50;
		fruit1.isHybrid=true;
		
		Fruit fruit2=new Fruit();
		fruit2.fruitName="Mango";
		fruit2.price=70;
		fruit2.isHybrid=true;
		
		Fruit fruit3=new Fruit();
		fruit3.fruitName="Orange";
		fruit3.price=35;
		fruit3.isHybrid=false;
		
		Fruit fruit4=new Fruit();
		fruit4.fruitName="PineApple";
		fruit4.price=80;
		fruit4.isHybrid=true;
		
		Fruit fruit5=new Fruit();
		fruit5.fruitName="Watermelon";
		fruit5.price=120;
		fruit5.isHybrid=false;
		
		Fruit fruit6=new Fruit();
		fruit6.fruitName="Banana";
		fruit6.price=40;
		fruit6.isHybrid=false;
		
		Fruit[] fruits= {fruit1,fruit2,fruit3,fruit4,fruit5,fruit6};
		
		/*for(int i=0;i<fruits.length/2;i++) {
			System.out.println(fruits[i].fruitName+" "+fruits[i].price+" "+fruits[i].isHybrid);
		}*/
		
		
		/*for(int i=(fruits.length-1)/2;i>=0;i--) {
			System.out.println(fruits[i].fruitName+" "+fruits[i].price+" "+fruits[i].isHybrid);
		}*/
		
		for(int i=fruits.length/2;i<fruits.length;i++) {
			System.out.println(fruits[i].fruitName+" "+fruits[i].price+" "+fruits[i].isHybrid);
		}
		
		for(int i=fruits.length-1;i>=fruits.length/2;i--) {
			System.out.println(fruits[i].fruitName+" "+fruits[i].price+" "+fruits[i].isHybrid);
		}
		
	}

}
