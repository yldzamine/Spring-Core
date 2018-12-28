package com.amine;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		ConfigurableApplicationContext appctx = new ClassPathXmlApplicationContext("spring.xml");
		appctx.start(); //Ayağa kaldırılıyor...
		
		Sozler sozler =appctx.getBean("sozler",Sozler.class);
		sozler.yaz();
		
		CustomOlayYayinlayicisi customolayyayinlayicisi =
	    appctx.getBean("customoy" ,CustomOlayYayinlayicisi.class);
		
		customolayyayinlayicisi.yayinla();
		
		appctx.stop();
		appctx.close();
		

	}

}
