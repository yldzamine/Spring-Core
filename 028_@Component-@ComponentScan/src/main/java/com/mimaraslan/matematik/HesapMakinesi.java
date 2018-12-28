package com.mimaraslan.matematik;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("hesapMakinesiBeanComponent")
public class HesapMakinesi {

	private Islem islem;  //enjekte et, zerk et

	public Islem getIslem() {
		return islem;
	}
	
	@Autowired
	public void setIslem(Islem islem) {
		this.islem = islem;
	}
	
	public void sonuclariGetirYaz(int sayi1, int sayi2) {
		System.out.println("TOPLA   : " + islem.topla(sayi1, sayi2));
		System.out.println("ÇIKAR   : " + islem.cikar(sayi1, sayi2));
		System.out.println("BÖL     : " + islem.bol(sayi1, sayi2));
		System.out.println("ÇARP    : " + islem.carp(sayi1, sayi2));		
	}
	
	
	

}
