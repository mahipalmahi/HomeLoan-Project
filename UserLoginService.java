package com.ct.Loan.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ct.Loan.Dao.IUserLoginDao;

@Service
public class UserLoginService implements IUserLoginService{
	@Autowired
	IUserLoginDao userLoginDao;
	@Override
	public String UserLogin(String email, String password) {
		return userLoginDao.UserLogin(email, password);
	}

}
