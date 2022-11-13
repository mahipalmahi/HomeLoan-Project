package com.ct.Loan.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ct.Loan.Model.PropertyAndIncome;
import com.ct.Loan.Service.ICustPropertyAndIncomeService;

@RestController
public class IncomeController {
	@Autowired
	ICustPropertyAndIncomeService custPropertyAndIncomeService;
	@PostMapping("/propertyAndIncome")
	public String saveCustomerAction(@Valid @RequestBody PropertyAndIncome propertyAndIncome) {
		custPropertyAndIncomeService.addPropertyAndIncomeDetails(propertyAndIncome);
		return "Property and Income Details aploaded succefully"+":-"+propertyAndIncome;
		
	}
	@PutMapping("/updateIncomedetails")
	public String updatePropertyDetails(@RequestBody PropertyAndIncome propertyAndIncome) {
		return custPropertyAndIncomeService.updatePropertyDetails(propertyAndIncome);
	}
}
