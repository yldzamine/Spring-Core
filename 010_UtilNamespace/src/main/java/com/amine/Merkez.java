package com.amine;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeanConfig.xml");
	
		Sehir sehir = context.getBean("bean3",Sehir.class);
		System.out.println(sehir);
	}

}
