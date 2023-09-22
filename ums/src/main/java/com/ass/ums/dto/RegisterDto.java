package com.ass.ums.dto;

import java.io.Serializable;

public class RegisterDto implements Serializable {
	
	private String userName;
	
	private String email;
	
	private String password;
	
	private String contactNumber;
	
	private String country;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "RegisterDto [userName=" + userName + ", email=" + email + ", password=" + password + ", contactNumber="
				+ contactNumber + ", country=" + country + "]";
	}

}
