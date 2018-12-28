package com.amine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("yazarbean")
public class Yazar {

	
	
	private Kitap kitap;
	
	@Value(value="Mimar")
	private String adi;
	
	@Value(value="Aslan")
	private String soyadi;
	
	@Value("#{kitapbean.eseradi}")
	private String kitapadi;
	//------------------------------- 	
	public Kitap getKitap() {
		return kitap;
	}
	public void setKitap(Kitap kitap) {
		this.kitap = kitap;
	}
	//------------------------------- 
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	//------------------------------- 
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	//------------------------------- 
	public String getKitapadi() {
		return kitapadi;
	}
	public void setKitapadi(String kitapadi) {
		this.kitapadi = kitapadi;
	}
	//------------------------------- 
	@Value("#{kitapbeanbean.kitapbilgisiniyaz('Fyodor','Dostoyeviski','Budala','3874VKJHVBJV')}")
	private String bilgi;
	public String getBilgi() {
		return bilgi;
	}
	public void setBilgi(String bilgi) {
		this.bilgi = bilgi;
	}
	@Override
	public String toString() {
		return "Yazar [kitap=" + getKitap().getEseradi() +
				", \nadi=" + getAdi() + ", \nsoyadi=" + getSoyadi() + ", \nkitapadi=" + getKitapadi() + "]";
	}
	
}
