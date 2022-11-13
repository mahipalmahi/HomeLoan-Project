package com.ct.Loan.Dao;

import com.ct.Loan.Model.PropertyAndIncome;

public interface ICustPropertyAndIncomeDao {
	
	public PropertyAndIncome addPropertyAndIncomeDetails(PropertyAndIncome propertyAndIncome);
	
	public String updatePropertyDetails(PropertyAndIncome propertyAndIncome);
}
