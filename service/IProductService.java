package com.capgemini.takehome.service;

public interface IProductService {
	public int getProductDetails(int ProductCode, int Quantity) ;
	public int Codecheck(int code);
	public int quantitycheck(int quantity);
}
