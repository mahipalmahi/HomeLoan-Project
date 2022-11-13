package com.ct.Loan.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.ct.Loan.Model.Customer;
@Repository
@Transactional
public class CustomerDaoImpl implements ICustomerDao{
	@PersistenceContext
	EntityManager entityManager;
	@Override
	public Customer addCustomerDetails(Customer customer) {
		entityManager.persist(customer);
		return customer;
	}
	@Override
	public String appStatus(Integer appId) {
		TypedQuery<Customer> query = entityManager.createQuery("select i from Customer i where i.appId=?1",Customer.class);
		query.setParameter(1, appId);
		@SuppressWarnings("rawtypes")
		List result = query.getResultList();
		if(result.size()>0) {
			return "your application is under pending";
		}else {
			return"Invalid Application number";
		}
		
	}
	@Override
	public String customerUpdate(Customer customer) {
		entityManager.merge(customer);
		return "updated successfully";
	}

}
