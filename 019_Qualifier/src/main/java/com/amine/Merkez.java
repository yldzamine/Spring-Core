package com.amine;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
   
      
        
        Ders ders = context.getBean("ders",Ders.class);
        System.out.println("ADI :" +ders.getOgrenci().getAdi());
        System.out.println("SOYADI :" +ders.getOgrenci().getSoyadi());
        System.out.println("YAŞI :" +ders.getOgrenci().getYasi());
        System.out.println("DERSİ :" +ders.getDers());
        System.out.println("PUANI :" +ders.getPuan());
        
	}

}
