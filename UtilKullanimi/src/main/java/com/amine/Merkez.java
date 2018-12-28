package com.amine;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Merkez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext context = new ClassPathXmlApplicationContext("spring1.xml");
       //  Personel personel = (Personel) context.getBean("beanPersonel");
         
         //System.out.println(personel);
		// Sehir sehir = (Sehir) context.getBean("beanSehir");
		 //System.out.println(sehir);
		 Calisan calisan = (Calisan) context.getBean("beanCalisan");
		 System.out.println(calisan);
	}

}
