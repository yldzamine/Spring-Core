package com.amine;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SelamApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("spring1.xml");
		Selam selam = (Selam) context.getBean("Selam");
		selam.goster();
		Yazar yazar = context.getBean("Yazar" ,Yazar.class);
		yazar.goster();
		//((AbstractApplicationContext) context).registerShutdownHook();
	}

}
