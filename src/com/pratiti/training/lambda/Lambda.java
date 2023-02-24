
package com.pratiti.training.lambda;


@FunctionalInterface
interface Printer{
	void print(String document);
}
interface Math{
	int calculate(int x,int y);
}

class DeskjetPrinter implements Printer{
	
	@Override
	public void print(String document)
	{
		System.out.println("Deskjet Printer printing "+document);
	}
}



public class Lambda {
	
	public static void main(String[] args) {
		
		Printer p=new DeskjetPrinter();
		p.print("hello");
		
		
		//anonymous implementation of printer interface 
		
		Printer p1=new Printer() {

			@Override
			public void print(String document) {
				// TODO Auto-generated method stub
				System.out.println("Anonymous printing"+document);
				
			}
						
		};
		p1.print("abc.txt");
		
		
		Printer p3=document->System.out.println("Lambda based Printer printing: "+document);
		
		
		
		Math m1=new Math() {
			@Override
			public int calculate(int x,int y)
			{
				return x+y;
			}
		};
		
		System.out.println(m1.calculate(23, 24));
		
		
		Math m2=(x,y)->x+y;
		System.out.println(m2.calculate(25, 34));
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
