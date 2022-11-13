package com.ct.Loan.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ct.Loan.Dao.ICustPropertyAndIncomeDao;
import com.ct.Loan.Model.PropertyAndIncome;

@Service
public class CustPropertyAndIncomeService implements ICustPropertyAndIncomeService{
	@Autowired
	ICustPropertyAndIncomeDao custPropertyAndIncomeDao ;

	@Override
	
	public PropertyAndIncome addPropertyAndIncomeDetails(PropertyAndIncome propertyAndIncome) {
		
		return custPropertyAndIncomeDao.addPropertyAndIncomeDetails(propertyAndIncome);
	}

	@Override
	public String updatePropertyDetails(PropertyAndIncome propertyAndIncome) {
		
		return custPropertyAndIncomeDao.updatePropertyDetails(propertyAndIncome);
	}
	


}
