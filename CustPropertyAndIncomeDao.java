package com.ct.Loan.Dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.ct.Loan.Model.PropertyAndIncome;

@Repository
@Transactional
public class CustPropertyAndIncomeDao implements ICustPropertyAndIncomeDao{
	
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public PropertyAndIncome addPropertyAndIncomeDetails(PropertyAndIncome propertyAndIncome) {
		entityManager.persist(propertyAndIncome);
		System.out.println("saveCustomerAction after persists Dao : "+propertyAndIncome);
		return propertyAndIncome;
	}

	@Override
	public String updatePropertyDetails(PropertyAndIncome propertyAndIncome) {
		entityManager.merge(propertyAndIncome);
		return "property details update ";
	}
}
