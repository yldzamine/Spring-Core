package com.amine;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
   
        Ogrenci ogrenci = context.getBean("ogrenci",Ogrenci.class);
        System.out.println("ADI :" +ogrenci.getAdi());
        System.out.println("SOYADI :" +ogrenci.getSoyadi());
        System.out.println("YAŞI :" +ogrenci.getYasi());
	}

}
