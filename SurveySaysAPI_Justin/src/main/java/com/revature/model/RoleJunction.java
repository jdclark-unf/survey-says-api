package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Table(name = "role_junction")
@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class RoleJunction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "junction_id")
	private int junctionId;
	
	@OneToMany
	@JoinColumn(name = "survey_id")
	private Survey survey;
	
	@OneToMany
	@JoinColumn(name = "user_id")
	private SurveyUser user;
	
	@OneToMany
	@JoinColumn(name = "role_id")
	private SurveyRole role;

	public RoleJunction() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the junctionId
	 */
	public int getJunctionId() {
		return junctionId;
	}

	/**
	 * @param junctionId the junctionId to set
	 */
	public void setJunctionId(int junctionId) {
		this.junctionId = junctionId;
	}

	/**
	 * @return the survey
	 */
	public Survey getSurvey() {
		return survey;
	}

	/**
	 * @param survey the survey to set
	 */
	public void setSurvey(Survey survey) {
		this.survey = survey;
	}

	/**
	 * @return the user
	 */
	public SurveyUser getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(SurveyUser user) {
		this.user = user;
	}

	/**
	 * @return the role
	 */
	public SurveyRole getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(SurveyRole role) {
		this.role = role;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + junctionId;
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		result = prime * result + ((survey == null) ? 0 : survey.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		RoleJunction other = (RoleJunction) obj;
		if (junctionId != other.junctionId)
			return false;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		if (survey == null) {
			if (other.survey != null)
				return false;
		} else if (!survey.equals(other.survey))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RoleJunction [junctionId=" + junctionId + ", survey=" + survey + ", user=" + user + ", role=" + role
				+ "]";
	}	
	
	
}
