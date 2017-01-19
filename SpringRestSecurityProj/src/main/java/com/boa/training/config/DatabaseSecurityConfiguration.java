package com.boa.training.config;

import java.sql.ResultSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
@EnableGlobalAuthentication
public class DatabaseSecurityConfiguration extends GlobalAuthenticationConfigurerAdapter {

	@Autowired
	private UserDetailsService userDetailsService;
	
	@Bean
	public UserDetailsService userDetailsService(JdbcTemplate jdbcTemplate)
	{
		RowMapper<User> rowMapper=(ResultSet rs,int i)->{
			return new User(rs.getString("ACCOUNT_NAME"), 
					rs.getString("PASSWORD"),
					rs.getBoolean("ENABLED"), rs.getBoolean("ENABLED"), rs.getBoolean("ENABLED"),rs.getBoolean("ENABLED"), 
					AuthorityUtils.createAuthorityList("ROLE_USER","ROLE_ADMIN"));
		};
		return username->jdbcTemplate.queryForObject("select * from ACCOUNT where ACCOUNT_NAME=?", rowMapper,username);
	}
	
	
	@Override
	public void init(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		auth.userDetailsService(userDetailsService);
	}
	
	
	
}