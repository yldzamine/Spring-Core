package com.amine;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Koleksiyonlar {
	public List ogrenciListesi;
	public Set  ogrenciSet;
	public Map  ogrenciMap;
    public Properties ogrenciProperties;
	//------------------------------
	public List getOgrenciListesi() {
		
		return ogrenciListesi;
	}
	public void setOgrenciListesi(List ogrenciListesi) {
		this.ogrenciListesi = ogrenciListesi;
	}
	//------------------------------
	public Set getOgrenciSet() {
	
		return ogrenciSet;
	}
	public void setOgrenciSet(Set ogrenciSet) {
		this.ogrenciSet = ogrenciSet;
	}
	//------------------------------
	public Map getOgrenciMap() {
		
		return ogrenciMap;
	}
	public void setOgrenciMap(Map ogrenciMap) {
		this.ogrenciMap = ogrenciMap;
	}
	//------------------------------
	public Properties getOgrenciProperties() {
		
		return ogrenciProperties;
	}
	public void setOgrenciProperties(Properties ogrenciProperties) {
		this.ogrenciProperties = ogrenciProperties;
	} 
	//------------------------------
	@Override
	public String toString() {
		return "Koleksiyonlar [ogrenciListesi=" + ogrenciListesi + ", ogrenciSet=" + ogrenciSet + ", ogrenciMap="
				+ ogrenciMap + ", ogrenciProperties=" + ogrenciProperties + "]";
	}
	
	
}
