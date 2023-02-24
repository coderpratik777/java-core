package com.pratiti.training.selflearn;

public class Anonymousclass {
	
	interface HelloWorld{
		
		void greet();
		void greetSomeone(String name);
	}
	
	
	public void sayHello()
	{
		class EnglishGreeting implements HelloWorld{
			
			public void greet()
			{
				System.out.println("Hello World from English");
			}
			public void greetSomeone(String name)
			{
				System.out.println("Good evening "+name);
			}
		}
		
		HelloWorld frenchGreeting=new HelloWorld(){
			public void greet()
			{
				System.out.println("Hello World from french");
			}
			public void greetSomeone(String name)
			{
				System.out.println("Good evening "+name+" from french");
			}
		};
		
		HelloWorld n=new EnglishGreeting();
		n.greet();
		n.greetSomeone("Pratik");
		frenchGreeting.greet();
		frenchGreeting.greetSomeone("pratik");
		
		
	}
	
	public static void main(String[] args) {
		Anonymousclass obj = new Anonymousclass();
		obj.sayHello();
	}

}
