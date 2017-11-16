package zizixin.JavaPractice.multiThread.ThreadNumberTest;

public class ThreadNumberMainTest {

	public static int count = 0;
	
	public static void main(String[] args) {
		
	    Object lockObj = new Object();
		
	    while(true){
	    	new Thread(new Runnable() {
				
				@Override
				public void run() {
						
						synchronized (lockObj) {
							count++;
							System.out.println(count);
						
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
			}).start();
	    }
	}
}
