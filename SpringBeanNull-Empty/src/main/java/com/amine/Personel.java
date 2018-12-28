package com.amine;

public class Personel {

	String adi,soyadi,telno,adres;
	String anneadi,babaadi;
	int dogumyili,maas;
	boolean ekliyet,medenihali;
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
	public String getAnneadi() {
		return anneadi;
	}
	public void setAnneadi(String anneadi) {
		this.anneadi = anneadi;
	}
	public String getBabaadi() {
		return babaadi;
	}
	public void setBabaadi(String babaadi) {
		this.babaadi = babaadi;
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
	public boolean isEkliyet() {
		return ekliyet;
	}
	public void setEkliyet(boolean ekliyet) {
		this.ekliyet = ekliyet;
	}
	public boolean isMedenihali() {
		return medenihali;
	}
	public void setMedenihali(boolean medenihali) {
		this.medenihali = medenihali;
	}
	@Override
	public String toString() {
		return "Personel [adi=" + adi + ", soyadi=" + soyadi + ", telno=" + telno + ", adres=" + adres + ", anneadi="
				+ anneadi + ", babaadi=" + babaadi + ", dogumyili=" + dogumyili + ", maas=" + maas + ", ekliyet="
				+ ekliyet + ", medenihali=" + medenihali + "]";
	}
}
