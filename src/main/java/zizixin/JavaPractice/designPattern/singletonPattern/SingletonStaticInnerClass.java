package zizixin.JavaPractice.designPattern.singletonPattern;

/**
 * @author zizixin
 *
 * like SingletonHungry,use classloader is threadsafe
 * use static innerclass to make instance buffer init
 */
public class SingletonStaticInnerClass {

	private static class InstanceHolder{
		
		public static SingletonStaticInnerClass instance = new SingletonStaticInnerClass();
		
	}
	
	private SingletonStaticInnerClass(){
		super();
	}
	
	public static SingletonStaticInnerClass getInstance(){
		return InstanceHolder.instance;
	}
}
