package com.amine;

public class Siparis {

	private int tutar;
    //----------------------------
	public int getTutar() {
		return tutar;
	}

	public void setTutar(int tutar) {
		this.tutar = tutar;
	}
	//----------------------------
	public Siparis() {
		System.out.println("Sipariş sınıfının boş parametreli yapılandırıcısı");
	}
	//----------------------------

	public Siparis(int tutar) {
				this.tutar = tutar;
	}
	 //----------------------------
	public void toplamsonucual() {
		System.out.println("Siparişin Toplam Sonucunu Alan Metot");
		System.out.println("Toplam  Tutar:" +getTutar());
	}
}
