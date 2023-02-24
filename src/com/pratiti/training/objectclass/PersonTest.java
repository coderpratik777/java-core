package com.pratiti.training.objectclass;

public class PersonTest {
	
	
	
	public static void main(String[] args) {
		Person p1=new Person();
		p1.setName("Pratik");
		p1.setAge(22);
		
		System.out.println(p1.getname());
		System.out.println(p1.getAge());
		System.out.println(p1);
		
		Person p2=new Person();
		p2.setName("Pratik");
		p2.setAge(22);
		
		Person p3=new Person();
		System.out.println(p1==p2);//reference comparison
		System.out.println(p1.equals(p2));//value comparison
		System.out.println(p1.equals(p3));
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
	}
}
