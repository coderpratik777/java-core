package com.pratiti.training.lambda;

class A{
	private int x=10;
	//inner class
	class B{
		void check()
		{
			System.out.println(x);
		}
	}
	
	//static inner class
	static class C{
		void check()
		{
			System.out.println("in c");
		}
		
	}
}

public class Prereq2 {
	public static void main(String[] args) {
		
		A a =new A();
		A.B b=new A().new B();
		
	}

}

