package com.ct.Loan.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loan_Details")
public class LoanPersonalDetails {
	@Id
	private int personAge;
	private long personDOB;
	private long personAdharCarsNo;
	private String personPancard;
	public int getPersonAge() {
		return personAge;
	}
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
	public long getPersonDOB() {
		return personDOB;
	}
	public void setPersonDOB(long personDOB) {
		this.personDOB = personDOB;
	}
	public long getPersonAdharCarsNo() {
		return personAdharCarsNo;
	}
	public void setPersonAdharCarsNo(long personAdharCarsNo) {
		this.personAdharCarsNo = personAdharCarsNo;
	}
	public String getPersonPancard() {
		return personPancard;
	}
	public void setPersonPancard(String personPancard) {
		this.personPancard = personPancard;
	}
	public LoanPersonalDetails(int personAge, long personDOB, long personAdharCarsNo, String personPancard) {
		super();
		this.personAge = personAge;
		this.personDOB = personDOB;
		this.personAdharCarsNo = personAdharCarsNo;
		this.personPancard = personPancard;
	}
	@Override
	public String toString() {
		return "LoanPersonalDetails [personAge=" + personAge + ", personDOB=" + personDOB + ", personAdharCarsNo="
				+ personAdharCarsNo + ", personPancard=" + personPancard + "]";
	}
	
	public LoanPersonalDetails() {
		// TODO Auto-generated constructor stub
	}
	
}
