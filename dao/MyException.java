package com.capgemini.takehome.dao;

@SuppressWarnings("serial")
public class MyException extends RuntimeException{
	
public  MyException(String msg, Throwable ex)
{
	super(msg,ex);
}

public MyException(String string) {
	// TODO Auto-generated constructor stub
}
}
