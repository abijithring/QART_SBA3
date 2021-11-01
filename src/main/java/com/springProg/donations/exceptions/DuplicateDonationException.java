package com.springProg.donations.exceptions;

public class DuplicateDonationException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DuplicateDonationException() {
		super();
	}

	public DuplicateDonationException(String message) {
		super(message);
	}

}