package com.amine;

public class Operatorler {

	//1.İlişkisel Operatorler - Relational
	private boolean nonequalTest;
	private boolean lessThanTest;
	private boolean lessOrThanTest;
	private boolean greatThanTest;
	private boolean greatOrThanTest;
    //------------------------------------
	private boolean equalTest;
	public boolean isEqualTest() {
		return equalTest;
	}
	public void setEqualTest(boolean equalTest) {
		this.equalTest = equalTest;
	}
	//------------------------------------	
	public boolean isNonequalTest() {
		return nonequalTest;
	}
	public void setNonequalTest(boolean nonequalTest) {
		this.nonequalTest = nonequalTest;
	}
	//------------------------------------
	public boolean isLessThanTest() {
		return lessThanTest;
	}
	public void setLessThanTest(boolean lessThanTest) {
		this.lessThanTest = lessThanTest;
	}
	//------------------------------------
	public boolean isLessOrThanTest() {
		return lessOrThanTest;
	}
	public void setLessOrThanTest(boolean lessOrThanTest) {
		this.lessOrThanTest = lessOrThanTest;
	}
	//------------------------------------
	public boolean isGreatThanTest() {
		return greatThanTest;
	}
	public void setGreatThanTest(boolean greatThanTest) {
		this.greatThanTest = greatThanTest;
	}
	//------------------------------------
	public boolean isGreatOrThanTest() {
		return greatOrThanTest;
	}
	public void setGreatOrThanTest(boolean greatOrThanTest) {
		this.greatOrThanTest = greatOrThanTest;
	}
	
	
	//2.Mantıksal Operatorler - Logical
	private boolean andTest;
	private boolean orTest;
	private boolean noTest;
	
	public boolean isAndTest() {
		return andTest;
	}
	public void setAndTest(boolean andTest) {
		this.andTest = andTest;
	}
	//------------------------------------
	public boolean isOrTest() {
		return orTest;
	}
	public void setOrTest(boolean orTest) {
		this.orTest = orTest;
	}
	//------------------------------------
	public boolean isNoTest() {
		return noTest;
	}
	public void setNoTest(boolean noTest) {
		this.noTest = noTest;
	}


	//3.Matematiksel Operatorler - Mathematical
	private double addTest; //toplama
	private String addSTest;
	private double subTest;//çıkarma
	private double mulTest;//çarpma
	private double divTest;//bölme
	private double modTest;//mod alma
	private double expTest;//üstünü alma
	//------------------------------------
	public double getAddTest() {
		return addTest;
	}
	public void setAddTest(double addTest) {
		this.addTest = addTest;
	}
	//------------------------------------
	public String getAddSTest() {
		return addSTest;
	}
	public void setAddSTest(String addSTest) {
		this.addSTest = addSTest;
	}
	//------------------------------------
	public double getSubTest() {
		return subTest;
	}
	public void setSubTest(double subTest) {
		this.subTest = subTest;
	}
	//------------------------------------
	public double getMulTest() {
		return mulTest;
	}
	public void setMulTest(double mulTest) {
		this.mulTest = mulTest;
	}
	//------------------------------------
	public double getDivTest() {
		return divTest;
	}
	public void setDivTest(double divTest) {
		this.divTest = divTest;
	}
	//------------------------------------
	
	public double getModTest() {
		return modTest;
	}
	public void setModTest(double modTest) {
		this.modTest = modTest;
	}
	//------------------------------------
	public double getExpTest() {
		return expTest;
	}
	public void setExpTest(double expTest) {
		this.expTest = expTest;
	}
	
	
	
	
}
