package com.amine;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(SpringBean.class);
		
		A anesnesi = context.getBean("beana", A.class);
		anesnesi.yaz("BENDEN SELAM OLSUN \n");
		B bnesnesi = context.getBean("beanb", B.class);
		bnesnesi.bastır("BOLU BEYİNE");
	 
		((AbstractApplicationContext) context).registerShutdownHook();
	}

}
