package zizixin.JavaPractice.getPlace;

import java.util.Timer;
import java.util.TimerTask;

public class JavaTimesTest {

	
	public static Integer timerTestFiled = 0;
	
	public static void main(String[] args) {
		
		
		final Integer timerTestVar = 0;
		
		Timer timeTestOne = new Timer();
		
		Timer timeTestTwo = new Timer();
		
		TimerTask timeTask = new TimerTask(){

			@Override
			public void run() {
				
				JavaTimesTest.timerTestFiled++;
				
				System.out.println(Thread.currentThread().getName()+" | "+timerTestFiled);
			}
			
		};
		
		TimerTask timeTask2 = new TimerTask(){

			@Override
			public void run() {
				
				JavaTimesTest.timerTestFiled++;
				
				System.out.println(Thread.currentThread().getName()+" | "+timerTestFiled);
			}
			
		};
		
		timeTestOne.schedule(timeTask,0,1*1000);
		timeTestTwo.schedule(timeTask2,0,1*1000);
	}
}
