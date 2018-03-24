/**
 * 
 */
package com.shettar.services.helpers;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.shettar.contants.Constants;
import com.shettar.entities.ResponseMessage;
import com.shettar.exceptions.MailSendException;

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
		try {
			composeAndSendMail();
			responseMessage.setMessageStatusDetail(Constants.MAIL_SENT_SUCCESSFULLY);
			responseMessage.setStatusCode(Constants.STATUS_CODE_MAIL_SENT);
		} catch (MailSendException mailSendException) {
			responseMessage.setMessageStatusDetail(mailSendException.getMessage());
			responseMessage.setStatusCode(Constants.STATUS_CODE_MAIL_SEND_FAILED);
		}
		return responseMessage;
	}

	/**
	 * @throws MailSendException 
	 * 
	 */
	private void composeAndSendMail() throws MailSendException {
	      Properties properties = System.getProperties();
	      properties.setProperty(Constants.MAIL_SMTP_PROPERTY, Constants.HOST_IP);
	      Session session = Session.getDefaultInstance(properties);
	      try
	      {
	         // MimeMessage object.
	         MimeMessage message = new MimeMessage(session);
	         // Set From Field: adding senders email to from field.
	         message.setFrom(new InternetAddress(fromAddress));
	         // Set To Field: adding recipient's email to from field.
	         message.addRecipient(Message.RecipientType.TO, new InternetAddress(toAddress));
	         // Set Subject: subject of the email
	         message.setSubject(messageSubject);
	         // set body of the email.
	         message.setText(messageBody);
	         // Send email.
	         Transport.send(message);
	      }
	      catch (MessagingException messagingException) {
	    	  throw new MailSendException(Constants.MAIL_SEND_FAILURE, messagingException);
	      }
	}
}
