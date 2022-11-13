package com.ct.Loan.Service;


import java.util.List;

import com.ct.Loan.Model.Customer;
import com.ct.Loan.Model.Tracker;


public interface IAdminService {
	
	public List<Customer>getCustomerData();
	
	public Customer getCustomerData(Integer appId);
	
	public String updateCustomer(Customer customer);
	
	public String addStatus(Tracker tracker);
	
	public String updateStatus(Tracker tracker);
}
