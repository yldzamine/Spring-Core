package com.amine;

public class Ucgen {

	private String cesit;
	private int yukseklik;
    //---------------------------
	
	public int getYukseklik() {
		return yukseklik;
	}

	public void setYukseklik(int yukseklik) {
		this.yukseklik = yukseklik;
	}

	public Ucgen(String cesit) {
		super();
		this.cesit = cesit;
	}
	
	public String getCesit() {
		return cesit;
	}
	
	public void setCesit(String cesit) {
		this.cesit = cesit;
	}
	//---------------------------
	public void ciz() {
		System.out.println(getYukseklik()+"birim \n" +getCesit() + "Üçgen Çiz");
	}

	public Ucgen(String cesit, int yukseklik) {
		super();
		this.cesit = cesit;
		this.yukseklik = yukseklik;
	}
	
			
	
}
