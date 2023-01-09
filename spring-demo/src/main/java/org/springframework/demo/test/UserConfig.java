package org.springframework.demo.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class UserConfig {


	@Bean("user")
	public User getUser(){
		return new User(22L,"dd",22);
	}
}
