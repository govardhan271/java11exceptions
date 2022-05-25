package com.dailycode;

public class ExceptionMain {
	
	public static void main(String[] args) {
	
		/*
		TryCatchSyntax.tryCatch();
		TryCatchSyntax.testTryCatchExecution();
		TryWithResourceExample.tryWithResource();
		*/
		
		try(var one = new TryWithResourceClosing("one");
			var two = new TryWithResourceClosing("two"))
		{
			throw new RuntimeException();
			//resource closing happens in reverse order
			//Java indeed run an implicit finally block even if an exception
		}
	}

}
