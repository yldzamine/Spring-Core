package com.mimaraslan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mimaraslan.B;

@Configuration
public class BConfig {
	
	@Bean (name="beanB")
	public B yaz() {
		return new B();
	}	
	
//	<bean id="beanB" class="com.mimaraslan.B"/>  
}
