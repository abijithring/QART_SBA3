package com.springProg.donations.exceptions;

public class DonationsNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	public DonationsNotFoundException()
	{
		super();
	}
	
	public DonationsNotFoundException(String message)
	{
		super(message);
	}
	

}
