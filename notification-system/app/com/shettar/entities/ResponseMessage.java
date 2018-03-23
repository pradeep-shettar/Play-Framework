/**
 * 
 */
package com.shettar.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Pradeep.Shettar
 *
 *         Entity class for holding status of messages.
 */
public class ResponseMessage {

	/**
	 * The messages transaction id for the sake of tracking.
	 */
	@JsonProperty("transactionId")
	String transactionId;

	/**
	 * status of the message.
	 */
	@JsonProperty("statusCode")
	String statusCode;

	/**
	 * details of status of the message.
	 */
	@JsonProperty("messageStatusDetail")
	String messageStatusDetail;

	/**
	 * @return the transactionId
	 */
	public String getTransactionId() {
		return transactionId;
	}

	/**
	 * @param transactionId
	 *            the transactionId to set
	 */
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	/**
	 * @return the statusCode
	 */
	public String getStatusCode() {
		return statusCode;
	}

	/**
	 * @param statusCode
	 *            the statusCode to set
	 */
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	/**
	 * @return the messageStatusDetail
	 */
	public String getMessageStatusDetail() {
		return messageStatusDetail;
	}

	/**
	 * @param messageStatusDetail
	 *            the messageStatusDetail to set
	 */
	public void setMessageStatusDetail(String messageStatusDetail) {
		this.messageStatusDetail = messageStatusDetail;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((messageStatusDetail == null) ? 0 : messageStatusDetail.hashCode());
		result = prime * result + ((statusCode == null) ? 0 : statusCode.hashCode());
		result = prime * result + ((transactionId == null) ? 0 : transactionId.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResponseMessage other = (ResponseMessage) obj;
		if (messageStatusDetail == null) {
			if (other.messageStatusDetail != null)
				return false;
		} else if (!messageStatusDetail.equals(other.messageStatusDetail))
			return false;
		if (statusCode == null) {
			if (other.statusCode != null)
				return false;
		} else if (!statusCode.equals(other.statusCode))
			return false;
		if (transactionId == null) {
			if (other.transactionId != null)
				return false;
		} else if (!transactionId.equals(other.transactionId))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ResponseMessage [transactionId=" + transactionId + ", statusCode=" + statusCode
				+ ", messageStatusDetail=" + messageStatusDetail + "]";
	}

	/**
	 * @param transactionId
	 * @param statusCode
	 * @param messageStatusDetail
	 */
	public ResponseMessage(String transactionId, String statusCode, String messageStatusDetail) {
		super();
		this.transactionId = transactionId;
		this.statusCode = statusCode;
		this.messageStatusDetail = messageStatusDetail;
	}

	/**
	 * 
	 */
	public ResponseMessage() {
	}

}
