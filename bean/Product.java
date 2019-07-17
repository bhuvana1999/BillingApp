package com.capgemini.takehome.bean;

public class Product {
private int ProductCode;
private String ProductName;
private String ProductCategory;
private int ProductPrice;

//getters and setters
public int getProductCode() {
	return ProductCode;
}
public void setProductCode(int productCode) {
	ProductCode = productCode;
}
public String getProductName() {
	return ProductName;
}
public void setProductName(String productName) {
	ProductName = productName;
}
public String getProductCategory() {
	return ProductCategory;
}
public void setProductCategory(String productCategory) {
	ProductCategory = productCategory;
}
public int getProductPrice() {
	return ProductPrice;
}
public void setProductPrice(int productPrice) {
	ProductPrice = productPrice;
}

//constructor
public Product(int productCode, String productName, String productCategory, int productPrice) {
	super();
	ProductCode = productCode;
	ProductName = productName;
	ProductCategory = productCategory;
	ProductPrice = productPrice;
}

public Product() {
	super();
}





}
