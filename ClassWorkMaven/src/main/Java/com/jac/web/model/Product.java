package com.jac.web.model;

public class Product {
	
	
	
	private int id;
	
	private String productName;
	private double productPrice;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", productPrice=" + productPrice + ", getId()="
				+ getId() + ", getProductName()=" + getProductName() + ", getProductPrice()=" + getProductPrice() + "]";
	}
	
	

}
