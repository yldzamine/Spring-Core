package com.amine;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class Cizim {

	public static void main(String[] args) {
		
		Resource resource = new FileSystemResource("SpringBeanConfig.xml");
        XmlBeanFactory xml = new XmlBeanFactory(resource);
        Ucgen ucgen = (Ucgen) xml.getBean("ucgen");
		ucgen.ciz();
	}

}
