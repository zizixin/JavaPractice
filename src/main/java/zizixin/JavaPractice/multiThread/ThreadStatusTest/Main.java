package zizixin.JavaPractice.multiThread.ThreadStatusTest;

public class Main {

	public static void main(String[] args) {
		Thread one = new Thread(new Runnable() {
			@Override
			public void run() {
				while(true){
					
				}
			}
		});
		
		Thread two = new Thread(new Runnable() {
			@Override
			public void run() {
				while(true){
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		});
		
		Thread three = new Thread(new Runnable(){

			@Override
			public void run() {
				
				
			}});
		
		one.start();
		two.start();
	}
}
