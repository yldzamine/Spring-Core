package com.amine.matematik;

import org.springframework.stereotype.Component;

@Component("islemBeanComponent")
public class İslem {

	
	public int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	
	public int cikar(int sayi1, int sayi2) {
		return sayi1 - sayi2;
	}
	
	public int carp(int sayi1, int sayi2) {
		return sayi1 * sayi2;
	}
	
	public int bol(int sayi1, int sayi2) {
		return sayi1 / sayi2;
	}
}
