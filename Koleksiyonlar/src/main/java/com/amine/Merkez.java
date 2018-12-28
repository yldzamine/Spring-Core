package com.amine;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Merkez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		 Ogrenci ogrenci = (Ogrenci) context.getBean("beanOgrenci");
		 ogrenci.getOgrenciListesi();
		 ogrenci.getOgrenciMap();
		 ogrenci.getOgrenciProperties();
		 ogrenci.getOgrenciSet();
		 
	}

}
