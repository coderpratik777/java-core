package com.pratiti.training.selflearn;

class Parent {
	
	public int add(int a,int b)
	{
		System.out.println("I am from parent");
		return a+b;
	}
	public static int subtract(int a,int b)
	{
		System.out.println("i am from parent");
		return a-b;
	}
	

}
class ChildClass extends Parent{
	
	public int add(int a,int b)
	{
		System.out.println("i am form child class");
		return a+b;
	}
	public static int subtract(int a,int b)
	{
		System.out.println("i am from child static function");
		return a-b;
	}
}


public class ParentClass{
	public static void main(String[] args) {
		
		ChildClass child=new ChildClass();
		
		child.add(23, 33);
		child.subtract(12, 2);
	}
	
}

