package com.ct.Loan.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ct.Loan.Model.Loan;
import com.ct.Loan.Service.ILoanService;

@RestController
public class LoanController {
	
	@Autowired
	ILoanService loanService;
	@PostMapping("/loanDetails")
	public String addLoanDetails(@Valid @RequestBody Loan loan) {
		 loanService.addLoanDetails(loan);
		return "Loan details added successfully"+":-"+loan;	
	}
}
