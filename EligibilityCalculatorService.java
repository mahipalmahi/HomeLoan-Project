package com.ct.Loan.Service;

import org.springframework.stereotype.Service;

import com.ct.Loan.Model.EligibiltyCalculator;

@Service
public class EligibilityCalculatorService implements IEligibilityCalculatorService{
	
	@Override
	public Double maxLoan(EligibiltyCalculator calc) {
		return 60*(0.6*calc.getmonthlyIncome());
		
	}
	
	
}	

