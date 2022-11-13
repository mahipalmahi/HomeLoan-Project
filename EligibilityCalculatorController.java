package com.ct.Loan.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ct.Loan.Model.EligibiltyCalculator;
import com.ct.Loan.Service.IEligibilityCalculatorService;

@RestController
public class EligibilityCalculatorController {
	
	@Autowired
	IEligibilityCalculatorService eligibilityCalculatorService;
	@PostMapping("/calculateEligibility")
	public String maxLoan( @RequestBody EligibiltyCalculator calc) {
		
		Double result = eligibilityCalculatorService.maxLoan(calc);
		if(result <= calc.getmonthlyIncome()){
			return "sorry...!! your not eligible for the loan";
		}else {
			return "Your eligible for this loan...";
		}
	}
}
