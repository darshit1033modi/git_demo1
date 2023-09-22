package com.ass.ums.service;

public class AuthService {
	
	
	// Alt + Shift + j
	/**
	 * @param token of type String
	 * @return
	 */
	public String getUserNameFromToken(String token) {
		if(token != null) return "Username";
		return "Invalid Token";
	}

}
