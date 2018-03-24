/**
 * 
 */
package com.shettar.services.impl;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.shettar.contants.Constants;
import com.shettar.entities.Acknowledgement;
import com.shettar.entities.Message;
import com.shettar.entities.Messages;
import com.shettar.entities.ResponseMessage;
import com.shettar.exceptions.InvalidDataException;
import com.shettar.services.NotificationService;
import com.shettar.services.helpers.MailProcessor;
import com.shettar.services.helpers.SlackProcessor;
import com.shettar.validators.RequestValidator;

import play.mvc.Http.Request;

/**
 * @author Pradeep.Shettar
 *
 *         Implementation class for NotificationService.
 */
public class NotificationServiceImpl implements NotificationService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.shettar.services.NotificationService#sendMessage(play.mvc.Http.
	 * Request)
	 */
	@Override
	public Acknowledgement sendMessage(Request request) throws InvalidDataException {
		Messages messages = getMessagesIfValidRequest(request);
		Acknowledgement acknowledgement = processMessages(messages);
		return acknowledgement;
	}

	/**
	 * @param request
	 * @return
	 * @throws InvalidDataException
	 */
	private Messages getMessagesIfValidRequest(Request request) throws InvalidDataException {
		RequestValidator.validateContentType(request);
		JsonNode requestPayload = RequestValidator.validatePayload(request);
		Messages messages = null;
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			messages = objectMapper.treeToValue(requestPayload, Messages.class);
		} catch (JsonProcessingException jsonProcessingException) {
			throw new InvalidDataException(Constants.INVALID_MESSAGE);
		}
		return messages;
	}

	/**
	 * @param messages
	 */
	private Acknowledgement processMessages(Messages messages) {
		Acknowledgement acknowledgement = new Acknowledgement();
		Long messageId = 1L;
		if (messages != null) {
			List<Message> allMessages = messages.getAllMessages();
			if (allMessages != null && !allMessages.isEmpty()) {
				List<ResponseMessage> responses = new ArrayList<ResponseMessage>();
				acknowledgement.setResponses(responses);
				for (Message message : allMessages) {
					if (message.getMessageType().equalsIgnoreCase(Constants.MAIL_TYPE)) {
						MailProcessor mailProcessor = new MailProcessor(message.getTo(), message.getFrom(),
								message.getActualMessage(), message.getSubject());
						responses.add(mailProcessor.processMessage(messageId++));
					} else if (message.getMessageType().equalsIgnoreCase(Constants.SLACK_TYPE)) {
						SlackProcessor slackProcessor = new SlackProcessor(message.getTo(), message.getFrom(),
								message.getActualMessage(), message.getSubject());
						responses.add(slackProcessor.processMessage(messageId++));
					}
				}
			}
		}
		return acknowledgement;
	}

}
