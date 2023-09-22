package com.ass.ums.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ass.ums.entity.Register;

public interface RegisterRepository extends JpaRepository<Register, Long> {

	List<Register> findByUserName(String userName);
	
	List<Register> findByEmail(String email);
	
	Register findByContactNumberAndEmail(String number, String email);
	
	Register findByUserNameAndEmail(String userName, String email);
	
	// write the query in the form of sql queries using nativeQuery attribute
	@Query(value = "select * from register_info", nativeQuery = true)
	List<Register> findAllRegister();
	
	@Query(value = "select user_name from register_info", nativeQuery = true)
	List<String> findAlluserName();
}
