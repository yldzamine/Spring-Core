package com.amine;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Koleksiyonlar {

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
	@Override
	public String toString() {
		return "ogrenciListesi=" + ogrenciListesi +
			  "\n ogrenciSet=" + ogrenciSet + 
			  "\n ogrenciMap="	 + ogrenciMap +
			  "\n ogrenciProperties=" + ogrenciProperties ;
	}
}
