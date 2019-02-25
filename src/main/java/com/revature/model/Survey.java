package com.revature.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

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

@Table(name = "survey")
@Entity
public class Survey {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "survey_id")
	private int surveyId;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private SurveyUser creator;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "date_created")
	private Date dateCreated;
	
	@Column(name = "closing_date")
	private Date closingDate;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "status_id")
	private SurveyStatus status;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "privacy_id")
	private SurveyPrivacy privacy;
	
	public Survey() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the surveyId
	 */
	public int getSurveyId() {
		return surveyId;
	}


	/**
	 * @param surveyId the surveyId to set
	 */
	public void setSurveyId(int surveyId) {
		this.surveyId = surveyId;
	}


	/**
	 * @return the creator
	 */
	public SurveyUser getCreator() {
		return creator;
	}


	/**
	 * @param creator the creator to set
	 */
	public void setCreator(SurveyUser creator) {
		this.creator = creator;
	}


	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}


	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}


	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}


	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}


	/**
	 * @return the dateCreated
	 */
	public Date getDateCreated() {
		return dateCreated;
	}


	/**
	 * @param dateCreated the dateCreated to set
	 */
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}


	/**
	 * @return the closingDate
	 */
	public Date getClosingDate() {
		return closingDate;
	}


	/**
	 * @param closingDate the closingDate to set
	 */
	public void setClosingDate(Date closingDate) {
		this.closingDate = closingDate;
	}


	/**
	 * @return the status
	 */
	public SurveyStatus getStatus() {
		return status;
	}


	/**
	 * @param status the status to set
	 */
	public void setStatus(SurveyStatus status) {
		this.status = status;
	}


	/**
	 * @return the privacy
	 */
	public SurveyPrivacy getPrivacy() {
		return privacy;
	}


	/**
	 * @param privacy the privacy to set
	 */
	public void setPrivacy(SurveyPrivacy privacy) {
		this.privacy = privacy;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((closingDate == null) ? 0 : closingDate.hashCode());
		result = prime * result + ((creator == null) ? 0 : creator.hashCode());
		result = prime * result + ((dateCreated == null) ? 0 : dateCreated.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + surveyId;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Survey other = (Survey) obj;
		if (closingDate == null) {
			if (other.closingDate != null)
				return false;
		} else if (!closingDate.equals(other.closingDate))
			return false;
		if (creator == null) {
			if (other.creator != null)
				return false;
		} else if (!creator.equals(other.creator))
			return false;
		if (dateCreated == null) {
			if (other.dateCreated != null)
				return false;
		} else if (!dateCreated.equals(other.dateCreated))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (surveyId != other.surveyId)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Survey [surveyId=" + surveyId + ", creator=" + creator + ", title=" + title + ", description="
				+ description + ", dateCreated=" + dateCreated + ", closingDate=" + closingDate + "]";
	}
	
	
	
	
}
