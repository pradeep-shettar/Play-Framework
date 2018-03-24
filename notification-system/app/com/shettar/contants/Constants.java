/**
 * 
 */
package com.shettar.contants;

/**
 * @author Pradeep.Shettar
 * 
 *         Constants used in the application.
 *
 */
public class Constants {

	/**
	 * Content type in header.
	 */
	public static final String CONTENT_TYPE = "content-type";
	/**
	 * value of content type for Json messages.
	 */
	public static final String JSON_CONTENT = "application/json";
	/**
	 * Invalid content type exception code
	 */
	public static final String INVALID_CONTENT_TYPE_CODE = "NS_1001";
	/**
	 * Invalid content type exception message
	 */
	public static final String INVALID_CONTENT_TYPE_MESSAGE = "Content type must be Json.";
	/**
	 * Invalid message payload in Request
	 */
	public static final String INVALID_MESSAGE = "Invalid Message to send";
	/**
	 * Type of message is mail.
	 */
	public static final String MAIL_TYPE = "mail";
	/**
	 * Type of message is slack
	 */
	public static final String SLACK_TYPE = "slack";
	/**
	 * Host ip.
	 */
	public static final String HOST_IP = "127.0.0.1";
	/**
	 * 
	 */
	public static final String MAIL_SMTP_PROPERTY = "mail.smtp.host";
	/**
	 * 
	 */
	public static final String MAIL_SEND_FAILURE = "Sending mail failed";
	/**
	 * 
	 */
	public static final String STATUS_CODE_MAIL_SEND_FAILED = "NS_1002";
	/**
	 * 
	 */
	public static final String MAIL_SENT_SUCCESSFULLY = "Mail sent successfully!";
	/**
	 * 
	 */
	public static final String STATUS_CODE_MAIL_SENT = "NS_1003";

}
