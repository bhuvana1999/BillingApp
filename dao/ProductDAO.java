package com.capgemini.takehome.dao;

import java.util.Map;

import com.capgemini.takehome.Util.CollectionUtil;
import com.capgemini.takehome.bean.Product;

public class ProductDAO implements IProductDAO {
	Product	obj;
	public int getProductDetails(int ProductCode, int Quantity) {
		
		Map<Integer, Product> products= CollectionUtil.getProducts();
		
	   obj= products.get(ProductCode);
	   
	   if(obj==null)
	   {
		   throw new MyException("Something went wrong");
	   }
	   else {
	   
	    System.out.println("Product Name : "+obj.getProductName());
	    System.out.println("Product Category : "+obj.getProductCategory());
	    System.out.println("Product Price : "+obj.getProductPrice());
	    int total=(Quantity*obj.getProductPrice());
	    System.out.println("Line Total : "+total);
		
	   }
	   return ProductCode;
	}

}
