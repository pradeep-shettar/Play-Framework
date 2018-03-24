/**
 * 
 */
package com.shettar.interceptors;

import java.util.Arrays;

import javax.inject.Inject;
import javax.inject.Provider;

import com.shettar.entities.Acknowledgement;
import com.shettar.entities.ResponseMessage;

import play.api.Configuration;
import play.api.Environment;
import play.api.OptionalSourceMapper;
import play.api.http.DefaultHttpErrorHandler;
import play.api.mvc.RequestHeader;
import play.api.mvc.Result;
import play.api.routing.Router;
import scala.concurrent.Future;

/**
 * @author Pradeep.Shettar
 *
 */
public class ErrorHandler extends DefaultHttpErrorHandler {

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 */
	@Inject
	public ErrorHandler(Environment environment, Configuration configuration, OptionalSourceMapper optionalSourceMapper,
			Provider<Router> provider) {
		super(environment, configuration, optionalSourceMapper, provider);
	}

	@Override
	/* (non-Javadoc)
	 * @see play.api.http.DefaultHttpErrorHandler#onServerError(play.api.mvc.RequestHeader, java.lang.Throwable)
	 */
	public Future<Result> onServerError(RequestHeader requestHeader, Throwable throwable) {
		
		Future<Result> result = null;
		ResponseMessage responseMessage = new ResponseMessage();
		responseMessage.setMessageStatusDetail("Invalid Request");
		responseMessage.setStatusCode("NS_1005");
		Acknowledgement acknowledgement = new Acknowledgement();
		acknowledgement.setResponses(Arrays.asList(responseMessage));
		return result;
	}
}
