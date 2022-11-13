package com.ct.Loan.Dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.ct.Loan.Model.LoanPersonalDetails;

@Repository
@Transactional
public class PersonalDetailsDao implements IPersonalDetailsDao{
	@PersistenceContext
	EntityManager entityManager;
	@Override
	
	public LoanPersonalDetails personalDetails(LoanPersonalDetails personalDetails) {
		entityManager.persist(personalDetails);
		return personalDetails;
	}
	@Override
	
	public LoanPersonalDetails updatePersonalDetails(LoanPersonalDetails personalDetails) {
		entityManager.merge(personalDetails);
		return personalDetails;
	}

}
