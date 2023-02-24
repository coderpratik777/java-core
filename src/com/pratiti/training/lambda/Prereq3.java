package com.pratiti.training.lambda;


class Hello
{
	void saySomething()
	{
		System.out.println("hello everyone");
	}
}
class Hi extends Hello
{
	void saySomething()
	{
		System.out.println("hello everyone from child class");
	}
	
}

public class Prereq3 {
			
	public static void main(String[] args) {
		
		Hello n=new Hello();
		n.saySomething();
		
		Hello n1=new Hi();
		n1.saySomething();
	}
	
	
	

}
