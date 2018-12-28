package com.amine;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       AnnotationConfigApplicationContext appcontext = new AnnotationConfigApplicationContext();
       appcontext.register(SpringBeanConfig.class);
       appcontext.refresh();
       
       Ogrenci ogrenci = appcontext.getBean(Ogrenci.class);
       
       System.out.println(ogrenci.getSehir().getSehiradi());
       System.out.println(ogrenci.getSehir().getPlaka());
       
       ((ConfigurableApplicationContext) appcontext).close();
	}

}
