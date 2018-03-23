/**
 * 
 */
package com.shettar.services.helpers;

import java.util.Properties;

import com.shettar.contants.Constants;
import com.shettar.entities.ResponseMessage;

/**
 * @author Pradeep.Shettar
 *
 *         Class to process mails.
 */
public class MailProcessor extends MessageProcessor {

	/**
	 * Parameterised Constructor.
	 * 
	 * @param toAddress
	 * @param fromAddress
	 * @param messageBody
	 * @param messageSubject
	 */
	public MailProcessor(String toAddress, String fromAddress, String messageBody, String messageSubject) {
		super(toAddress, fromAddress, messageBody, messageSubject);
	}

	@Override
	public ResponseMessage processMessage(Long messageId) {
		ResponseMessage responseMessage = new ResponseMessage();//String.valueOf(messageId), statusCode, messageStatusDetail)
		responseMessage.setTransactionId(String.valueOf(messageId));
		composeAndSendMail();
		return responseMessage;
	}

	/**
	 * 
	 */
	private void composeAndSendMail() {
	      Properties properties = System.getProperties();
	      properties.setProperty(Constants.MAIL_SMTP_PROPERTY, Constants.HOST_IP);
	      /*Session session = Session.getDefaultInstance(properties);
	      try
	      {
	         // MimeMessage object.
	         MimeMessage message = new MimeMessage(session);
	 
	         // Set From Field: adding senders email to from field.
	         message.setFrom(new InternetAddress(sender));
	 
	         // Set To Field: adding recipient's email to from field.
	         message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
	 
	         // Set Subject: subject of the email
	         message.setSubject("This is Suject");
	 
	         // set body of the email.
	         message.setText("This is a test mail");
	 
	         // Send email.
	         Transport.send(message);
	         System.out.println("Mail successfully sent");
	      }
	      catch (MessagingException mex) 
	      {
	         mex.printStackTrace();
	      }*/
	}
}
