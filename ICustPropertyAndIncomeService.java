package com.ct.Loan.Service;

import com.ct.Loan.Model.PropertyAndIncome;

public interface ICustPropertyAndIncomeService {

	public PropertyAndIncome addPropertyAndIncomeDetails(PropertyAndIncome propertyAndIncome);
	
	public String updatePropertyDetails(PropertyAndIncome propertyAndIncome);
}
