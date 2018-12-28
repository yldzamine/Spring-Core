package com.amine;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeanConfig.xml");
		
		Calisan calisan = context.getBean("beancalisan",Calisan.class);
		System.out.println("ADI " + calisan.getAdi());
		System.out.println("SOYADI " + calisan.getSoyadi());
		System.out.println("ADRES " + calisan.getAdres().getMahalle());
		System.out.println("ADRES " + calisan.getAdres().getSemt());
		System.out.println("ADRES " + calisan.getAdres().getSehir());
	}

}
