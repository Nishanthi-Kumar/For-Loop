package com.onesoft.forLoop_objectArrayWithCondition;

public class UseStudent {
	public static void main(String[] args) {
		Student student1=new Student();
		student1.name="Arun";
		student1.age=22;
		student1.mobileNo=9876543210l;
		student1.isPresent=true;
		student1.rollNo=46;
		
		Student student2=new Student();
		student2.name="Nisha";
		student2.age=20;
		student2.mobileNo=9876543211l;
		student2.isPresent=true;
		student2.rollNo=56;
		
		Student student3=new Student();
		student3.name="Karthi";
		student3.age=19;
		student3.mobileNo=9876543212l;
		student3.isPresent=false;
		student3.rollNo=14;
		
		Student[] students= {student1,student2,student3};
		for(Student s:students) {
			if(s.rollNo>1&&s.rollNo<20) {
				System.out.println(s.name+" "+"A section");
			}else if(s.rollNo>21&&s.rollNo<40) {
				System.out.println(s.name+" "+"B section");
			}else if(s.rollNo>41&&s.rollNo<60) {
				System.out.println(s.name+" "+"C section");
			}
		}
		
		
	}

}
