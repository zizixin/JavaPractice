package zizixin.JavaPractice.multiThread.ThreadPoolExcute;



import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {

		public static void main(String[] args) {
			ThreadPoolExecutor threadPool = new ThreadPoolExecutor(5, 10, 1000, TimeUnit.NANOSECONDS, new ArrayBlockingQueue<Runnable>(3));
			
			List<String> strings = new ArrayList<>();
			strings.add("String one");
			strings.add("string two");
			
			for(int i=0;i<10;i++){
				threadPool.execute(new CustomerThread(strings, String.valueOf(i)));
			}
			
		}
		
		public static class CustomerThread implements Runnable{

			public CustomerThread(List<String> fromOuter,String threadName){
				this.threadName = threadName;
				this.fromOuter = fromOuter;
			}
			
			public String threadName;
			
			public List<String> fromOuter;
			
			@Override
			public void run() {
				for(String temp:this.fromOuter){
					System.out.println(this.threadName+temp);
				}
				while(true){
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		}
}
