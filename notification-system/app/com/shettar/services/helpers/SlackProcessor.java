/**
 * 
 */
package com.shettar.services.helpers;

/**
 * @author Pradeep.Shettar
 *
 */
public class SlackProcessor extends MessageProcessor {

	/**
	 * @param toAddress
	 * @param fromAddress
	 * @param messageBody
	 * @param messageSubject
	 */
	public SlackProcessor(String toAddress, String fromAddress, String messageBody, String messageSubject) {
		super(toAddress, fromAddress, messageBody, messageSubject);
		// TODO Auto-generated constructor stub
	}

}
