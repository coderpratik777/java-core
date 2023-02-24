package com.pratiti.training.product;

public class Product {
	
	private String productName;
	private int productId;
	private ProductType productType;
	private int stock;
	private double price;
	
	public void setInfo(String name,int productId,ProductType product,int stock,double price)
	{
		this.productName=name;
		this.productId=productId;
		this.productType=product;
		this.stock=stock;
		this.price=price;
	}
	
	public String getname()
	{
		return this.productName;
	}
	public int getStock()
	{
		return this.stock;
	}
	public double getPrice()
	{
		return this.price;
	}
	public void setStock(int quantity)
	{
		this.stock=quantity;
	}
	
	
	
	
}
