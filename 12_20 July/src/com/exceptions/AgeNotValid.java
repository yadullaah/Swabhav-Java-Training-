package com.exceptions;

public class AgeNotValid extends RuntimeException {
	
	public String getMessage() {
		return "age not valid, must be over 18";
	}
	

}
