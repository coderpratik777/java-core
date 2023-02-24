
public class Wrapper {
	
	
	public static void main(String[] args) {
		
		
		Integer a=1000;
		Integer b=1000;
		System.out.println(a==b);
		
		Integer x=null;
		System.out.println(x);
		
		System.out.println(Integer.valueOf("2000"));
		
		
		
		//converting string to integer
		int n1=Integer.parseInt("200");
		System.out.println(n1);
		
		//Converting string to Integer
		Integer n2=Integer.valueOf("400");
		System.out.println(n2);
		
		//Converting int to string
		String s=String.valueOf(23);
		System.out.println(s);
		
		//Converting Integer to String
		String s2=Integer.toString(23);
		
		//Converting Double to Integer
		Double d=23.90;
		Integer i3=d.intValue();
		System.out.println(i3);
		
		
		//Converting double to Integer
		double d2=34.99;
		Integer i4=(int)d2;
		System.out.println(i4);
		
		//Converting String to Double 
		Double d3=Double.valueOf("34.55");
		System.out.println(d3);
		
		
		
		//Converting String to double
		
		double d4=d3;
		System.out.println(d4);
		
		
		
		
		
	}
	
	
	
}
