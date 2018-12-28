package com.amine;

public class Yazar {
 private String mesaj,mesaj2,mesaj3;

public String getMesaj() {
	return mesaj;
}

public void setMesaj(String mesaj) {
	this.mesaj = mesaj;
}
//-----------------------------------
public String getMesaj2() {
	return mesaj2;
}

public void setMesaj2(String mesaj2) {
	this.mesaj2 = mesaj2;
}
//-------------------------------------
public String getMesaj3() {
	return mesaj3;
}

public void setMesaj3(String mesaj3) {
	this.mesaj3 = mesaj3;
}

public void goster() {
	System.out.println(getMesaj()+ "\n" +getMesaj2()+ "\n" +getMesaj3());
}
}
