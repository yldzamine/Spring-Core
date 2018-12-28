package com.amine;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amine.musteri.Musteri;

public class Merkez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		ApplicationContext context = new  ClassPathXmlApplicationContext("spring.xml");
		
		Musteri musteri =context.getBean("musteri",Musteri.class);
		
		System.out.println("ADI :" + musteri.getAdi());
		System.out.println("SOYADI :" +musteri.getSoyadi());
		System.out.println("ADRES :" +musteri.getAdres().getAdres());
		
	}

}
