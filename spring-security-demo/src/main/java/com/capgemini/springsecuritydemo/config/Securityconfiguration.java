package com.capgemini.springsecuritydemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;
import org.springframework.security.core.userdetails.User;
@EnableWebSecurity
@Configuration
public class Securityconfiguration extends WebSecurityConfigurerAdapter
{
	@Override
	protected void configure(AuthenticationManagerBuilder auth)throws Exception
	{
		auth
        .inMemoryAuthentication()
            .withUser("Urmi").password("{noop}Urmi").roles("USER").and()
             .withUser("Guest").password("{noop}Guest").roles("USER");
			
	}
	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception
	{
		
			httpSecurity
						.authorizeRequests()
						.anyRequest()
						.fullyAuthenticated()
						.and().httpBasic();
	
			httpSecurity.csrf().disable();
		
	}
	
}
