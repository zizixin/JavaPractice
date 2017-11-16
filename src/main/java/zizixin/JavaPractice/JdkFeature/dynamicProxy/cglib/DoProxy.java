package zizixin.JavaPractice.JdkFeature.dynamicProxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class DoProxy implements MethodInterceptor {

	 	private Object target;  
	  
	    public Object getInstance(Object target) {  
	        this.target = target;  
	        Enhancer enhancer = new Enhancer();  
	        enhancer.setSuperclass(this.target.getClass());  
	        // 回调方法  
	        enhancer.setCallback(this);  
	        // 创建代理对象  
	        return enhancer.create();  
	    }  
	  
	    @Override  
	    // 回调方法  
	    public Object intercept(Object obj, Method method, Object[] args,  
	            MethodProxy proxy) throws Throwable {
	    	obj.getClass().getName();
	    	
	    	System.out.println(this ==obj);
	        System.out.println("事物开始");  
	        proxy.invokeSuper(obj, args);  
	        System.out.println("事物结束");  
	        return null;  
	  
	  
	    }  
}
