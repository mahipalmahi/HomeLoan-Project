package com.ct.Loan.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ct.Loan.Dao.IAdminDao;
import com.ct.Loan.Model.Customer;
import com.ct.Loan.Model.Tracker;

@Service
public class AdminService implements IAdminService{
	@Autowired
	IAdminDao admindao;
	@Override
	public List<Customer> getCustomerData() {
		
		return admindao.getCustomerList();
	}
	@Override
	public Customer getCustomerData(Integer appId) {
		
		return admindao.getCustomerData(appId);
	}
	@Override
	public String updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return admindao.updateCustomer(customer);
	}
	@Override
	public String addStatus(Tracker tracker) {
		return admindao.addStatus(tracker);
	}
	@Override
	public String updateStatus(Tracker tracker) {
		// TODO Auto-generated method stub
		return admindao.updateStatus(tracker);
	}

	
	
}
