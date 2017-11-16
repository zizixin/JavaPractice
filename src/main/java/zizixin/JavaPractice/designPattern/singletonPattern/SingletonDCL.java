package zizixin.JavaPractice.designPattern.singletonPattern;

/**
 * @author zizixin
 * 
 * Double Checking Locking,thread safe
 *
 */
public class SingletonDCL {

	private volatile static SingletonDCL instance;
	
	private SingletonDCL(){
		super();
	}
	
	public static SingletonDCL getInstance(){
		if(SingletonDCL.instance == null){
			synchronized (SingletonDCL.class) {
				if(SingletonDCL.instance == null){//this is important,with out this,could have multi instance
					SingletonDCL.instance =  new SingletonDCL();
				}
			}
		}
		return instance;
	}
	
}
