package zizixin.JavaPractice.multiThread.concurrency.simpleExample;

public class NumberAddMain {
	
	public static void main(String[] args) {
		
		NumberAdd numberAdd = new NumberAdd();
		
		new Thread(new Runnable() {
			
			Integer number = 10;
			
			@Override
			public void run() {
				while(number>0){
					number --;
					try {
						System.out.println(numberAdd.valuePlusPlus());
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		}).start();;
		
		new Thread(new Runnable() {
			
			int number = 10;
			
			@Override
			public void run() {
				while(number>0){
					number --;
					try {
						System.out.println(numberAdd.valuePlusPlus());
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		}).start();
	}
}
