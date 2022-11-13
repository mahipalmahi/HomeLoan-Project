package com.ct.Loan.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;


@Entity

public class Loan {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long loanId;
	@NotNull(message = "Maximum Loan Grant is mandatory.! ")
	private Double maxLoanGrant;
	private Double interestRate = 8.50;
	@NotNull(message = "Tenure is mandatory.! ")
	@Min(3) @Max(72)
	private Integer tenure;
	@NotNull(message = "Loan Amount is mandatory.! ")
	private Long loanAmount;


	public Long getLoanId() {
		return loanId;
	}


	public void setLoanId(Long loanId) {
		this.loanId = loanId;
	}


	public Double getMaxLoanGrant() {
		return maxLoanGrant;
	}


	public void setMaxLoanGrant(Double maxLoanGrant) {
		this.maxLoanGrant = maxLoanGrant;
	}


	public Double getInterestRate() {
		return interestRate;
	}


	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}


	public Integer getTenure() {
		return tenure;
	}


	public void setTenure(Integer tenure) {
		this.tenure = tenure;
	}


	public Long getLoanAmount() {
		return loanAmount;
	}


	public void setLoanAmount(Long loanAmount) {
		this.loanAmount = loanAmount;
	}


	public Loan(Long loanId, Double maxLoanGrant, Double interestRate, Integer tenure, Long loanAmount) {
		super();
		this.loanId = loanId;
		this.maxLoanGrant = maxLoanGrant;
		this.interestRate = interestRate;
		this.tenure = tenure;
		this.loanAmount = loanAmount;
	}


	@Override
	public String toString() {
		return "Loan [loanId=" + loanId + ", maxLoanGrant=" + maxLoanGrant + ", interestRate=" + interestRate
				+ ", tenure=" + tenure + ", loanAmount=" + loanAmount + "]";
	}

	
public Loan() {
	// TODO Auto-generated constructor stub
}
}
