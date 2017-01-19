package com.boa.training.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;

/*@Configuration
@EnableGlobalAuthentication*/
public class InMemorySecurityConfiguration {

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder authManagerBuild) throws Exception {
		authManagerBuild.inMemoryAuthentication().withUser("testuser1").password("testpass1")
		.roles("USER")
		.and().withUser("testuser2").password("testpass2").roles("USER","ADMIN");
	}
}
