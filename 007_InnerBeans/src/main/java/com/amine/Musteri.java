package com.amine;

public class Musteri {

	private Siparis siparis;
	
	
	public void MUsteri() {
		System.out.println("Müsteri nin boş parametreli yapılandırıcısı");
	}

	public Siparis getSiparis() {
		return siparis;
	}

	public void setSiparis(Siparis siparis) {
		this.siparis = siparis;
	}

	
	public void hesabiode() {
		System.out.println("Sipariş ödeme işlemi gerçekleşmiştir.");
		siparis.toplamsonucual();
	}
}
