package com.dailycode;

import java.io.IOException;

public class ExceptionMain {
	
	public static void main(String[] args) {
	
		OverridingExceptions oe = new Child();
		try {
			System.out.println(oe instanceof OverridingExceptions);
			oe.doSomething();
		}catch (IOException ioe) {
			
		}
		
		
		/*
		TryCatchSyntax.tryCatch();
		TryCatchSyntax.testTryCatchExecution();
		TryWithResourceExample.tryWithResource();
		*/
		
		/*
		try(var one = new TryWithResourceClosing("one");
			var two = new TryWithResourceClosing("two"))
		{
			throw new RuntimeException();
			//resource closing happens in reverse order
			//Java indeed run an implicit finally block even if an exception
		}
		*/
		
		
	}

}
