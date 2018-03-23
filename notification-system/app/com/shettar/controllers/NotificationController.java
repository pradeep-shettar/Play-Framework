/**
 * 
 */
package com.shettar.controllers;

import com.shettar.exceptions.InvalidDataException;
import com.shettar.services.NotificationService;
import com.shettar.services.impl.NotificationServiceImpl;

import play.mvc.Controller;
import play.mvc.Result;

/**
 * @author shettar20.
 * 
 *         The controller class for handling Notification operations.
 *
 */
public class NotificationController extends Controller {

	/**
	 * Controller method to post message.
	 * 
	 * @throws InvalidDataException
	 */
	public Result postMessage() throws InvalidDataException {
		NotificationService notificationService = new NotificationServiceImpl();
		notificationService.sendMessage(request());
		return null;
	}

}