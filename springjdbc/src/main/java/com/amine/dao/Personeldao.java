package com.amine.dao;

import com.amine.model.Personel;

public interface Personeldao {

	public void Ekle(Personel personel);
	
	public Personel idAra(int id);
	
	public Personel adiAra(String adi);
	public Personel soyadiAra(String soyadi);
	public Personel tecrubeAra(int tecrube);
	
	
}
