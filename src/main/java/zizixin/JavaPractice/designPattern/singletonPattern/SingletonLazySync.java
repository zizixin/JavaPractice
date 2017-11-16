package zizixin.JavaPractice.designPattern.singletonPattern;

/**
 * @author zizixin
 *
 * lazy singleton,anf by sync is thread safe
 * Sync use in getInstance can make performance down,so this is not good
 */
public class SingletonLazySync {

	private static SingletonLazySync instance;
	
	private SingletonLazySync(){
		super();
	}
	
	public static synchronized SingletonLazySync getInstance(){
		if(SingletonLazySync.instance == null){
			SingletonLazySync.instance = new SingletonLazySync();
		}
		return SingletonLazySync.instance;
	}
	
}
