package zizixin.JavaPractice.multiThread.concurrency.simpleExample;


public class NumberAdd {

		public int value = 0;
	
		public Integer valuePlusPlus() throws InterruptedException{
			Thread.sleep(1000);
			return value++;
		}
}
