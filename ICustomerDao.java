package com.ct.Loan.Dao;



import com.ct.Loan.Model.Customer;


public interface ICustomerDao {
	
	public Customer addCustomerDetails(Customer customer);
	
	public String appStatus(Integer appId);
	
	public String customerUpdate(Customer customer);

	
	
}
