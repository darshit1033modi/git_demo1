package com.ass.ums.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ass.ums.constants.AppConstants;
import com.ass.ums.dto.AppResponseDto;
import com.ass.ums.dto.RegisterDto;
import com.ass.ums.entity.Register;
import com.ass.ums.service.MySqlServiceImpl;
import com.ass.ums.service.RegisterService;

//@Controller
@RestController
public class RegisterController {
	
	@Autowired
	private RegisterService registerService;
	
	@Autowired
	private MySqlServiceImpl impl;
	
	public RegisterController() {
		System.out.println("register Controller created");
	}
	
//	@RequestMapping(value = "/processRegister", method = HttpMethod.POST)
	@PostMapping(value = AppConstants.PROCESS_REGISTER)
	public @ResponseBody AppResponseDto processRegister(@RequestBody RegisterDto registerDto) {
		return registerService.prepareAndSaveRegister(registerDto);
	}
	
	@GetMapping(value = AppConstants.GET_ALL)
	public @ResponseBody AppResponseDto getAll() {
		return registerService.findAll();
	}
	
	@GetMapping(value = AppConstants.GET_BY_ID)
	public AppResponseDto getById(@RequestParam Long id) {
		return registerService.getById(id);
	}
	
	@GetMapping(value = AppConstants.GET_BY_USER_NAME)
	public AppResponseDto getByUserName(@RequestParam String name) {
		return registerService.getByUserName(name);
	}
	
	@GetMapping(value = AppConstants.GET_BY_EMAIL_ID)
	public AppResponseDto getByEmailId(@RequestHeader("email") String email) {
		return registerService.getByEmailId(email);
	}
	
	@GetMapping(value = AppConstants.GET_BY_CONTACT_EMAIL)
	public AppResponseDto getByContactNumberAndEmail(@RequestParam String contactNumber, @RequestParam String email) {
		return registerService.getByContactNumberAndEmail(contactNumber, email);
	}
	
	@GetMapping(value = AppConstants.GET_BY_USERNAME_EMAIL)
	public AppResponseDto getByUserNameAndEmail(@RequestHeader("userName") String userName, @RequestHeader("email") String email) {
		return registerService.getByUserNameAndEmail(userName, email);
	}
	
	@GetMapping(value = AppConstants.GET_ALL_REGISTER)
	public AppResponseDto getAllData() {
		return registerService.findAllData();
	}
	
	@GetMapping(value = AppConstants.GET_ALL_USER_NAME)
	public AppResponseDto getAllUserName() {
		return registerService.findAlluserName();
	}

	@GetMapping(value = AppConstants.GET_ALL_JDBC)
	public List<Register> getAllByJdbc() {
		return impl.getAll();
	}
}
