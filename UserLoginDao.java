package com.ct.Loan.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class UserLoginDao implements IUserLoginDao{
	@PersistenceContext
	EntityManager entityManager;
	@Override
	public String UserLogin(String email, String password) {
		Query query = entityManager.createQuery("select l from Customer l where l.email=?1 and password=?2");
		query.setParameter(1, email);
		query.setParameter(2, password);
		@SuppressWarnings("rawtypes")
		List result = query.getResultList();
		
		if(result.size()>0) {
			return "login successfully";
		}else {
			return "not Login";
		}
	}
	
	
}
