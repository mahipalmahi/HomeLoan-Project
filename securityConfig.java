package com.ct.Loan.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
@EnableWebSecurity
public class securityConfig extends WebSecurityConfigurerAdapter{
	 @Override
	 protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	  auth.inMemoryAuthentication().withUser("smith").password(passwordEncoder().encode("smith123")).roles("ADMIN")
	    .and().withUser("akhil").password(passwordEncoder().encode("akhil123")).roles("USER");
	 }
	 @Override
	 protected void configure(HttpSecurity http) throws Exception {
	  http.authorizeRequests().antMatchers("/getCustomers/getCustomerById/updateCustomer/addStatus").hasRole("ADMIN").anyRequest().authenticated().and().httpBasic();
	                http.csrf().disable();
//	            http.authorizeRequests().antMatchers("/product/getAllProducts").hasRole("USER").anyRequest().authenticated().and().httpBasic();
//	                http.csrf().disable();
	 }
	 @Bean
	 PasswordEncoder passwordEncoder() {
	  return new BCryptPasswordEncoder();
	 }
	 
}
