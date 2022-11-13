package com.ct.Loan.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ct.Loan.Model.EmiCalculator;
import com.ct.Loan.Service.IEmiCalculatorService;

@RestController

public class EmiCalculatorController {
	
	@Autowired
	IEmiCalculatorService emiCalculatorService;
	@PostMapping("/emiCalculator")
	public Double calculateEmi( @RequestBody EmiCalculator emicalculator) {
		Double emicalc = emiCalculatorService.calculatemi(emicalculator);
		return emicalc;
	}
}
