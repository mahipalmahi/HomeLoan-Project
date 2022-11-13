package com.ct.Loan.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ct.Loan.Model.LoanPersonalDetails;
import com.ct.Loan.Service.IPersonalDetailsService;

@RestController
public class PersonalDetailsController {
	@Autowired
	IPersonalDetailsService personalDetailsService;
	@PostMapping("/personalDetails")
	public String personalDetails(@Valid @RequestBody LoanPersonalDetails personalDetails) {
		personalDetailsService.personalDetails(personalDetails);
		return "Loan persanal details added successfully"+":-"+personalDetails;
		
	}
	@PutMapping("/update")
	public String updatePersonalDetails(@RequestBody LoanPersonalDetails personalDetails) {
		
		return "updated successfully"+":-"+personalDetails;
		
	}
	
}
