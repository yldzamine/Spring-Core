package com.amine;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class AppCalistir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 BeanFactory beanf = new XmlBeanFactory(new FileSystemResource("SpringBeanConfig.xml"));
	 Araba araba = (Araba) beanf.getBean("araba");
	 araba.hareketegec();
	}

}
