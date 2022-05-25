package com.dailycode;

public class TryWithResourceClosing implements AutoCloseable{

	String name;

	public TryWithResourceClosing(String name) {
		this.name = name;
	}
	
	@Override
	public void close() {
		System.out.println("Closing resource: " + name);
	}

}
