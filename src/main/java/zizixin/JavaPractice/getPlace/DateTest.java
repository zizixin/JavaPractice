package zizixin.JavaPractice.getPlace;

import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) throws InterruptedException {
		
		Date begainDate = new Date();
		
		Thread.sleep(1000);
		
		Date endDate = new Date();
		
		System.out.println(begainDate.toString());
		
		System.out.println(endDate.toString());
		
		System.out.println("---------------------------------------------");
		
		useCalenderInit();
	}
	
	public static  void useCalenderInit(){
		
		Calendar calendar = Calendar.getInstance();
	    calendar.setTime(new Date());
	    calendar.set(Calendar.HOUR_OF_DAY, 0);
	    calendar.set(Calendar.MINUTE, 0);
	    calendar.set(Calendar.SECOND, 0);
	     
	    Date start = calendar.getTime();
	 
	    calendar.add(Calendar.DAY_OF_MONTH, 1);
	    calendar.add(Calendar.SECOND, -1);
	     
	    Date end = calendar.getTime();
	 
	    System.out.println(start);
	    System.out.println(end);
	}
}
