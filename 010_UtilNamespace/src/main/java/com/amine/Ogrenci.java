package com.amine;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

public class Ogrenci {

	public List listemiz;
//---------------------------------------
	public List getListemiz() {
		return listemiz;
	}


	public void setListemiz(List listemiz) {
		this.listemiz = listemiz;
	}
	
	@Override
	public String toString() {
		return "Ogrenci [listemiz=" + listemiz + "]";
	}

	
	
}
