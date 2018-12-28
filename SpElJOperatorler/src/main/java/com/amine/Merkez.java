package com.amine;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 @SuppressWarnings("resource")
   ApplicationContext apcon = new ClassPathXmlApplicationContext("spring.xml");
  
   Operatorler operator = apcon.getBean("OperatorlerBean", Operatorler.class);
   System.out.println(operator.isEqualTest());
   
	
	}

}
