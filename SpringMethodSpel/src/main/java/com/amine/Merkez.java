package com.amine;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 @SuppressWarnings("resource")
ApplicationContext apcon = new ClassPathXmlApplicationContext("spring.xml");
 
 Yazar yazar = apcon.getBean("yazarbean", Yazar.class);

 System.out.println(yazar);
 
 System.out.println(yazar.getBilgi()); 
  
 
	}

}
