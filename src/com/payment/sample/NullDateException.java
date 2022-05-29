package com.payment.sample;

public class NullDateException extends Exception {
	public NullDateException() {
		System.out.println("Null date provided.");
	}
}
