package com.amine7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Spring {

	@Bean
	public Sehir sehir() {
		Sehir sehir = new Sehir();
		sehir.setSehiradi("Manisa");
		sehir.setPlaka(45);
		return sehir;
	}
	
	@Bean
	public Ogrenci ogrenci() {
		Ogrenci ogrenci =new Ogrenci();
		ogrenci.setSehir(sehir());
		return ogrenci;
	}
	
	/*Spring dosyasında bean tanımlaması burada dursun ki üsteki aynı tanımlama
	 *yı yapan java kodlarıyla karşılaştırabileyim.
	 <bean id="sehir" class="com.amine7.Sehir">
		<property name="sehiradi" value="Ankara"></property>
		<property name="plaka" value="45"></property>
	</bean>
	 */
}
