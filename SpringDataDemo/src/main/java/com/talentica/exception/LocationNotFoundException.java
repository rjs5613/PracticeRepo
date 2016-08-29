/**
 * 
 */
package com.talentica.exception;

/**
 * Checked Exception to denote Location is not present in System
 * 
 * @author RajeshK
 *
 */
public class LocationNotFoundException extends Exception {

	private static final long serialVersionUID = -2614144741830880784L;

	public LocationNotFoundException(String message) {
		super(message);
	}

}
