package com.pratiti.training.product;

public class Book extends Product{
	
	public Book()
	{
		
	}
	public Book(String name,int productId,int stock,double price) 
	{
		setInfo(name,productId,ProductType.BOOKS,stock,price);
	}
	public void display()
	{
		System.out.println("The product is "+this.getname()+" and the product stock is "+this.getStock());
	}
	public void order(int require)
	{
		if(require>this.getStock())
		{
			System.out.println("Sorry Product is Out of Stock!");
		}
		else
		{
			double x=0.1*(this.getPrice());
			double total=x*require;
			this.setStock(this.getStock()-require);
			System.out.println("Your product is Succesfully ordered!");
			System.out.println("Congratulations !! You get 10% Discount on the Product!!");
			System.out.println("Amount :"+this.getPrice()+" Amount After Discount : "+total);
		}
	}
	
}
