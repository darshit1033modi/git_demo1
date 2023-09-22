package com.ass.ums.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
//@Profile(value = "integration")
@Qualifier("oracle_config")
public class OracleConfig {
	
	public OracleConfig() {
		System.out.println(this.getClass().getSimpleName());
	}
	
	@Bean(name = "oracle_source")
	@Primary
	public HikariDataSource getDataSource() {
		HikariConfig hikariConfig = new HikariConfig();
		hikariConfig.setDriverClassName("com.mysql.cj.jdbc.Driver");
		hikariConfig.setJdbcUrl("jdbc:mysql://localhost:3306/spring_boot");
		hikariConfig.setUsername("root");
		hikariConfig.setPassword("root@123");
		return new HikariDataSource(hikariConfig);
	}
	
	@Bean(name = "client_db")
	public JdbcTemplate getJdbcTemplate() {
		return new JdbcTemplate(getDataSource());
	}
}
