package com.pratiti.training.exam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class LoadData {
	
	
	public void loadData() {
		
		try {
			BufferedReader bufferedReader=new BufferedReader(new FileReader("C:\\Users\\pratiti_user\\Downloads\\Casestudy2\\company-sales.csv",StandardCharsets.US_ASCII));
			String line=bufferedReader.readLine();
			line=bufferedReader.readLine();
			Data d=new Data();
			
			//reading csv file line by line
			while(line!=null) {
				Row r=new Row();
				String[] attributes=line.split(",");
				r.setMon(attributes[0]);
				r.setFaceCream(attributes[1]);
				r.setFaceWash(attributes[2]);
				r.setToothPaste(attributes[3]);
				r.setBathingSoap(attributes[4]);
				r.setShampoo(attributes[5]);
				r.setMoisturizer(attributes[6]);
				r.setTotalUnits(attributes[7]);
				r.setTotalProfit(attributes[8]);
				d.addTheData(r);
				//System.out.println(attributes[0]+" "+attributes[1]+" "+attributes[2]+" ");
				line=bufferedReader.readLine();
			}
			
		}
		catch(IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
