package com.pratiti.training.selflearn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class SortNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Humko Bola numbers diye hai usko sort karo ....par par by middle number.. hum bole ok..");
		List<Integer> numbers=new ArrayList<>();
		numbers.add(234);
		numbers.add(416);
		numbers.add(776);
		Map<Integer,Integer> middleNumbers=new HashMap<>();
		Iterator<Integer> itr=numbers.iterator();
		while(itr.hasNext())
		{
			int x=itr.next();
			int ele=x/10;
			ele=ele%10;
			middleNumbers.put(ele, x); 
		}
		
		List<Integer> sorted=new ArrayList<>(middleNumbers.keySet());
		Collections.sort(sorted);
		List<Integer> ans=new ArrayList<>();
		for (Integer it:sorted)
		{
			ans.add(middleNumbers.get(it));
		}
		Iterator<Integer> itr1=ans.iterator();
		System.out.println("Sorted numbers be like Lo hum aa chuke sanam...");
		while(itr1.hasNext())
		{
			
			System.out.println(itr1.next());
		}
		
		
		
		

	}

}
