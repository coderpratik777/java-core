
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=234;
		int count1=0;
		int count0=0;
		while(x>0)
		{
			int bit=x%2;
			x=x/2;
			if(bit==0)
				count0++;
			else
				count1++;
		}
		System.out.println("Number of ones are "+count1+" and Number of zeros are "+count0);
		
		int d=234;
		String h=Integer.toBinaryString(d);
		System.out.println(h);
		System.out.println(1+Integer.decode("2344"));
		
		
		
		
		

	}

}
