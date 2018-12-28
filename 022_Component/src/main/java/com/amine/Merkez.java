package com.amine;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amine.matematik.HesapMakinesi;

public class Merkez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		HesapMakinesi hm = context.getBean("hesap",HesapMakinesi.class);
		hm.sonuc(15, 3);
	}
	

}
