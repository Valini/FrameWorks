package com.jac.web.model;

public class Product {
	
	private String productName;
	private double productPrice;
	
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
		return "Product [productName=" + productName + ", productPrice=" + productPrice + ", getProductName()="
				+ getProductName() + ", getProductPrice()=" + getProductPrice() + "]";
	}
	

}
