package com.ct.Loan.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
public class PropertyAndIncome{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer propertyd;
	@NotNull(message = "Property Location is Mandatory")
	@Pattern(regexp = "^(\\w+ ?)*$", message = " Location  should be only characters")
	private String propertyLoc;
	@NotNull(message = "Property Name is Mandatory")
	@Pattern(regexp = "^(\\w+ ?)*$", message = " Property Name  should be only characters")
	private String propertyName;
	@NotNull(message = "Estimated Amount is Mandatory!!")
	private Long propertyEstimatedAmount;
	@NotNull(message = "Type of Employment is Mandatory")
	private String typeOfEmployment;
	@NotNull(message = "Retirement age is Mandatory")
	@Min(60) @Max(70)
	private Integer retirementAge;
	@NotNull(message = "Organization Type is Mandatory")
	@Pattern(regexp = "^[a-zA-Z ]*$", message = "Organization Type  should be only characters")
	private String orgType;
	@NotNull(message = "Employer Name is Mandatory!!")
	@Pattern(regexp = "^(\\w+ ?)*$", message = "Employer Name should be only characters")
	private String employerName;
	@NotNull(message = "Income is Mandatory")
	private Long income;
	public Integer getPropertyd() {
		return propertyd;
	}
	public void setPropertyd(Integer propertyd) {
		this.propertyd = propertyd;
	}
	public String getPropertyLoc() {
		return propertyLoc;
	}
	public void setPropertyLoc(String propertyLoc) {
		this.propertyLoc = propertyLoc;
	}
	public String getPropertyName() {
		return propertyName;
	}
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	public Long getPropertyEstimatedAmount() {
		return propertyEstimatedAmount;
	}
	public void setPropertyEstimatedAmount(Long propertyEstimatedAmount) {
		this.propertyEstimatedAmount = propertyEstimatedAmount;
	}
	public String getTypeOfEmployment() {
		return typeOfEmployment;
	}
	public void setTypeOfEmployment(String typeOfEmployment) {
		this.typeOfEmployment = typeOfEmployment;
	}
	public Integer getRetirementAge() {
		return retirementAge;
	}
	public void setRetirementAge(Integer retirementAge) {
		this.retirementAge = retirementAge;
	}
	public String getOrgType() {
		return orgType;
	}
	public void setOrgType(String orgType) {
		this.orgType = orgType;
	}
	public String getEmployerName() {
		return employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	public Long getIncome() {
		return income;
	}
	public void setIncome(Long income) {
		this.income = income;
	}
	public PropertyAndIncome(Integer propertyd,
			@NotNull(message = "Property Location is Mandatory") @Pattern(regexp = "^(\\w+ ?)*$", message = " Location  should be only characters") String propertyLoc,
			@NotNull(message = "Property Name is Mandatory") @Pattern(regexp = "^(\\w+ ?)*$", message = " Property Name  should be only characters") String propertyName,
			@NotNull(message = "Estimated Amount is Mandatory!!") Long propertyEstimatedAmount,
			@NotNull(message = "Type of Employment is Mandatory") String typeOfEmployment,
			@NotNull(message = "Retirement age is Mandatory") @Min(60) @Max(70) Integer retirementAge,
			@NotNull(message = "Organization Type is Mandatory") @Pattern(regexp = "^[a-zA-Z ]*$", message = "Organization Type  should be only characters") String orgType,
			@NotNull(message = "Employer Name is Mandatory!!") @Pattern(regexp = "^(\\w+ ?)*$", message = "Employer Name should be only characters") String employerName,
			@NotNull(message = "Income is Mandatory") Long income) {
		super();
		this.propertyd = propertyd;
		this.propertyLoc = propertyLoc;
		this.propertyName = propertyName;
		this.propertyEstimatedAmount = propertyEstimatedAmount;
		this.typeOfEmployment = typeOfEmployment;
		this.retirementAge = retirementAge;
		this.orgType = orgType;
		this.employerName = employerName;
		this.income = income;
	}
	@Override
	public String toString() {
		return "PropertyAndIncome [propertyd=" + propertyd + ", propertyLoc=" + propertyLoc + ", propertyName="
				+ propertyName + ", propertyEstimatedAmount=" + propertyEstimatedAmount + ", typeOfEmployment="
				+ typeOfEmployment + ", retirementAge=" + retirementAge + ", orgType=" + orgType + ", employerName="
				+ employerName + ", income=" + income + "]";
	}

public PropertyAndIncome() {
	// TODO Auto-generated constructor stub
}

	

	

}
