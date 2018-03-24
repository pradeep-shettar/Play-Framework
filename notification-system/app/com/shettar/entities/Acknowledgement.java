/**
 * 
 */
package com.shettar.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Pradeep.Shettar
 * 
 *         Response entity class
 *
 */
public class Acknowledgement {

	
	/**
	 * All the messages statuses.
	 */
	@JsonProperty("responses")
	List<ResponseMessage> responses;

	/**
	 * @return the responses
	 */
	public List<ResponseMessage> getResponses() {
		return responses;
	}

	/**
	 * @param responses
	 *            the responses to set
	 */
	public void setResponses(List<ResponseMessage> responses) {
		this.responses = responses;
	}

	/**
	 * Default constructor
	 */
	public Acknowledgement() {
		
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
		result = prime * result + ((responses == null) ? 0 : responses.hashCode());
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
		Acknowledgement other = (Acknowledgement) obj;
		if (responses == null) {
			if (other.responses != null)
				return false;
		} else if (!responses.equals(other.responses))
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
		return "Acknowledgement [responses=" + responses + "]";
	}

	/**
	 * @param responses
	 */
	public Acknowledgement(List<ResponseMessage> responses) {
		super();
		this.responses = responses;
	}

}
