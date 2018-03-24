/**
 * 
 */
package com.shettar.controllers;

import com.shettar.entities.Acknowledgement;
import com.shettar.exceptions.InvalidDataException;
import com.shettar.services.NotificationService;
import com.shettar.services.impl.NotificationServiceImpl;

import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Results;
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
	public static Result postMessage() throws InvalidDataException {
		NotificationService notificationService = new NotificationServiceImpl();
		Acknowledgement acknowledgement = notificationService.sendMessage(request());
		return Results.status(200, Json.toJson(acknowledgement));
	}

}