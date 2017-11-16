package zizixin.JavaPractice.JdkFeature.dynamicProxy.jdkDefault;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class jdkDefaultMainTest {

	public static void main(String[] args) {
		
		DoSomething doSomething = new DoSomehingImpl();
		
		InvocationHandler myhandler = new MyHandler(doSomething);
		
		DoSomething proxy = (DoSomething) Proxy.newProxyInstance(doSomething.getClass().getClassLoader(), 
				                                                 doSomething.getClass().getInterfaces(),
				                                                 myhandler);
		
		StaticClass.setObject(proxy);
		
		System.out.println(proxy.getClass().getName());
		
		proxy.doSomething();
	}
}
