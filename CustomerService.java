package com.ct.Loan.Service;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ct.Loan.Dao.ICustomerDao;
import com.ct.Loan.Model.Customer;

@Service
public class CustomerService implements ICustomerService{
	@Autowired
	ICustomerDao customerDao;
	@Override
	public Customer addCustomerDetails(Customer customer) {
		
		return customerDao.addCustomerDetails(customer);
	}

	@Override
	public String appStatus(Integer appId) {
		// TODO Auto-generated method stub
		return customerDao.appStatus(appId);
	}

	@Override
	public String customerUpdate(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.customerUpdate(customer);
	}


}
