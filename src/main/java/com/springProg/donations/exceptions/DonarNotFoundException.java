package com.springProg.donations.exceptions;

public class DonarNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public DonarNotFoundException()
	{
		super();
	}
	
	public DonarNotFoundException(String message)
	{
		super(message);
	}

}
