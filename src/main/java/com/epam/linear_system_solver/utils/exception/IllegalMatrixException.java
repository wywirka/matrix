package com.epam.linear_system_solver.utils.exception;

public class IllegalMatrixException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public IllegalMatrixException() {
		super();
	}

	public IllegalMatrixException(String message, Throwable cause) {
		super(message, cause);
	}

	public IllegalMatrixException(String message) {
		super(message);
	}

	
}
