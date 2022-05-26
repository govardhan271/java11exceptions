package com.dailycode;

import java.io.IOException;

public class CheckedVsUnchecked {
	
	public static void exceptionTypes() {
		
		dothis(); //Compiler doesn't force to handle the exception since this is an unchecked exception
		
		try {
			dothat();//Compiler forces to handle the exception since this is an checked exception
		}catch (IOException e) {
			
		}
			
	}
	
	static void dothat() throws IOException{
		throw new IOException();
	}
	
	static void dothis() throws IllegalArgumentException{//RunTimeException-> all exceptions that extend RTE are unchecked exceptions
		throw new IllegalArgumentException();
	}
	
	public static void impRuntimeExceptions() {
		
		int res = 5/0;//ArithmeticException
		
		int[] arr = new int[1];
		System.out.println(arr[1]);//ArrayIndexOutOfBoundException
		
		String s = "1";
	//	Integer n = (Integer) s; ClassCastException
		Object obj = s;
		Integer n = (Integer) obj;//fails at runtime
		
		int age = 15;
		if(age<21) {
			throw new IllegalArgumentException("you are not eligible");
		}
		
		boolean switchedOn = false;
		if(!switchedOn) {
			throw new IllegalStateException("XYZ must be switched on");
		}
		
		String s1 = null;
		s1.toUpperCase(); //NullPointerException
		
		Integer.parseInt("a"); //NumberFormatException
		Double.parseDouble("b");//NumberFormatException
		
	}
	
	public static void impCheckedExceptions() {
		//IOException and FileNotFoundException
	}
	


}
