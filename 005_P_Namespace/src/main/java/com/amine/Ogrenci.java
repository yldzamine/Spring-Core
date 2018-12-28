package com.amine;

public class Ogrenci {

	private String adi,soyadi;
	private int numarasi;
	Okul üniversitesi;
	//---------------------------
	public Okul getÜniversitesi() {
		return üniversitesi;
	}
	public void setÜniversitesi(Okul üniversitesi) {
		this.üniversitesi = üniversitesi;
	}
	//---------------------------
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	//---------------------------
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	//---------------------------
	public int getNumarasi() {
		return numarasi;
	}
	public void setNumarasi(int numarasi) {
		this.numarasi = numarasi;
	}
	//---------------------------
}
