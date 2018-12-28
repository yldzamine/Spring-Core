package com.amine;

public class Yazar {

	private Kitap kitap;
	public Kitap getKitap() {
		return kitap;
	}
	public void setKitap(Kitap kitap) {
		this.kitap = kitap;
	}
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
	public String getKitapadi() {
		return kitapadi;
	}
	public void setkitapadi(String kitapadi) {
		kitapadi = kitapadi;
	}
	String adi,soyadi,kitapadi;
	@Override
	public String toString() {
		return "Yazar [kitap=" + getKitap() + ", adi=" +getAdi() + ", soyadi=" + getSoyadi() + ", Kitapadi=" + getKitapadi() + "]";
	}
	
}
