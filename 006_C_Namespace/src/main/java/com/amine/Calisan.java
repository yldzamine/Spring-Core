package com.amine;

public class Calisan {

	private String adi,soyadi;
	private Adres adres;
	 //-------------------------------------	
	  public Calisan(String adi, String soyadi, Adres adres) {
		this.adi = adi;
		this.soyadi = soyadi;
		this.adres = adres;
	}
	//-------------------------------------
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	  //-------------------------------------
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	  //-------------------------------------
	public Adres getAdres() {
		return adres;
	}
	public void setAdres(Adres adres) {
		this.adres = adres;
	}
}
