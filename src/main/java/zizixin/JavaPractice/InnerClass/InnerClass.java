package zizixin.JavaPractice.InnerClass;

/**
 * @author zizixin
 * 测试内部类的初始化方法
 *
 */
public class InnerClass {

	String className = "InnerClass";
	
	public class ClassInner{
		
		String className ="classInner";
		
	}
	
	
	public static void main(String[] args) {
		
		
		InnerClass.ClassInner inner= new InnerClass().new ClassInner();
		
		System.out.println(inner.toString());
	}
}
