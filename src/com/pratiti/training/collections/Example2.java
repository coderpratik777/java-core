package com.pratiti.training.collections;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Example2 {
	
	public static void main(String[] args) {
		
		Set<String> set1=new HashSet<>();
		set1.add("Pratik");
		set1.add("Pratik1");
		
		set1.forEach(e->System.out.println(e));
		
		
		Set<Person> set2=new HashSet<>();
		
		set2.add(new Person("Pratik",22));
		set2.add(new Person("Sarthak",22));
		
		System.out.println(set2);
		
		
		System.out.println("------------------tree set----------");
		Set<String> set3=new TreeSet<>();
		set3.add("Pratik");
		set3.add("Rohit");
		set3.add("Unmesh");
		set3.add("Ajinky");
		set3.add("Aarti");
		
		System.out.println(set3);
		
		class PersonAgeComparator implements Comparator<Person>{

			@Override
			public int compare(Person p1, Person p2) {
				// TODO Auto-generated method stub
				return p1.getAge()-p2.getAge() ;
			}
			
			
		}
		class PersonNameComparator implements Comparator<Person>{
			public int compare(Person p1,Person p2)
			{
				return p1.getname().compareTo(p2.getname());
				
			}
		}
	     Comparator<Person> n=new Comparator<>() {
			
			public int compare(Person p1,Person p2) {
				int order=p1.getname().compareTo(p2.getname());
				if(order==0)
					order=Integer.compare(p1.getAge(),p2.getAge());
				return order;
					
				
			}
			
		};  
//		
//		Comparator<Person> n1=(p1,p2)-> { int order=p1.getname().compareTo(p2.getname());
//		                                   int x=(int)order ? Integer.compare(p1.getAge(), p2.getAge()):p1.getname().compareTo(p2.getname());};
		
		
		System.out.println("------------------tree set(user defined class)----------");
		Set<Person> set4=new TreeSet<>(n);
		set4.add(new Person("Pratik",22));
		set4.add(new Person("Sarthak",19));
		set4.add(new Person("Unmesh",22));
		set4.add(new Person("Rutvik",23));
		set4.add(new Person("Pratik",23));
		
		System.out.println(set4);
		
	
		
	

}
}
