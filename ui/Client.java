package com.capgemini.takehome.ui;

import java.util.Scanner;

import com.capgemini.takehome.dao.MyException;
import com.capgemini.takehome.service.ProductService;

public class Client {
public static void main(String[] args) {
	
	ProductService serviceobj=new ProductService();
	Scanner sc=new Scanner(System.in);
	System.out.println("1) Generate Bill by entering Product code and quantity");
	System.out.println("2) Exit");
	
	int ch;
	char choice;
	do {
		System.out.println("enter your choice");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			try
			{
			System.out.println("Enter the Product Details");
			System.out.println("Enter the Product Code");
			int ProductCode=serviceobj.Codecheck(sc.nextInt());
			System.out.println("Enter the Quantity");
			int Quantity=serviceobj.quantitycheck(sc.nextInt());
			serviceobj.getProductDetails(ProductCode,Quantity);
			}
			catch(MyException e)
			{
				System.out.println("something went wrong");
			}
		case 2:
		System.out.print("Do you want to exit (yes or no)...? : ");
		choice = sc.next().charAt(0);
		if(choice == 'y' || choice=='Y')
		{
			System.out.println("Thank You...!");
		System.exit(0);
		}
		else {
			continue;
		     }
		}
	}while(ch !=2);
	sc.close();
	
}
}
