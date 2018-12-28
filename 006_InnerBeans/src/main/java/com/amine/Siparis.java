package com.amine;

public class Siparis {

	int tutar;
//------------------------------
public int getTutar() {
		return tutar;
	}
//------------------------------
	public void setTutar(int tutar) {
		this.tutar = tutar;
	}
//------------------------------
	public Siparis() {
		
		System.out.println("Sipariş sınıfının bo parametreli yapıandırıcısı");
	}
//------------------------------	
	public Siparis(int tutar) {
		super();
		this.tutar = tutar;
	}
//------------------------------	
	public void siparisiTopla() {
		System.out.println("Sipariş sınıfındaki toplam sipariş sonucu");
		System.out.println("Toplam sipariş" + getTutar());
	}
	
}
