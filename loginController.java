package com.ct.Loan.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ct.Loan.Service.IUserLoginService;

@RestController
public class loginController {
	@Autowired
	IUserLoginService userLoginService;
	
	@GetMapping("/login/{em}/{pass}")
	public String UserLogin(@PathVariable("em") String email,@PathVariable("pass") String password) {
		return userLoginService.UserLogin(email, password);
	}
}
