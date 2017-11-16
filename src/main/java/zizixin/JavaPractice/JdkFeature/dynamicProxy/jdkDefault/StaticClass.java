package zizixin.JavaPractice.JdkFeature.dynamicProxy.jdkDefault;

public class StaticClass {

	
	public static Object store;
	
	public static void setObject(Object obj){
		StaticClass.store = obj;
	}
}
