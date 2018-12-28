package com.amine;

public class Selam {

	private String mesaj,mesaj2;
//--------------------------------------
	public String getMesaj() {
		return mesaj;
	}

	public void setMesaj(String mesaj) {
		this.mesaj = mesaj;
	}
//---------------------------------------
public String getMesaj2() {
		return mesaj2;
	}

	public void setMesaj2(String mesaj2) {
		this.mesaj2 = mesaj2;
	}

//--------------------------------------
	public void goster() {
		System.out.println(getMesaj()+ "\n" +getMesaj2());
	}
//--------------------------------------
	public void destroy() {
		System.out.println("Bean Sonlandırılıyor...");
	}
}
