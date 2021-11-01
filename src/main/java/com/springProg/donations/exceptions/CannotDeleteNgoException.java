package com.springProg.donations.exceptions;

public class CannotDeleteNgoException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public CannotDeleteNgoException() {
		super();
	}

	public CannotDeleteNgoException(String message) {
		super(message);
	}

}