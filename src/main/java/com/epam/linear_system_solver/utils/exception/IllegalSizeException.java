package com.epam.linear_system_solver.utils.exception;

public class IllegalSizeException extends RuntimeException {

	public IllegalSizeException() {
	}

	public IllegalSizeException(String message) {
		super(message);
	}

	public IllegalSizeException(Throwable cause) {
		super(cause);
	}

	public IllegalSizeException(String message, Throwable cause) {
		super(message, cause);
	}

	public IllegalSizeException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
