package com.amine;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("kitapbean")
public class Kitap {
@Value("Savaş Ve Barış")	
 private String eseradi;
@Value("1235KGJBFGKHJ")
 private String eserISBN;
//----------------------------------
public String getEserISBN() {
	return eserISBN;
}
public void setEserISBN(String eserISBN) {
	this.eserISBN = eserISBN;
}
//------------------------------- 
public String getEseradi() {
	return eseradi;
}
public void setEseradi(String eseradi) {
	this.eseradi = eseradi;
}
//------------------------------- 
public String kitapbilgisiniyaz(String yazaradi, String yazarsoyadi, String eseradi, String eserISBN) {
	System.out.println();
	
	this.eseradi = eseradi;
	this.eserISBN = eserISBN;
	return "Yazar Adı Soyadı :" + yazaradi + " " + yazarsoyadi +
			"\n\tEser adı :" + getEseradi() +
			"\n\tEser ISBN :" + getEserISBN();
}
//------------------------------- 
}
