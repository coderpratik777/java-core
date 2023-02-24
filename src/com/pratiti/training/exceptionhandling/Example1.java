package com.pratiti.training.exceptionhandling;

public class Example1 {
	
	public static void main(String[] args) {
		
		int[] arr=new int[10];
		//arr[15]=100;
//		
//		String str=null;
//		str.toUpperCase();
//		System.out.println(str);
//		
//		int a=5/0;
		
		try {
			
			arr[15]=300;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("an Exception");
		}
		
		
	}

}
