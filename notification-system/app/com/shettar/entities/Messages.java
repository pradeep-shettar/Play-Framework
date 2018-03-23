/**
 * 
 */
package com.shettar.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author Pradeep.Shettar
 *
 *         Entity class for holding messages from Request body.
 */
public class Messages {

	/**
	 * List to hold all the messages.
	 */
	@JsonProperty("messages")
	List<Message> allMessages;

	/**
	 * @return the allMessages
	 */
	public List<Message> getAllMessages() {
		return allMessages;
	}

	/**
	 * @param allMessages
	 *            the allMessages to set
	 */
	public void setAllMessages(List<Message> allMessages) {
		this.allMessages = allMessages;
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
		result = prime * result + ((allMessages == null) ? 0 : allMessages.hashCode());
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
		Messages other = (Messages) obj;
		if (allMessages == null) {
			if (other.allMessages != null)
				return false;
		} else if (!allMessages.equals(other.allMessages))
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
		return "Messages [allMessages=" + allMessages + "]";
	}

	/**
	 * @param allMessages
	 */
	public Messages(List<Message> allMessages) {
		super();
		this.allMessages = allMessages;
	}

}
