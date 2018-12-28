package com.amine;

public class Personel {

	private String adi,soyadi,telno,adres;
	private int dogumyili,maas;
	boolean ehliyet,medenihal;
	@Override
	public String toString() {
		return "Personel [adi=" + adi + ", soyadi=" + soyadi + ", telno=" + telno + ", adres=" + adres + ", dogumyili="
				+ dogumyili + ", maas=" + maas + ", ehliyet=" + ehliyet + ", medenihal=" + medenihal + "]";
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
	public String getTelno() {
		return telno;
	}
	public void setTelno(String telno) {
		this.telno = telno;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public int getDogumyili() {
		return dogumyili;
	}
	public void setDogumyili(int dogumyili) {
		this.dogumyili = dogumyili;
	}
	public int getMaas() {
		return maas;
	}
	public void setMaas(int maas) {
		this.maas = maas;
	}
	public boolean isEhliyet() {
		return ehliyet;
	}
	public void setEhliyet(boolean ehliyet) {
		this.ehliyet = ehliyet;
	}
	public boolean isMedenihal() {
		return medenihal;
	}
	public void setMedenihal(boolean medenihal) {
		this.medenihal = medenihal;
	}
}
