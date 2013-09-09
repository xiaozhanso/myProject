package com.example;

public class MyFirstSingleton {
	// Static member holds only one instance of the
	// SingletonExample class
	private static MyFirstSingleton myFirstSingleton;

	private MyFirstSingleton() {

	}

	public static synchronized MyFirstSingleton getSingletonInstance() {
		if (myFirstSingleton == null) {
			myFirstSingleton = new MyFirstSingleton();
			
		}
		return myFirstSingleton;
	}

	public static void main(String args[]) {
		MyFirstSingleton.getSingletonInstance();
		System.out.println("Creating new instance" +MyFirstSingleton.getSingletonInstance() );
	}
}
