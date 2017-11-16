package zizixin.JavaPractice.designPattern.singletonPattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

import zizixin.JavaPractice.designPattern.Demo;


public class SingletonPatternDemo implements Demo{
	
	public static SingletonPatternDemo instance = new SingletonPatternDemo();
	
	private SingletonPatternDemo(){
		super();
	}
	
	/**
	 * 6种实现单例的类名
	 */
	static String[] singletonClassName = {SingletonDCL.class.getName(),
										  SingletonEnum.class.getName(),
										  SingletonHungry.class.getName(),
										  SingletonLazy.class.getName(),
										  SingletonLazySync.class.getName(),
										  SingletonStaticInnerClass.class.getName()
										  };
	
	/**
	 * 记录线程与线程名的对应
	 */
	static Map<String,Thread> threadMap = new HashMap<>();
	
	/**
	 * 记录每个线程对每个单列的结果
	 */
	static Map<String,List<String>> resultMap = new ConcurrentHashMap<>();
	
	public static int number = 20;
	
	public static int clockTime = SingletonPatternDemo.number*500;
	@Override
	public void show() throws Exception {
		
		System.out.println("singleton demo begain!");
		
		Thread[] threads = new Thread[SingletonPatternDemo.number];
		//建立10条线程
		for(int i=0;i<SingletonPatternDemo.number;i++){
			final String threadName = String.valueOf(i);
			threads[i] = ThreadGeneratorAndEnvInit(threadName);
		}
		//运行10条线程
		for(int i=0;i<SingletonPatternDemo.number;i++){
			threads[i].start();
		}
		//等待一秒，线程运行完毕，打印结果
		Thread.sleep(SingletonPatternDemo.clockTime);
		printResultMap();
		
		System.out.println("singleton demo end!");
	}
	
	/**
	 * 打印结果
	 */
	public void printResultMap(){
		Iterator<Entry<String, List<String>>> it = resultMap.entrySet().iterator();
		while(it.hasNext()){
			Entry<String, List<String>> entry = it.next();
			System.out.println("-----------------------------------------");
			System.out.println("classname+threadName:"+entry.getKey()+" ");
			List<String> instanceLists = entry.getValue();
			for(int i=0;i<instanceLists.size();i++){
				System.out.println(instanceLists.get(i)+"  ");
			}
			System.out.println("\n-----------------------------------------");
		}
	}
	
	/**
	 * @param threadName 初始化一个线程，初始化其上下文环境
	 * @return 
	 * @throws Exception
	 */
	public Thread ThreadGeneratorAndEnvInit(final String threadName) throws Exception{
		if(SingletonPatternDemo.threadMap.get(threadName)!=null){
			throw new Exception("please dont use same thread name");
		}
		else{
			Thread thread = new Thread(new Runnable() {
				
				@Override
				public void run() {
					try {
						for(int i=0;i<SingletonPatternDemo.number;i++){
							resolveInstanceResults(getEachSingletonInstance(),threadName);
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				}
			},threadName);
			SingletonPatternDemo.threadMap.put(threadName, thread);//记录线程生成
			for(int i=0;i<SingletonPatternDemo.singletonClassName.length;i++){
				resultMap.put(resultFlagInit(SingletonPatternDemo.singletonClassName[i],threadName), Collections.synchronizedList(new ArrayList<String>()));//创建每次线程执行的容器
			}
			return thread;
		}
	}
	
	public static String resultFlagInit(String className,String threadName){
		return className+" "+threadName;
	}

	
	/**
	 * @return 执行一次返回的所有单例的结果
	 */
	public String[] getEachSingletonInstance(){
		String[] sinletonNames = new String[6];
		sinletonNames[0] = SingletonDCL.getInstance().toString();//双重校验锁
		sinletonNames[1] = SingletonEnum.INSTANCE.toString();//枚举
		sinletonNames[2] = SingletonHungry.getInstance().toString();//饿汉
		sinletonNames[3] = SingletonLazy.getInstance().toString();//懒汉
		sinletonNames[4] = SingletonLazySync.getInstance().toString();//懒汉线程安全
		sinletonNames[5] = SingletonStaticInnerClass.getInstance().toString();//静态内部类
		return sinletonNames;
	}

	
	/**
	 * 处理返回结果，使其持久化在resultMap内
	 * @param sinletonInstanceNames 线程执行一次取得所有单例的返回值
	 * @param threadName 线程名称
	 * @throws Exception
	 */
	public void resolveInstanceResults(String[] sinletonInstanceNames,String threadName)throws Exception{
		List<String> resultContainer;
		for(int i=0;i<sinletonInstanceNames.length;i++){
			if((resultContainer = resultMap.get(resultFlagInit(singletonClassName[i],threadName)))==null){
				throw new Exception("thread init has problem");
			}else{
				resultContainer.add(sinletonInstanceNames[i]);
			}
			
		}
	}
}
