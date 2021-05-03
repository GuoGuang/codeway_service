package com.madao.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author GuoGuang
 * @公众号 码道人生
 * @gitHub https://github.com/GuoGuang
 * @website https://madaoo.com
 * @created 2019-09-29 7:37
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	/**
	 * actuator、key禁止访问
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http.authorizeRequests()
				.antMatchers("/actuator/**").authenticated()
				.antMatchers("/key/**").authenticated()
				.antMatchers("/decrypt").authenticated()
				.anyRequest().permitAll();
	}
	  /*  @Override
	    public void configure(WebSecurity web){
	        web.ignoring().antMatchers("/actuator/**");
	    }*/
}
