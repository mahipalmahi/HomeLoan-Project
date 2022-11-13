package com.ct.Loan.Dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.ct.Loan.Model.Loan;
@Repository
public class LoanDao implements ILoanDao{
	@PersistenceContext
	EntityManager enitityManager;
	@Override
	public Loan addLoanDetails(Loan loan) {
		enitityManager.persist(loan);
		return loan;
	}

}
