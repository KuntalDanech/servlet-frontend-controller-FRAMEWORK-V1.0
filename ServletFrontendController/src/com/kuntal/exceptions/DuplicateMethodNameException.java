package com.kuntal.exceptions;

/**
 * 
 * @author Danech Kuntal
 *
 */
public class DuplicateMethodNameException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	/**
	 * 
	 * @param msg
	 */
	public DuplicateMethodNameException(String msg) {
		super(msg);
	}
	/**
	 * No parameterized constructor
	 */
	public DuplicateMethodNameException() {}
}
