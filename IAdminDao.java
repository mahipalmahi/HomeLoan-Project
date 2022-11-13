package com.ct.Loan.Dao;

import java.util.List;

import com.ct.Loan.Model.Customer;
import com.ct.Loan.Model.Tracker;

public interface IAdminDao {
	
	public List<Customer> getCustomerList();
	
	public Customer getCustomerData(Integer appId);
	
	public String updateCustomer(Customer customer);
	
	public String addStatus(Tracker tracker);
	
	public String updateStatus(Tracker tracker);

}
