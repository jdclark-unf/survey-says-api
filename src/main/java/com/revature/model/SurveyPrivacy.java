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
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFilter;

@Table(name = "survey_privacy")
@Entity
public class SurveyPrivacy {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "privacy_id")
	private int privacyId;
	
	@Column(name = "privacy")
	private String privacyType;

	public SurveyPrivacy() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the privacyId
	 */
	public int getPrivacyId() {
		return privacyId;
	}

	/**
	 * @param privacyId the privacyId to set
	 */
	public void setPrivacyId(int privacyId) {
		this.privacyId = privacyId;
	}

	/**
	 * @return the privacyType
	 */
	public String getPrivacyType() {
		return privacyType;
	}

	/**
	 * @param privacyType the privacyType to set
	 */
	public void setPrivacyType(String privacyType) {
		this.privacyType = privacyType;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + privacyId;
		result = prime * result + ((privacyType == null) ? 0 : privacyType.hashCode());
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
		SurveyPrivacy other = (SurveyPrivacy) obj;
		if (privacyId != other.privacyId)
			return false;
		if (privacyType == null) {
			if (other.privacyType != null)
				return false;
		} else if (!privacyType.equals(other.privacyType))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SurveyPrivacy [privacyId=" + privacyId + ", privacyType=" + privacyType + "]";
	}
	
	
	
}
