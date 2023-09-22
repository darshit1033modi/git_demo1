package com.ass.ums.service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Service;
import com.ass.ums.entity.Register;

@Service
public class MySqlServiceImpl implements MySqlService {

	@Autowired
	@Qualifier("client_db")
	private JdbcTemplate jdbcTemplate;
	
	public static final String REGISTER_SELECT_QUERY = "select * from register_info";
	
	public static final String REGISTER_SELECT_QUERY1 = "select id, name from register_info";
	
	@Override
	public List<Register> getAll() {
		MapSqlParameterSource map = new MapSqlParameterSource();
		map.addValue("id", 123);
		map.addValue("user_name", "modi");
		
		List<Map<String, Object>> mapList = jdbcTemplate.queryForList(REGISTER_SELECT_QUERY);
		List<Register> collect = mapList.stream().map((e) -> {
			Register register = new Register();
			register.setAltKey(Long.parseLong(String.valueOf(e.get("id"))));
			register.setContactNumber(String.valueOf(e.get("contact_number")));
			register.setCountry(String.valueOf(e.get("country")));
			register.setEmail(String.valueOf(e.get("email")));
			register.setPassword(String.valueOf(e.get("password")));
			register.setUserName(String.valueOf(e.get("user_name")));
			return register;
		}).collect(Collectors.toList());
		return collect;
	}
}
