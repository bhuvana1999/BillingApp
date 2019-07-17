package com.capgemini.takehome.service;

import java.util.Scanner;

import com.capgemini.takehome.dao.ProductDAO;

public class ProductService implements IProductService {
	ProductDAO daoobj=new ProductDAO();
    Scanner sc=new Scanner(System.in);
	public int getProductDetails(int ProductCode, int Quantity) 
	{
		
		return daoobj.getProductDetails(ProductCode, Quantity);
	
	}
	
	//product code check
	public int Codecheck(int code)
	{
		while(true) {
		if(code<1000 || code>10000)
		{
			System.out.println("Product code should be a 4 digit number");
			System.out.println("Enter Product code again:");
			code=sc.nextInt();
		}
		else
		{
			return code;
		}
	}}
	//quantity check
	public int quantitycheck(int quantity)
	{
		while(true) {
			if(quantity<=0)
			{
				System.out.println("Quantity should not be less than zero");
				System.out.println("Enter quantity again");
				quantity=sc.nextInt();
			}
			else
			{
				return quantity;
			}
		}
	}

}
