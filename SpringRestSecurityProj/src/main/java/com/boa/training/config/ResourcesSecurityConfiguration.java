package com.boa.training.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Configure list of urls to be secured.
 * @author CSS
 *
 */
@Configuration
@EnableGlobalAuthentication
public class ResourcesSecurityConfiguration extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/api/**").authenticated()
		//.and().httpBasic();
		.and().formLogin();
	}

}
