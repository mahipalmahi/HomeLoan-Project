package com.ct.Loan.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Transient;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer appId;
	@Size(min = 2, max = 20, message = "FIRST NAME can vary between 2 to 20 characters")
	@NotNull(message = "FIRST NAME cannot be empty")
	@Pattern(regexp = "[A-Za-z]+", message = "FIRST NAME can only be alphabets")
	private String firstName;
	@Size(min = 2, max = 20, message = "LAST NAME can vary between 2 to 20 characters")
	@NotNull(message = "LAST NAME cannot be empty")
	@Pattern(regexp = "[A-Za-z]+", message = "LAST NAME can only be alphabets")
	private String lastName;
	@NotNull(message = "EMAIL is mandatory")
	@Pattern(regexp = "^[A-Za-z0-9+_.-]+@(.+)$", message = "Please enter a valid Email Id")
	private String email;
	@NotNull(message = "PASSWORD is mandatory")
	@Size(min = 5, max = 12, message = "Mandatory Password Length between 8-12 characters")
	@Pattern(regexp = "^[A-Za-z0-9+_.-]+@(.+)$", message = "Please enter a valid password")
	private String password;
	@NotNull(message = "Confirm PASSWORD is mandatory")
	@Size(min = 5, max = 12, message = "Mandatory Password Length between 8-12 characters")
	@Pattern(regexp = "^[A-Za-z0-9+_.-]+@(.+)$", message = "Please enter a valid password")
	@Transient
	private String confirmPwd;
	@Size(min = 10, max = 10, message = "Enter valid Phone Number")
	@Pattern(regexp = "^\\+?[0-9-]+$", message = "Phone Number can only be Numbers")
	@NotNull(message = "Phone No is mandatory")
	private String phoneNo;
	@NotNull(message = "Please select your Nationality")
	@Pattern(regexp = "[A-Za-z]+", message = "Nationality can only be alphabets")
	private String nationality;
	
	public Integer getAppId() {
		return appId;
	}
	public void setAppId(Integer appId) {
		this.appId = appId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPwd() {
		return confirmPwd;
	}
	public void setConfirmPwd(String confirmPwd) {
		this.confirmPwd = confirmPwd;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public Customer(Integer appId, String firstName, String lastName, String email, String password, String confirmPwd,
			String phoneNo, String nationality) {
		super();
		this.appId = appId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.confirmPwd = confirmPwd;
		this.phoneNo = phoneNo;
		this.nationality = nationality;
	}
	@Override
	public String toString() {
		return "Customer [appId=" + appId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", confirmPwd=" + confirmPwd + ", phoneNo=" + phoneNo + ", nationality="
				+ nationality + "]";
	}
	
public Customer() {
	// TODO Auto-generated constructor stub
}

}
