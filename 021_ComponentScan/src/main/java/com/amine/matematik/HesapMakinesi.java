package com.amine.matematik;

import org.springframework.beans.factory.annotation.Autowired;

public class HesapMakinesi {

	@Autowired
	public İslem islem;
    //------------------------------
	public İslem getIslem() {
		return islem;
	}

	public void setIslem(İslem islem) {
		this.islem = islem;
	}
	
	public void sonuc(int sayi1, int sayi2) {
		System.out.println("topla :" +islem.topla(sayi1, sayi2));
		System.out.println("cıkar :" +islem.cikar(sayi1, sayi2));
		System.out.println("çarp :" +islem.carp(sayi1, sayi2));
		System.out.println("böl:" +islem.bol(sayi1, sayi2));
	}
}
