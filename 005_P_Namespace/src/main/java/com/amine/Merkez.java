package com.amine;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeanConfig.xml");
		Ogrenci ogrenci = (Ogrenci) context.getBean("ogrenci");
		System.out.println("Öğrecinin Adı :" + ogrenci.getAdi());
		System.out.println("Öğrecinin Adı :" + ogrenci.getSoyadi());
		System.out.println("Öğrecinin Adı :" + ogrenci.getNumarasi());
		System.out.println("Öğrecinin Adı :" + ogrenci.getÜniversitesi().getKurumadi());
	}

}
