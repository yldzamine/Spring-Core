package com.amine;

public class Yazar {

	private Kitap kitap;
	private String adi,soyadi;
	private String kitapadi;
	private String bilgi;
	
	public String getBilgi() {
		return bilgi;
	}
	public void setBilgi(String bilgi) {
		this.bilgi = bilgi;
	}
	//------------------------------- 	
	public Kitap getKitap() {
		return kitap;
	}
	public void setKitap(Kitap kitap) {
		this.kitap = kitap;
	}
	//------------------------------- 
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	//------------------------------- 
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	//------------------------------- 
	public String getKitapadi() {
		return kitapadi;
	}
	public void setKitapadi(String kitapadi) {
		this.kitapadi = kitapadi;
	}
	//------------------------------- 
	@Override
	public String toString() {
		return "Yazar [kitap=" + getKitap().getEseradi() +
				", \nadi=" + getAdi() + ", \nsoyadi=" + getSoyadi() + ", \nkitapadi=" + getKitapadi() + "]";
	}
	
}
