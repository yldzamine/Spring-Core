package com.amine.matematik;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("hesap")
public class HesapMakinesi {

	@Autowired
	public İslem islem; //enjekte et.
//------------------------------------
	public İslem getIslem() {
		return islem;
	}

	public void setIslem(İslem islem) {
		this.islem = islem;
	}
	
	public void sonuc(int sayi1, int sayi2) {
		System.out.println("TOPLA :" +islem.topla(sayi1, sayi2));
		System.out.println("ÇIKAR :" +islem.cikar(sayi1, sayi2));
		System.out.println("ÇARP :"  +islem.carp(sayi1, sayi2));
		System.out.println("BÖL :"   +islem.bol(sayi1, sayi2));
	}
}
