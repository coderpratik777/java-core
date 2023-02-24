import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class TimeAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		     Date date=new Date();
		     DateFormat df=new SimpleDateFormat("HH:MM:SS");
		     df.setTimeZone(TimeZone.getTimeZone("America/New_york"));
		     System.out.println("Date time in newyork "+df.format(date));
		     
		     LocalDate localdate=LocalDate.of(2001, 05,28 );
		     DayOfWeek dayOfWeek=localdate.getDayOfWeek();
		     System.out.println("Day of the week"+dayOfWeek);
		     
		     SimpleDateFormat formatter=new SimpleDateFormat("yyyy/MM/dd");
		     String strDate=formatter.format(date);
		     System.out.println(strDate);
		     
		     
		     
		     
		     
		     
		     
	}

}
