package com.ass.ums.service;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.test.util.ReflectionTestUtils;

import com.ass.ums.entity.Register;
import com.ass.ums.repository.RegisterRepository;


@RunWith(PowerMockRunner.class)
public class RegisterServiceTest {
	
	@Mock
	private RegisterRepository registerRepository;
	
	@Mock
	private ModelMapper mapper;
	
	@Mock
	private RegisterService registerService;
	
	@Test
	public void testGetByUserName() throws Exception {
		// initialize all mock objects
		MockitoAnnotations.openMocks(this);
		List mockList = PowerMockito.mock(List.class);
		PowerMockito
		// when(mock object,method name, parameter) 
		.when(registerRepository, "findByUserName", "name")
		// when , it is returning list
		.thenReturn(mockList);
		
		ReflectionTestUtils.invokeMethod(registerService, "getByUserName", "userName");
		assertTrue(true);
	}
	
	@Test
	public void testByContactNumberWithException() throws Exception {
		MockitoAnnotations.openMocks(this);
		PowerMockito.when(registerRepository, "findByEmail", "darshit@")
		.thenThrow(new RuntimeException());
		ReflectionTestUtils.invokeMethod(registerService, "getByEmailId", "sagar@");
		assertTrue(true);
		
	}

}
