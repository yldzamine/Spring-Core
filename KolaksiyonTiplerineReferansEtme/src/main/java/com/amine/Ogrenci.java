package com.amine;

public class Ogrenci {

	String adi,soyadi,bolumu;
	int yasi;
//----------------------------------	
	public String getBolumu() {
		return bolumu;
	}
	public void setBolumu(String bolumu) {
		this.bolumu = bolumu;
	}
//----------------------------------		
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
//----------------------------------	
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
//----------------------------------	
	public int getYasi() {
		return yasi;
	}
	public void setYasi(int yasi) {
		this.yasi = yasi;
	}
	@Override
	public String toString() {
		return "Ogrenci [adi=" + adi + ", soyadi=" + soyadi + ", bolumu=" + bolumu + ", yasi=" + yasi + "]";
	}
}
