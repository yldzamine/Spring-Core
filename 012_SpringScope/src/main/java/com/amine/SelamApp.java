package com.amine;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SelamApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Selam selam =context.getBean("selam",Selam.class);
		selam.goster();
		
		Selam selam1 =context.getBean("selam",Selam.class);
		selam1.goster();
	}

}
