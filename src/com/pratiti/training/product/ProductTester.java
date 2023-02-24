package com.pratiti.training.product;

public class ProductTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book b1=new Book("Robin hood",1,22,23.45);
		Book b2=new Book("Do Epic shit",2,34,44.5);
		b1.display();
		b2.display();
		
		b1.order(21);
		
		
		
	}

}
