import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("hello "+args[0]);
		//loops and conditions in java
		
		for(int i=0;i<10;i++)
		{
			System.out.print(i+" ");
		}
		int j=0;
		System.out.println("While loop in java:");
		while(j<=5)
		{
			System.out.println(j);
			j++;
		}
		System.out.println("do while loop in java:");
		int k=0;
		do {
			System.out.println(k);
			k++;
		}while(k<=5);
		
		System.out.println("Hello world !");
		Date d=new Date();
		System.out.println(d);
		
		LocalDate l =LocalDate.now();
		System.out.println(l);
		
		LocalTime t = LocalTime.now();
		System.out.println(t);
		
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		
		if(t.getHour()>=5 && t.getHour()<12)
		{
			System.out.println("Good Morning");
		}
		else if (t.getHour()>=12 && t.getHour()<16)
		{
			System.out.println("Good Afternnoon");
		}
		else
		{
			System.out.println("godd night");
		}
		
		DayOfWeek day=l.getDayOfWeek();
		switch(day)
		{
		case MONDAY:
			System.out.println("it is monday");
			break;
		case WEDNESDAY:
			System.out.println("it is wednesday");
			break;
			default :
				System.out.println("i am deafult");
		}
		
		System.out.println("Arrays in java");
		int[] arr=new int[10];
		for(int i=0;i<10;i++)
		{
			arr[i]=i+1;
		}
		for(int it:arr)
		{
			System.out.println(it);
		}
		
		int a=10;
		
		float x = 12.5f;
		long y=49059409504504509L;
		
		char v='A';
		char v3=65;
		char v4='\u0905';
		
		System.out.println(v4);
		System.out.println(v3);
		
		String str="Abc";
		System.out.println(str);
		
		
		
		
		
		

	}

}
