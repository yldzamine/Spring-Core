package com.amine7;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext Conapp = new AnnotationConfigApplicationContext();
		Conapp.register(Spring.class);
		
		Conapp.refresh();
		
		Ogrenci ogrenci = Conapp.getBean(Ogrenci.class);
		System.out.println("Şehir Adı :" + ogrenci.getSehir().getSehiradi());
		System.out.println("Şehir Plaka :" + ogrenci.getSehir().getPlaka());
		Conapp.close();
	}

}
