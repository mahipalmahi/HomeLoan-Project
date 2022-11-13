package com.ct.Loan.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ct.Loan.Model.Customer;
import com.ct.Loan.Model.Tracker;
import com.ct.Loan.Service.IAdminService;

@RestController
public class AdminController {
	@Autowired
	IAdminService adminService;
	
	@GetMapping("/getCustomers")
	public List<Customer>getCustomerData(){
		return adminService.getCustomerData();
	}
	@GetMapping("/getCustomerById/{cId}")
	public Customer getCustomerData(@PathVariable("cId") Integer appId) {
		Customer customer = adminService.getCustomerData(appId);
		return customer;	
	}
	@PutMapping("/updateCustomer")
	public String updateCustomer(@RequestBody Customer customer) {
		
		return adminService.updateCustomer(customer);	
	}
	@PostMapping("/addStatus")
	public String addStatus(@RequestBody Tracker tracker) {
		
		return adminService.addStatus(tracker);
		
	}
	@PutMapping("/updateStatus")
	public String updateStatus(@RequestBody Tracker tracker) {
		return adminService.updateStatus(tracker);
		
	}

}
