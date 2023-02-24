package com.pratiti.training.productversion3;

import com.pratiti.training.product.ProductType;

public class Product {
	private String productName;
	private int productId;
	private ProductType productType;
	private int stock;
	private double price;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public ProductType getProductType() {
		return productType;
	}
	public void setProductType(ProductType productType) {
		this.productType = productType;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	class Book{
		Book()
		{
			
		}
		
		
	}
	
	class Toy{
		
	}

}
