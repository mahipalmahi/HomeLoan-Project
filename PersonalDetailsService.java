package com.ct.Loan.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ct.Loan.Dao.IPersonalDetailsDao;
import com.ct.Loan.Model.LoanPersonalDetails;

@Service
public class PersonalDetailsService implements IPersonalDetailsService{
	@Autowired
	IPersonalDetailsDao personalDetailsDao;
	@Override
	public LoanPersonalDetails personalDetails(LoanPersonalDetails personalDetails) {
		
		return personalDetailsDao.personalDetails(personalDetails);
	}
	@Override
	public LoanPersonalDetails updatePersonalDetails(LoanPersonalDetails personalDetails) {
		
		return personalDetailsDao.updatePersonalDetails(personalDetails);
	}

}
