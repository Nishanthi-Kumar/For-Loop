package com.onesoft.forLoop_objectArrayWithCondition;

public class UseCar {
	public static void main(String[] args) {
		Car car1=new Car();
		car1.registerNumber=1234;
		car1.model="V2";
		car1.isAlloyWheel=true;
		
	    Car car2=new Car();
	    car2.registerNumber=2345;
	    car2.model="r2";
	    car2.isAlloyWheel=false;
	    
	    Car car3=new Car();
	    car3.registerNumber=5679;
	    car3.model="t5";
	    car3.isAlloyWheel=true;
	    
	    Car car4=new Car();
	    car4.registerNumber=6785;
	    car4.model="i0";
	    car4.isAlloyWheel=false;
	    
	    Car car5=new Car();
	    car5.registerNumber=9022;
	    car5.model="h6";
	    car5.isAlloyWheel=true;
	    
	    Car car6=new Car();
	    car6.registerNumber=6665;
	    car6.model="i9";
	    car6.isAlloyWheel=false;
	    
	    Car[] cars= {car1,car2,car3,car4,car5,car6};
	    int oddCount=0;
	    int evenCount=0;
	    for(Car c:cars) {
	    	if(c.registerNumber%2==0) {
	    		evenCount++;
	    	}else {
	    		oddCount++;
	    	}
	    }
	    System.out.println(evenCount);
	    System.out.println(oddCount);
	    
	}

}
