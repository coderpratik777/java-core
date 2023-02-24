package com.pratiti.training.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.UnaryOperator;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1=new ArrayList<>();
		list1.add("Java");
		list1.add("Oracle");
		list1.add("Python");
		list1.add("Java");
		list1.add("C#");
		
		for(int i=0;i<list1.size();i++) {
			String str=list1.get(i);
			System.out.println(str);
		}
		
		Comparator<String> n=new Comparator() {
			

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				int x=(int)o1.equals(o2);
				return x;
			}
		};
		Collections.sort(list1);
		list1.sort(n);
		
		
		//indexOf
		System.out.println(list1.indexOf("Java"));
		//isEmpty
		System.out.println(list1.isEmpty());
		//add(int index,int element)
		list1.add(5,"C++");
		//addAll()
		System.out.println(list1.indexOf("C++"));
		//contains(int index,Collections<>extends)
		
		System.out.println(list1.remove("Python"));
		
		for(int i=0;i<list1.size();i++) {
			String str=list1.get(i);
			System.out.println(str);
		}
		
		list1.replaceAll(e->e.toLowerCase());
//		
//		UnaryOperator<String> s=new UnaryOperator<String>() {
//			
//			public  String apply(String s)
//			{
//				return s.toLowerCase();
//				
//			}
//		};
//		
//		s.apply("Java");
		
		Object[] arr=list1.toArray();
		for(int i=0;i<arr.length;i++) {
			String str=(String)arr[i];
			System.out.println(str);
		}
		
		
		
		List<String> list2=new ArrayList<>();
		list2.add("k++");
		
		list1.addAll(list2);
		list1.get(list1.size()-1);
		
		
		//for each loop 
		for(String str:list1)
		{
			System.out.println(str);
			if(str=="C++")
			{
				str="c++";
			}
		}
		
		//using lambda expression to iterate over the list1
		list1.forEach(str->System.out.println(str));
		
		
		//using traditional technique iterator api
		
		Iterator<String> itr=list1.iterator();
		while(itr.hasNext()) {
			String str=itr.next();
			System.out.println(str);
		}
		
		
		List<Person> person=new ArrayList<>();
		
		Person person1=new Person("Pratik",22);
		Person person2=new Person("Sarthak",19);
		
		person.add(person1);
		person.add(person2);
		
		person.forEach(p->System.out.println(p));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
