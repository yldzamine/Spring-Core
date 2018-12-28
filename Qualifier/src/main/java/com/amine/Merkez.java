package com.amine;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	//	Ogrenci ogrenci = (Ogrenci) context.getBean("beanOgrenci");
		Ders ders =  context.getBean("ders",Ders.class);
		
		System.out.println("Adı :" + ders.getOgrenci().getAdi());
		System.out.println("Soyadı :" + ders.getOgrenci().getSoyadi());
		System.out.println("Yasi :" + ders.getOgrenci().getYasi());	
		System.out.println("Puanı :" +ders.getPuan());
		System.out.println("Dersi :" +ders.getDers());
		
	
	}
	
}
