package com.amine;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SelamApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		 Selam selam =  context.getBean("selam",Selam.class);
		
		 selam.setMesaj("Benden Selam Olsun Bolu Beyine");
		 selam.goster();
		 
		 Selam selam1 =  context.getBean("selam",Selam.class);
		 selam1.setMesaj("Karadır kaşların ferman yazdırır.");
		selam1.goster();
		
		selam.goster();
		
		System.out.println(context.getBean("selam",Selam.class));
		System.out.println(context.getBean("selam",Selam.class));
	}
	

}
