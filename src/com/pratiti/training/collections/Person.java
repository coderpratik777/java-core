package com.pratiti.training.collections;

import java.util.Objects;

public class Person {
	
	private String name;
	private int  age;
	
	public Person()
	{
		
	}
	
	public Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getname()
	{
		return this.name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return this.age;
	}
	
	@Override
	public String toString()//method in object class it returns the 
	{
		return "Person name is "+this.name+" and age is "+this.age;
	}
//Override
//	public boolean equals(Object obj)
//	{
//		Person p=(Person)obj;
//		if(this.name.equals(p.name) && this.age==p.age)
//		{
//			return true;
//		}
//		return false;
//	}
//	

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
	
}
