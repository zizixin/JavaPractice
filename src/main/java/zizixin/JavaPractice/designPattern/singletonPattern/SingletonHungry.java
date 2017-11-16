package zizixin.JavaPractice.designPattern.singletonPattern;

/**
 * @author zizixin
 *
 * hungry singleton,thread safe
 *
 * use classloader is thread safe
 *
 */
public class SingletonHungry {

	private static SingletonHungry instance = new SingletonHungry();
	
	private SingletonHungry(){
		super();
	}
	
	public static SingletonHungry getInstance(){
		return SingletonHungry.instance;
	}
	
}
