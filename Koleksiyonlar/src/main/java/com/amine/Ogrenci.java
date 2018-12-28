package com.amine;

import java.util.*;


public class Ogrenci {

	List <?> ogrenciListesi;
	Set <?>  ogrenciSet;
	Map <?,?> ogrenciMap;
	Properties ogrenciProperties;
//----------------------------------------	
	public List<?> getOgrenciListesi() {
		System.out.println("Liste Elemanları" + ogrenciListesi);
		return ogrenciListesi;
	}
	public void setOgrenciListesi(List<?> ogrenciListesi) {
		this.ogrenciListesi = ogrenciListesi;
	}
//----------------------------------------	
	public Set<?> getOgrenciSet() {
		System.out.println("Set Elemanları" + ogrenciSet);
		return ogrenciSet;
	}
	public void setOgrenciSet(Set<?> ogrenciSet) {
		this.ogrenciSet = ogrenciSet;
	}
//----------------------------------------	
	public Map<?, ?> getOgrenciMap() {
		System.out.println("Map Elemanları" + ogrenciMap);
		return ogrenciMap;
	}
	public void setOgrenciMap(Map<?, ?> ogrenciMap) {
		this.ogrenciMap = ogrenciMap;
	}
//----------------------------------------	
	public Properties getOgrenciProperties() {
		System.out.println("Properties Elemanları" + ogrenciProperties);
		return ogrenciProperties;
	}
	public void setOgrenciProperties(Properties ogrenciProperties) {
		this.ogrenciProperties = ogrenciProperties;
	}
//----------------------------------------
}

