package com.ass.ums.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class AuthServiceTest {
	
	@BeforeAll
	public static void run() {
		System.out.println("executing @BeforeAll");
	}
	
	@BeforeEach
	public void after() {
		System.out.println("executing @BeforeEach");
	}
	
	@Test
	public void testGetUserNameFromToken() {
		AuthService authService = new AuthService();
		String result = authService.getUserNameFromToken("token");
		assertEquals("Username", result);
	}
	
	@Test
	public void testGetUserNameFromTokenWithNull() {
		AuthService authService = new AuthService();
		String result = authService.getUserNameFromToken(null);
		assertEquals("Invalid Token", result);
	}
	
	@AfterAll
	public static void destroy() {
		System.out.println("executing @AfterAll");
	}
	
	@AfterEach
	public void before() {
		System.out.println("executing @AfterEach");
	}

}
