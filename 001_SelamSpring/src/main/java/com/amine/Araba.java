package com.amine;

public class Araba {

	public Yakit yakit;
	
	public Araba(Yakit yakit) {
		this.yakit = yakit;
	}
	public void hareketegec() {
		yakit.depo();
		System.out.println("Araba harekete geçti.");
	}
}
