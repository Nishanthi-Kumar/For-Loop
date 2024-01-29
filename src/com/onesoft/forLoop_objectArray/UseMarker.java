package com.onesoft.forLoop_objectArray;

public class UseMarker {
	public static void main(String[] args) {
		
		Marker marker1=new Marker();
		marker1.price=40;
		marker1.size=5.5f;
		marker1.color="Blue";
		marker1.isRefillable=false;
		
		Marker marker2=new Marker();
		marker2.price=50;
		marker2.size=7.5f;
		marker2.color="Black";
		marker2.isRefillable=true;
		
		Marker marker3=new Marker();
		marker3.price=25;
		marker3.size=2.5f;
		marker3.color="Red";
		marker3.isRefillable=false;
		
		Marker[] markers= {marker1,marker2,marker3};
		for(int i=0;i<markers.length;i++) {
			System.out.println("Price="+markers[i].price+" Size="+markers[i].size+" Color="+markers[i].color+" Refillable="+markers[i].isRefillable);
		}
		for(int i=markers.length-1;i>=0;i--) {
			System.out.println("Price="+markers[i].price+" Size="+markers[i].size+" Color="+markers[i].color+" Refillable="+markers[i].isRefillable);
		}
		
	}

}
