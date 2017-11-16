package zizixin.JavaPractice.InnerClass.innerClass;

public class InnerClassTest {

	
	public String test = "test";
	
	public Object obj = new Object();
	
	class InnerClass{
		public String test = InnerClassTest.this.test;
	}
	
	static class InnerStaticClass{
		//public String testTwo =  InnerClassTest.this.test; static class can not have instance of outer class
	}
}
