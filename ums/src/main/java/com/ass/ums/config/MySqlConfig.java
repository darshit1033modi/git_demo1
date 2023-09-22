package com.ass.ums.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

//@Profile(value = "developement")
@Configuration
public class MySqlConfig {
	
	public MySqlConfig() {
		System.out.println(this.getClass().getSimpleName());
	}
	
	@Bean(name = "mysql_source")
	public HikariDataSource getDataSource() {
		HikariConfig hikariConfig = new HikariConfig();
		hikariConfig.setDriverClassName("com.mysql.cj.jdbc.Driver");
		hikariConfig.setJdbcUrl("jdbc:mysql://localhost:3306/spring_boot");
		hikariConfig.setUsername("root");
		hikariConfig.setPassword("root@123");
		return new HikariDataSource(hikariConfig);
	}
	
	@Bean(name = "mysql_db")
	public JdbcTemplate getJdbcTemplate() {
		return new JdbcTemplate(getDataSource());
	}

}
