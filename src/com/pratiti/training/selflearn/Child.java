package com.pratiti.training.selflearn;

class Singleton {
	//Singleton classes in java
	private static Singleton instance=null;
	public int x;
	
	private Singleton()
	{
		
	}
	public static Singleton CreateInstance()
	{
		if (instance==null)
			instance=new Singleton();
		return instance;
	}

}
public class Child{
	
	public static void main(String[] args) {
		
		Singleton n=Singleton.CreateInstance();
		Singleton n2=Singleton.CreateInstance();
		
		n.x=10;
		n2.x=30;
		System.out.println(n.x);
	
	}
}
