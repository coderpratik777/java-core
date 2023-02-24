
public class StringDemo {
	
	public static void main(String[] args) {
//		
//		String s1="Java";
//		String s2="Java";
//		
//		String s3=new String("Java");
//		String s4=new String("Java");
//		
//		System.out.println(s1==s2);
//		System.out.println(s3==s4);
//		
//		String s5="Hello";
//		String s6="World";
//		String s7="HelloWorld";
//		String s8=(s5+s6).intern();
//		
//		System.out.println(s8==s7);
		
		String str1=new String("Hello");
		String str2=new String("Hello");
		
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		String s=new String("Pratik");
		s.concat("Pawar");
		s=s.concat("Pune");
		System.out.println(s);
//		
	
		
		
	}

}
