package com.dailycode;

import java.io.FileNotFoundException;
import java.io.IOException;

public class OverridingExceptions {
	
	protected void doSomething() throws IOException{
		System.out.println("Parent");
	}

}
class Child extends OverridingExceptions{
	
	@Override
	protected void doSomething() throws FileNotFoundException, IOException{
		super.doSomething();
		System.out.println("Child");
	}
	
}
