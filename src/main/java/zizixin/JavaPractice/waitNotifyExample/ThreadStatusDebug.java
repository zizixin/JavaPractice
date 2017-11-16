package zizixin.JavaPractice.waitNotifyExample;

public class ThreadStatusDebug {

	public static void main(String[] args) {
		
		Object lock = new Object();
		
		new Thread(new Runnable(){

			@Override
			public void run() {
			   while(true){
				   try {
					Thread.sleep(1000);
					System.out.println("isAlive"+Thread.currentThread().isAlive());
					System.out.println("isDemon"+Thread.currentThread().isDaemon());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			   }
				
			}
			
		},"threadOne").start();
		
		new Thread(new Runnable() {
			public void run() {
				while(true){
					try {
						Thread.sleep(1000);
						System.out.println("isAlive"+Thread.currentThread().isAlive());
						System.out.println("isDemon"+Thread.currentThread().isDaemon());
						synchronized (lock) {
							lock.wait();
						}
						System.out.println("isAlive"+Thread.currentThread().isAlive());
						System.out.println("isDemon"+Thread.currentThread().isDaemon());
						System.out.println("if you don't see me,i may be blocked");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		},"threadTwo").start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (lock) {
					lock.notify();
				}
				while(true){
					System.out.println("isAlive"+Thread.currentThread().isAlive());
					System.out.println("isDemon"+Thread.currentThread().isDaemon());
				}
			}
		},"threadThree").start();
	}
}
