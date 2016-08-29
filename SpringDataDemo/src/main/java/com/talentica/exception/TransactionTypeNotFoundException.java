package com.talentica.exception;

/**
 * Checked Exception to denote Transaction Type is not present in System
 * 
 * @author RajeshK
 *
 */
public class TransactionTypeNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public TransactionTypeNotFoundException(String message) {
		super(message);
	}

}
