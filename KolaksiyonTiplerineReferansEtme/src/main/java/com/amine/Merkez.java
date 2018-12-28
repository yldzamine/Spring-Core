package com.amine;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {
	public static void main(String args[]) {
	 ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	 Koleksiyonlar koleksiyonlar = (Koleksiyonlar) context.getBean("BeanKoleksiyonlar");
	 
	 System.out.println(koleksiyonlar);
}
}