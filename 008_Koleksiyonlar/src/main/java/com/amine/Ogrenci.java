package com.amine;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;





public class Ogrenci {

	public List ogrenciListesi;
	public Set  ogrenciSet;
	public Map  ogrenciMap;
    public Properties ogrenciProperties;
	//------------------------------
	public List getOgrenciListesi() {
		System.out.println("Liste elemanları" + ogrenciListesi);
		return ogrenciListesi;
	}
	public void setOgrenciListesi(List ogrenciListesi) {
		this.ogrenciListesi = ogrenciListesi;
	}
	//------------------------------
	public Set getOgrenciSet() {
		System.out.println("Set elemanları" + ogrenciSet);
		return ogrenciSet;
	}
	public void setOgrenciSet(Set ogrenciSet) {
		this.ogrenciSet = ogrenciSet;
	}
	//------------------------------
	public Map getOgrenciMap() {
		System.out.println("Map elemanları" + ogrenciMap);
		return ogrenciMap;
	}
	public void setOgrenciMap(Map ogrenciMap) {
		this.ogrenciMap = ogrenciMap;
	}
	//------------------------------
	public Properties getOgrenciProperties() {
		System.out.println("Properties elemanları" + ogrenciProperties);
		return ogrenciProperties;
	}
	public void setOgrenciProperties(Properties ogrenciProperties) {
		this.ogrenciProperties = ogrenciProperties;
	} 
	//------------------------------
	
	
}
