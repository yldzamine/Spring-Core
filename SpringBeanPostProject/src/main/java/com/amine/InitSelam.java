package com.amine;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitSelam implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanAdi) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Başlatmadan Öncesi :" + beanAdi);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanAdi) throws BeansException {
		System.out.println("Başlatmadan Sonrası :" + beanAdi);		
		return bean;
	}

}
