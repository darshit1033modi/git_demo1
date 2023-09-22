package com.ass.ums.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.ass.ums.constants.AppConstants;
import com.ass.ums.dto.AppResponseDto;
import com.ass.ums.dto.RegisterDto;
import com.ass.ums.entity.Register;
import com.ass.ums.repository.RegisterRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class RegisterService {
	
	@Autowired
	private RegisterRepository repository;
	
	@Autowired
	private ModelMapper mapper;
	
	public RegisterService() {
		System.out.println("register service created");
	}
	
	private Map<String, RegisterDto> map = new HashMap<>();
	
	public AppResponseDto prepareAndSaveRegister(RegisterDto registerDto) {
		//map.put(registerDto.getUserName(), registerDto);
		try {
			// for converting dto to entity type object
			// ModelMapper mapper = new ModelMapper();
			Register register = mapper.map(registerDto, Register.class);
			register = repository.save(register);
			return new AppResponseDto(AppConstants.STATUS_CODE_SUCCESS, AppConstants.STATUS_SUCCESS, register, null);
		}
		catch(Exception e){
			return new AppResponseDto(AppConstants.STATUS_CODE_FAILURE, AppConstants.STATUS_FAILURE, null, e.getLocalizedMessage());
		}
	}
	
	public AppResponseDto findAll() {
		try {
			// sort the records based on descending or ascending
			//List<Register> registerList = repository.findAll(Sort.by("userName").descending());
			
			// with pagination
			//Page<Register> registerList = repository.findAll(PageRequest.of(0, 3));
			
			// both pagination and sort
			Page<Register> registerList = repository.findAll(PageRequest.of(0, 3, Sort.by("userName").ascending()));
			return new AppResponseDto(AppConstants.STATUS_CODE_SUCCESS, AppConstants.STATUS_SUCCESS, registerList, null);
		}
		catch(Exception e) {
			return new AppResponseDto(AppConstants.STATUS_CODE_FAILURE, AppConstants.STATUS_FAILURE, null, e.getLocalizedMessage());
		}
	}
	
	public AppResponseDto getById(Long id) {
		try {
			Optional<Register> optional = repository.findById(id);
			Register register = optional.get();
			return new AppResponseDto(AppConstants.STATUS_CODE_SUCCESS, AppConstants.STATUS_SUCCESS, register, null);
		}
		catch(Exception e) {
			return new AppResponseDto(AppConstants.STATUS_CODE_FAILURE, AppConstants.STATUS_FAILURE, null, e.getLocalizedMessage());
		}
	}
	
	public AppResponseDto getByUserName(String name) {
		try {
			List<Register> registerList = repository.findByUserName(name);
			return new AppResponseDto(AppConstants.STATUS_CODE_SUCCESS, AppConstants.STATUS_SUCCESS, registerList, null);
		}
		catch(Exception e) {
			return new AppResponseDto(AppConstants.STATUS_CODE_FAILURE, AppConstants.STATUS_FAILURE, null, e.getLocalizedMessage());
		}
	}
	
	public AppResponseDto getByEmailId(String emailId) {
		try {
			List<Register> registerList = repository.findByEmail(emailId);
			return new AppResponseDto(AppConstants.STATUS_CODE_SUCCESS, AppConstants.STATUS_SUCCESS, registerList, null);
		}
		catch(Exception e) {
			return new AppResponseDto(AppConstants.STATUS_CODE_FAILURE, AppConstants.STATUS_FAILURE, null, e.getLocalizedMessage());
		}
	}
	
	public AppResponseDto getByContactNumberAndEmail(String number, String email) {
		try {
			Register registerList = repository.findByContactNumberAndEmail(number, email);
			return new AppResponseDto(AppConstants.STATUS_CODE_SUCCESS, AppConstants.STATUS_SUCCESS, registerList, null);
		}
		catch(Exception e) {
			return new AppResponseDto(AppConstants.STATUS_CODE_FAILURE, AppConstants.STATUS_FAILURE, null, e.getLocalizedMessage());
		}
	}
	
	public AppResponseDto getByUserNameAndEmail(String userName, String email) {
		try {
			Register registerList = repository.findByUserNameAndEmail(userName, email);
			return new AppResponseDto(AppConstants.STATUS_CODE_SUCCESS, AppConstants.STATUS_SUCCESS, registerList, null);
		}
		catch(Exception e) {
			return new AppResponseDto(AppConstants.STATUS_CODE_FAILURE, AppConstants.STATUS_FAILURE, null, e.getLocalizedMessage());
		}
	}
	
	public AppResponseDto findAllData() {
		try {
			List<Register> registerList = repository.findAllRegister();
			return new AppResponseDto(AppConstants.STATUS_CODE_SUCCESS, AppConstants.STATUS_SUCCESS, registerList, null);
		}
		catch(Exception e) {
			return new AppResponseDto(AppConstants.STATUS_CODE_FAILURE, AppConstants.STATUS_FAILURE, null, e.getLocalizedMessage());
		}
	}
	
	public AppResponseDto findAlluserName() {
		try {
			List<String> registerList = repository.findAlluserName();
			return new AppResponseDto(AppConstants.STATUS_CODE_SUCCESS, AppConstants.STATUS_SUCCESS, registerList, null);
		}
		catch(Exception e) {
			return new AppResponseDto(AppConstants.STATUS_CODE_FAILURE, AppConstants.STATUS_FAILURE, null, e.getLocalizedMessage());
		}
	}
	
}
