package com.ct.Loan.Controller;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ct.Loan.Model.Customer;
import com.ct.Loan.Service.ICustomerService;

@RestController
public class CustomerController {
	@Autowired
	ICustomerService customerService;
	@PostMapping("/addCustomer")
	public Customer addCustomerDetails(@Valid @RequestBody Customer customer) {
		
		return customerService.addCustomerDetails(customer);
	}
	@GetMapping("/applicationStatus/{sta}")
	public String appStatus(@PathVariable("sta") Integer appId) {
		return customerService.appStatus(appId);	
	}
	@PutMapping("/customerUpdate")
	public String customerUpdate(@RequestBody Customer customer) {
		return customerService.customerUpdate(customer);
		
	}
	
}
