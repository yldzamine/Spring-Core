package com.amine.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amine.A;


@Configuration
public class Aconfig {

	@Bean(name="beana")
	public A yaz() {
		return new A();
	}
	
	
}
