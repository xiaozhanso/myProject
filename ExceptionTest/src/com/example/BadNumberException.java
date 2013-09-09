package com.example;

public class BadNumberException extends Exception {
	private int myNumber;
	private String theString;

	public BadNumberException() {

	}

	public BadNumberException(String message)
	{
		super(message);
	}

	public BadNumberException(int myNumber) {
		this.myNumber = myNumber;
		System.out.println("you " + myNumber + " entered It can not zero");
	}

}