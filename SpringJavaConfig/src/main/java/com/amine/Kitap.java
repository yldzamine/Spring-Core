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

//------------------------------- 
}
