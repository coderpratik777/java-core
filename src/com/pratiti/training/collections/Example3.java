package com.pratiti.training.collections;

import java.util.HashMap;
import java.util.Map;

public class Example3 {
	public static void main(String[] args) {
		Map<Long,Person> map=new HashMap<>();
		map.put(12333454545L, new Person("Pratik",23));
		map.put(12333454546L, new Person("mahi",23));
		map.put(12333454547L, new Person("sarthak",23));
		map.putIfAbsent(12333454545L, new Person("Sarthak",23));//put the entry if there is no entry for specific id
		
		Person p=map.get(12333454545L);
		
		
		for(Map.Entry<Long, Person> entry: map.entrySet())
		{
			Long aadhar=entry.getKey();
			Person person=entry.getValue();
			System.out.println("Aadhar number : "+aadhar+" "+person);
		}
		
		map.remove(12333454545L);

		for(Map.Entry<Long, Person> entry: map.entrySet())
		{
			Long aadhar=entry.getKey();
			Person person=entry.getValue();
			System.out.println("Aadhar number : "+aadhar+" "+person);
		}
//		map.forEach((key,value)->System.out.println(map));
	}

}
