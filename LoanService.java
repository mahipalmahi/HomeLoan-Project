package com.ct.Loan.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ct.Loan.Dao.ILoanDao;
import com.ct.Loan.Model.Loan;

@Service
public class LoanService implements ILoanService{
	@Autowired
	ILoanDao loanDao;
	@Override
	@Transactional
	public Loan addLoanDetails(Loan loan) {
		
		return loanDao.addLoanDetails(loan);
	}
	
	
}
