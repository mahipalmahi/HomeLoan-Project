package com.ct.Loan.Service;

import com.ct.Loan.Model.LoanPersonalDetails;

public interface IPersonalDetailsService {
	
	public LoanPersonalDetails personalDetails(LoanPersonalDetails personalDetails);
	
	public LoanPersonalDetails updatePersonalDetails(LoanPersonalDetails personalDetails);
}
