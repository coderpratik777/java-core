package com.pratiti.training.product;

import java.util.Scanner;

public class Toy extends Product {
	
	public Toy()
	{
		
	}
	
	public Toy(String name,int productId,int stock,double price)
	{
		setInfo(name,productId,ProductType.TOYS,stock,price);
	}
	public void order(int require)
	{
		if(require>this.getStock())
		{
			System.out.println("Sorry Product is Out of Stock!");
		}
		else
		{
			Scanner n=new Scanner(System.in);
			System.out.println("Enter your age :");
			
			String age=n.nextLine();
			
			int ageOf=Integer.valueOf(age);
			
			if(ageOf>=2 && ageOf<=4)
			{
				double price=this.getPrice();
				double totalAmount=price*require;
				double discountAmount=0.15*totalAmount;
				this.setStock(this.getStock()-require);
				System.out.println("Your product is Succesfully ordered!");
				System.out.println("Congratulations !! You get 10% Discount on the Product!!");
				System.out.println("Total Amount :"+totalAmount+" Amount After Discount : "+discountAmount);
				
				
			}
			else if (ageOf>=4 && ageOf<=5)
			{
				double price=this.getPrice();
				double totalAmount=price*require;
				double discountAmount=0.15*totalAmount;
				this.setStock(this.getStock()-require);
				System.out.println("Your product is Succesfully ordered!");
				System.out.println("Congratulations !! You get 10% Discount on the Product!!");
				System.out.println("Total Amount :"+totalAmount+" Amount After Discount : "+discountAmount);
				
			}
			else if(ageOf>5)
			{
				double price=this.getPrice();
				double totalAmount=price*require;
				double discountAmount=0.15*totalAmount;
				this.setStock(this.getStock()-require);
				System.out.println("Your product is Succesfully ordered!");
				System.out.println("Congratulations !! You get 10% Discount on the Product!!");
				System.out.println("Total Amount :"+totalAmount+" Amount After Discount : "+discountAmount);
				
			}
			
		}
	}
}
