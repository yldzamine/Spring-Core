package com.amine.musteri;

public class Musteri {

	public Musteri() {
		System.out.println("Musteri Sınıfı");
	}
	String adi,soyadi;
	Adres adres;
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	public Adres getAdres() {
		return adres;
	}
	public void setAdres(Adres adres) {
		this.adres = adres;
	}
}
