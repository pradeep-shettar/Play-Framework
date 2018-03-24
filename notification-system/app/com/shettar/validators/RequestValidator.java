/**
 * 
 */
package com.shettar.validators;

import com.fasterxml.jackson.databind.JsonNode;
import com.shettar.contants.Constants;
import com.shettar.exceptions.InvalidDataException;

import play.mvc.Http.Request;

/**
 * @author Pradeep.Shettar
 *
 *         Class for handling request validations.
 */
public class RequestValidator {

	/**
	 * @param request
	 * @throws InvalidDataException
	 */
	public static void validateContentType(Request request) throws InvalidDataException {
		String contentType = request.getHeader(Constants.CONTENT_TYPE);
		if (contentType == null || !contentType.equalsIgnoreCase(Constants.JSON_CONTENT)) {
			throw new InvalidDataException(Constants.INVALID_CONTENT_TYPE_MESSAGE);
		}
	}

	/**
	 * @param request
	 * @return 
	 * @throws InvalidDataException 
	 */
	public static JsonNode validatePayload(Request request) throws InvalidDataException {
		if (request.body() != null && request.body().asJson() != null) {
			return request.body().asJson();
		}
		throw new InvalidDataException(Constants.INVALID_MESSAGE);
	}

}
