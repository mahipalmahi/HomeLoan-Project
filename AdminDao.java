package com.ct.Loan.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.ct.Loan.Model.Customer;
import com.ct.Loan.Model.Tracker;

@Repository
@Transactional
public class AdminDao implements IAdminDao{
	@PersistenceContext
	EntityManager entityManager;
	@Override
	public List<Customer> getCustomerList() {
		TypedQuery<Customer> query = entityManager.createQuery("select t from Customer t",Customer.class);
		return query.getResultList();
	}
	@Override
	public Customer getCustomerData(Integer appId) {
		
		return entityManager.find(Customer.class, appId);
	}
	@Override
	public String updateCustomer(Customer customer) {
		entityManager.merge(customer);
		return "Customer Updated succefully with new details"+":-"+customer;
	}
	@Override
	public String addStatus(Tracker tracker) {
		entityManager.persist(tracker);
		return "The application"+":-"+tracker.getApplicationId()+" "+"is"+" "+tracker.getStatus();
	}
	@Override
	public String updateStatus(Tracker tracker) {
		entityManager.merge(tracker);
		return "status updated successfully";
	}
	
	
	
}
