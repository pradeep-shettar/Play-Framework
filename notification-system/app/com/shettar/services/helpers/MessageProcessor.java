/**
 * 
 */
package com.shettar.services.helpers;

import com.shettar.entities.ResponseMessage;

/**
 * @author Pradeep.Shettar
 *
 */
public class MessageProcessor {

	/**
	 * Recipient address
	 */
	String toAddress;

	/**
	 * Sender address
	 */
	String fromAddress;

	/**
	 * Message content to be sent.
	 */
	String messageBody;

	/**
	 * Message Subject.
	 */
	String messageSubject;

	/**
	 * @return the toAddress
	 */
	public String getToAddress() {
		return toAddress;
	}

	/**
	 * @param toAddress
	 *            the toAddress to set
	 */
	public void setToAddress(String toAddress) {
		this.toAddress = toAddress;
	}

	/**
	 * @return the fromAddress
	 */
	public String getFromAddress() {
		return fromAddress;
	}

	/**
	 * @param fromAddress
	 *            the fromAddress to set
	 */
	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}

	/**
	 * @return the messageBody
	 */
	public String getMessageBody() {
		return messageBody;
	}

	/**
	 * @param messageBody
	 *            the messageBody to set
	 */
	public void setMessageBody(String messageBody) {
		this.messageBody = messageBody;
	}

	/**
	 * @return the messageSubject
	 */
	public String getMessageSubject() {
		return messageSubject;
	}

	/**
	 * @param messageSubject
	 *            the messageSubject to set
	 */
	public void setMessageSubject(String messageSubject) {
		this.messageSubject = messageSubject;
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
		result = prime * result + ((fromAddress == null) ? 0 : fromAddress.hashCode());
		result = prime * result + ((messageBody == null) ? 0 : messageBody.hashCode());
		result = prime * result + ((messageSubject == null) ? 0 : messageSubject.hashCode());
		result = prime * result + ((toAddress == null) ? 0 : toAddress.hashCode());
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
		MessageProcessor other = (MessageProcessor) obj;
		if (fromAddress == null) {
			if (other.fromAddress != null)
				return false;
		} else if (!fromAddress.equals(other.fromAddress))
			return false;
		if (messageBody == null) {
			if (other.messageBody != null)
				return false;
		} else if (!messageBody.equals(other.messageBody))
			return false;
		if (messageSubject == null) {
			if (other.messageSubject != null)
				return false;
		} else if (!messageSubject.equals(other.messageSubject))
			return false;
		if (toAddress == null) {
			if (other.toAddress != null)
				return false;
		} else if (!toAddress.equals(other.toAddress))
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
		return "MessageProcessor [toAddress=" + toAddress + ", fromAddress=" + fromAddress + ", messageBody="
				+ messageBody + ", messageSubject=" + messageSubject + "]";
	}

	/**
	 * @param toAddress
	 * @param fromAddress
	 * @param messageBody
	 * @param messageSubject
	 */
	public MessageProcessor(String toAddress, String fromAddress, String messageBody, String messageSubject) {
		super();
		this.toAddress = toAddress;
		this.fromAddress = fromAddress;
		this.messageBody = messageBody;
		this.messageSubject = messageSubject;
	}

	/**
	 * @param messageId
	 * @return
	 */
	public ResponseMessage processMessage(Long messageId) {
		return null;
	}
}
