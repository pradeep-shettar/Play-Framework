/**
 * 
 */
package com.shettar.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Pradeep.Shettar
 * 
 *         Entity class for message
 */
public class Message {

	/**
	 * 
	 */
	public Message() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * Field for holding type of message.
	 */
	@JsonProperty("messageType")
	String messageType;

	/**
	 * Field for holding message.
	 */
	@JsonProperty("actualMessage")
	String actualMessage;

	/**
	 * Field for storing source
	 */
	@JsonProperty("from")
	String from;

	/**
	 * Field for destination
	 */
	@JsonProperty("to")
	String to;

	/**
	 * The subject for message.
	 */
	@JsonProperty("subject")
	String subject;

	/**
	 * @return the messageType
	 */
	public String getMessageType() {
		return messageType;
	}

	/**
	 * @param messageType
	 *            the messageType to set
	 */
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	/**
	 * @return the actualMessage
	 */
	public String getActualMessage() {
		return actualMessage;
	}

	/**
	 * @param actualMessage
	 *            the actualMessage to set
	 */
	public void setActualMessage(String actualMessage) {
		this.actualMessage = actualMessage;
	}

	/**
	 * @return the from
	 */
	public String getFrom() {
		return from;
	}

	/**
	 * @param from
	 *            the from to set
	 */
	public void setFrom(String from) {
		this.from = from;
	}

	/**
	 * @return the to
	 */
	public String getTo() {
		return to;
	}

	/**
	 * @param to
	 *            the to to set
	 */
	public void setTo(String to) {
		this.to = to;
	}

	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * @param subject
	 *            the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
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
		result = prime * result + ((actualMessage == null) ? 0 : actualMessage.hashCode());
		result = prime * result + ((from == null) ? 0 : from.hashCode());
		result = prime * result + ((messageType == null) ? 0 : messageType.hashCode());
		result = prime * result + ((subject == null) ? 0 : subject.hashCode());
		result = prime * result + ((to == null) ? 0 : to.hashCode());
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
		Message other = (Message) obj;
		if (actualMessage == null) {
			if (other.actualMessage != null)
				return false;
		} else if (!actualMessage.equals(other.actualMessage))
			return false;
		if (from == null) {
			if (other.from != null)
				return false;
		} else if (!from.equals(other.from))
			return false;
		if (messageType == null) {
			if (other.messageType != null)
				return false;
		} else if (!messageType.equals(other.messageType))
			return false;
		if (subject == null) {
			if (other.subject != null)
				return false;
		} else if (!subject.equals(other.subject))
			return false;
		if (to == null) {
			if (other.to != null)
				return false;
		} else if (!to.equals(other.to))
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
		return "Message [messageType=" + messageType + ", actualMessage=" + actualMessage + ", from=" + from + ", to="
				+ to + ", subject=" + subject + "]";
	}

	/**
	 * @param messageType
	 * @param actualMessage
	 * @param from
	 * @param to
	 * @param subject
	 */
	public Message(String messageType, String actualMessage, String from, String to, String subject) {
		super();
		this.messageType = messageType;
		this.actualMessage = actualMessage;
		this.from = from;
		this.to = to;
		this.subject = subject;
	}

}
