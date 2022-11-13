package com.ct.Loan.Dao;

import com.ct.Loan.Model.LoanPersonalDetails;

public interface IPersonalDetailsDao {
	
	public LoanPersonalDetails personalDetails(LoanPersonalDetails personalDetails);
	
	public LoanPersonalDetails updatePersonalDetails(LoanPersonalDetails personalDetails);
}
