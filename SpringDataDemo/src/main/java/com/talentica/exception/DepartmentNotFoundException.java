package com.talentica.exception;

/**
 * Checked Exception to Denote Department is Not present in System
 * 
 * @author RajeshK
 *
 */
public class DepartmentNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public DepartmentNotFoundException(String arg0) {
		super(arg0);
	}

}
