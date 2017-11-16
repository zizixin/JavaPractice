package zizixin.JavaPractice.JdkFeature;

import java.util.ArrayList;

public class EmptyMain {

		public static void main(String[] args) {
			
			int i =0;
			
			ArrayList<String> list = new ArrayList<String>();
			
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					while(true){
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println(list.size());
					}
				}
			}).start();
			
			while(true){
				
				list.add(new String(String.valueOf(i++)));
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
}
