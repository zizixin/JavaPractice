package zizixin.JavaPractice.designPattern.singletonPattern;

/**
 * @author zizixin
 * 
 * lazy pattern,thread unsafe
 *
 */
public class SingletonLazy {
	
	private  static SingletonLazy instance;//first time,no static,watch out this problem
	
	private SingletonLazy(){
		super();
	}
	
	public static SingletonLazy getInstance(){
		if(SingletonLazy.instance==null){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			SingletonLazy.instance = new SingletonLazy();
		}
		return SingletonLazy.instance;
	}
	
}
