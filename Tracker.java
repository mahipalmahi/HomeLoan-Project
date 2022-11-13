package com.ct.Loan.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "status")
public class Tracker {
	@Id
	@Column(length = 30)
	private long applicationId;
	private String status;
	
	public long getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(long applicationId) {
		this.applicationId = applicationId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Tracker(long applicationId, String status) {
		super();
		this.applicationId = applicationId;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Tracker [applicationId=" + applicationId + ", status=" + status + "]";
	}
	public Tracker() {
		// TODO Auto-generated constructor stub
	}
	
}

	
	


	