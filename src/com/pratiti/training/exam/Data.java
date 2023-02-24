package com.pratiti.training.exam;

import java.util.ArrayList;
import java.util.List;

public class Data {
	
	public static List<Row> dataActual=new ArrayList<>();
	
	public void addTheData(Row r) {
		dataActual.add(r);
	}
	public List<Row> getTheData() {
		
		return dataActual;
	}

}
