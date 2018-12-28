package com.amine;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SelamApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Selam selam =context.getBean("selam",Selam.class);
		selam.goster();
				
		((AbstractApplicationContext) context).registerShutdownHook();//destroy ekranda yazdırmak için komuttur.
	}

}
