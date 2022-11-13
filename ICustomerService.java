package com.ct.Loan.Service;

import com.ct.Loan.Model.Customer;

public interface ICustomerService {
	
	public Customer addCustomerDetails(Customer customer);
	
	public String appStatus(Integer appId);
	
	public String customerUpdate(Customer customer);
	
	
	
}
