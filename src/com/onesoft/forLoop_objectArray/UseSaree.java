package com.onesoft.forLoop_objectArray;

public class UseSaree {
	public static void main(String[] args) {
		Saree saree1=new Saree();
		saree1.material="cotton";
		saree1.color="Red";
		saree1.price=999;
		
		Saree saree2=new Saree();
		saree2.material="polyster";
		saree2.color="Blue";
		saree2.price=500;
		
		Saree[] sarees= {saree1,saree2};
		int total=0;
		for(Saree x:sarees) {
			total=total+x.price;
			System.out.println(x.material+" "+x.color+" "+x.price);
		}
		System.out.println(total);
		
	}

}
