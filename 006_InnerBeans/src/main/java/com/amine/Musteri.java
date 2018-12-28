package com.amine;

public class Musteri {
 private Siparis siparis;
//------------------------------
 public Musteri() {
		System.out.println("Müşteri sınıfının paremetresiz yapılandırıcısı");
	}
//------------------------------ 
public Siparis getSiparis() {
	return siparis;
}
//------------------------------
public void setSiparis(Siparis siparis) {
	this.siparis = siparis;
}
//------------------------------
public void hesabiode() {
	System.out.println("Müşteri sınıfındaki hesabı öde metodu");
	siparis.siparisiTopla();
}
}
