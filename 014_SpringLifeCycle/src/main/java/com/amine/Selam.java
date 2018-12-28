package com.amine;

public class Selam {

	private String mesaj;
	//-----------------------
	public String getMesaj() {
		return mesaj;
	}

	public void setMesaj(String mesaj) {
		this.mesaj = mesaj;
	}
	//-----------------------
	public void goster() {
		System.out.println("BENDEN SELAM OLSUN BOLU BEYİNE");
	}
	
	public void initSelam() {
		System.out.println("Bean Başlatılıyor....");
	}
	
	public void destroySelam() {
		System.out.println("Bean Sonlandırıyor....");
	}
}
