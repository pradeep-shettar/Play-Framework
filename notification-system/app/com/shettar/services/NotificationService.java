/**
 * 
 */
package com.shettar.services;

import com.shettar.entities.Acknowledgement;
import com.shettar.exceptions.InvalidDataException;

import play.mvc.Http.Request;

/**
 * @author Pradeep.Shettar
 *
 *         Interface for Notification Service
 */
public interface NotificationService {

	/**
	 * The service to send message.
	 * 
	 * @param request
	 *            , the request param used.
	 * 
	 * @return Acknowledgement type to the client on the status of the message.
	 * @throws InvalidDataException 
	 */
	public Acknowledgement sendMessage(Request request) throws InvalidDataException;
}
