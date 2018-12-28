package com.amine;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeanConfig {

	@Bean
	public Sehir sehir() {
		Sehir sehir = new Sehir();
		sehir.setSehiradi("SİVAS");
		sehir.setPlaka(58);
		return sehir();
	}
	
	@Bean
	public Ogrenci ogrenci() {
		Ogrenci ogrenci = new Ogrenci();
		ogrenci.setSehir(sehir());
		return ogrenci();
	}
}
