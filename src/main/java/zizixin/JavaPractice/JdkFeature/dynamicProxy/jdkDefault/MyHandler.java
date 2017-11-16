package zizixin.JavaPractice.JdkFeature.dynamicProxy.jdkDefault;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHandler implements InvocationHandler{

	public DoSomething doSomething;
	
	public MyHandler(DoSomething doSomething){
		this.doSomething = doSomething;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		System.out.println("invoke method"+proxy.getClass().getName());
		
		//System.out.println();
		
		System.out.println("before invoke this!");
		
		DoSomething somthing = (DoSomething)proxy;
		
		System.out.println(somthing==this.doSomething);
		
		System.out.println(this==proxy);
		
		System.out.println(StaticClass.store == proxy);
		
		this.getClass().getName();
		
		somthing.doSomething();
		
		return method.invoke(this.doSomething, args);
	}

}
