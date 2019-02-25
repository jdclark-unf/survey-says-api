package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Table(name = "response")
@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Response {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "response_id")
	private int responseId;
	
	// Not sure about relation... using 1:1 for now
	@OneToOne
	@JoinColumn(name = "question_id")
	private Question question;

	@OneToOne
	@JoinColumn(name = "answer_chosen")
	private AnswerChoice answerChosen;
	
	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the responseId
	 */
	public int getResponseId() {
		return responseId;
	}

	/**
	 * @param responseId the responseId to set
	 */
	public void setResponseId(int responseId) {
		this.responseId = responseId;
	}

	/**
	 * @return the question
	 */
	public Question getQuestion() {
		return question;
	}

	/**
	 * @param question the question to set
	 */
	public void setQuestion(Question question) {
		this.question = question;
	}

	/**
	 * @return the answerChosen
	 */
	public AnswerChoice getAnswerChosen() {
		return answerChosen;
	}

	/**
	 * @param answerChosen the answerChosen to set
	 */
	public void setAnswerChosen(AnswerChoice answerChosen) {
		this.answerChosen = answerChosen;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((answerChosen == null) ? 0 : answerChosen.hashCode());
		result = prime * result + ((question == null) ? 0 : question.hashCode());
		result = prime * result + responseId;
		return result;
	}

	/* (non-Javadoc)
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
		Response other = (Response) obj;
		if (answerChosen == null) {
			if (other.answerChosen != null)
				return false;
		} else if (!answerChosen.equals(other.answerChosen))
			return false;
		if (question == null) {
			if (other.question != null)
				return false;
		} else if (!question.equals(other.question))
			return false;
		if (responseId != other.responseId)
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
//	@Override
//	public String toString() {
//		return "Response [responseId=" + responseId + ", question=" + question + ", answerChosen=" + answerChosen + "]";
//	}
	
	
	
}
