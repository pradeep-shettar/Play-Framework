/**
 * 
 */
package com.shettar.exceptions;

/**
 * @author Pradeep.Shettar
 *
 */
public class MailSendException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public MailSendException() {
		super();
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public MailSendException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public MailSendException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public MailSendException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public MailSendException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	
}
