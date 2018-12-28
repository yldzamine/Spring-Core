package com.amine.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amine.B;

@Configuration
public class Bconfig {

	@Bean(name="beanb")
	public B bastır() {
		return new B();
	}
}
