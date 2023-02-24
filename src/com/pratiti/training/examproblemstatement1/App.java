package com.pratiti.training.examproblemstatement1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

enum Month{
	JANUARY,
	FEBRUARY,
	MARCH,
	APRIL,
	MAY,
	JUNE,
	JULY,
	AUGUST,
	SEPTEMBER,
	OCTOBER,
	NOVEMBER,
	DECEMBER;
	
}

public class App {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		LoadData ld=new LoadData();
		ld.loadData();
		Data d=new Data();
		List<Row> data=d.getTheData();
		
		
		
		System.out.println("----Display total profit made from the sales for the whole year-----");
		int totalSum=0;
		for(Row it:data) {
			String s=it.getTotalProfit();
			int temp=Integer.parseInt(s);
			totalSum+=temp;
		}
		System.out.println("Total profit for Whole year is: "+totalSum);
		
		System.out.println("----Display the month in which there was lowest profit made from the sales:----");
		
		int lowestSales=Integer.MAX_VALUE;
		String month=null;
		for(Row it:data)
		{
			if(Integer.parseInt(it.getTotalProfit())<lowestSales)
			{
				lowestSales=Integer.parseInt(it.getTotalProfit());
				month=it.getMon();
			}
		}
		int indexMon=Integer.parseInt(month);
		Month s=Month.values()[indexMon-1];
		System.out.println("Month is :"+s);
		
		
		
		System.out.println("----Display which product was bought the most in a particular month---");
		System.out.println("Enter the Month:");
		String getMonth=sc.nextLine();
		int index=Integer.parseInt(getMonth);
		Row getProduct=data.get(index-1);
		
		Map<Integer,String> listProduct=new HashMap<>();
		listProduct.put(Integer.parseInt(getProduct.getFaceCream()),"Facecream");
		listProduct.put(Integer.parseInt(getProduct.getFaceWash()),"FaceWash");
		listProduct.put(Integer.parseInt(getProduct.getToothPaste()),"Toothpaste");
		listProduct.put(Integer.parseInt(getProduct.getBathingSoap()),"bathingsoap");
		listProduct.put(Integer.parseInt(getProduct.getShampoo()),"Shampoo");
		listProduct.put(Integer.parseInt(getProduct.getMoisturizer()),"Moisturizer");
		
		Set<Integer> x=new HashSet<Integer>(listProduct.keySet());
		List<Integer> myList=new ArrayList<>(x);
		Collections.sort(myList,Collections.reverseOrder());
		
		System.out.println("The product which was bought most in the month "+getMonth+" is "+listProduct.get(myList.get(0)));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
