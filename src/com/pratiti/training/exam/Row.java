package com.pratiti.training.exam;

public class Row {
	
	private String  mon;
	private String faceCream;
	private String faceWash;
	private String toothPaste;
	private String bathingSoap;
	private String shampoo;
	private String moisturizer;
	private String totalUnits;
	private String totalProfit;
	
	public Row(String mon, String faceCream, String faceWash, String toothPaste, String bathingSoap, String shampoo,
			String moisturizer, String totalUnits, String totalProfit) {
		super();
		this.mon = mon;
		this.faceCream = faceCream;
		this.faceWash = faceWash;
		this.toothPaste = toothPaste;
		this.bathingSoap = bathingSoap;
		this.shampoo = shampoo;
		this.moisturizer = moisturizer;
		this.totalUnits = totalUnits;
		this.totalProfit = totalProfit;
	}

	//default constructor
	public Row()
	{
		
	}

	public String getMon() {
		return mon;
	}

	public void setMon(String mon) {
		this.mon = mon;
	}

	public String getFaceCream() {
		return faceCream;
	}

	public void setFaceCream(String faceCream) {
		this.faceCream = faceCream;
	}

	public String getFaceWash() {
		return faceWash;
	}

	public void setFaceWash(String faceWash) {
		this.faceWash = faceWash;
	}

	public String getToothPaste() {
		return toothPaste;
	}

	public void setToothPaste(String toothPaste) {
		this.toothPaste = toothPaste;
	}

	public String getBathingSoap() {
		return bathingSoap;
	}

	public void setBathingSoap(String bathingSoap) {
		this.bathingSoap = bathingSoap;
	}

	public String getShampoo() {
		return shampoo;
	}

	public void setShampoo(String shampoo) {
		this.shampoo = shampoo;
	}

	public String getMoisturizer() {
		return moisturizer;
	}

	public void setMoisturizer(String moisturizer) {
		this.moisturizer = moisturizer;
	}

	public String getTotalUnits() {
		return totalUnits;
	}

	public void setTotalUnits(String totalUnits) {
		this.totalUnits = totalUnits;
	}

	public String getTotalProfit() {
		return totalProfit;
	}

	public void setTotalProfit(String totalProfit) {
		this.totalProfit = totalProfit;
	}
	
	
	
	

}
