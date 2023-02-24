import java.math.BigInteger;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BigInteger b1;
		
		b1=new BigInteger("9999999999999999999999909");
		System.out.println(b1);
		
		BigInteger fac=new BigInteger("1");
		
		for(int i=2;i<=51;i++)
		{
			fac=fac.multiply(BigInteger.valueOf(i));
		}
		System.out.println(fac);
		
		
		BigInteger b2=new BigInteger("99999999999999999999999090900909000000000009");
		BigInteger b3=new BigInteger("3449995959");
		
		System.out.println(b3.add(b2));

	}

}
