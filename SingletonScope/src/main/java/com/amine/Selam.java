package com.amine;

public class Selam {

	private String Mesaj;

	public String getMesaj() {
		return Mesaj;
	}

	public void setMesaj(String mesaj) {
		Mesaj = mesaj;
	}
	
	public void goster() {
		System.out.println("Mesaj" + getMesaj());
	}
}
