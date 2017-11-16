package zizixin.JavaPractice.InnerClass.InnerClassReferTest;

public class Outer {

	public static String outerString;
	
	public Inner innerRefer = new Inner();
	
	public StaticInner staticInnerRefer = new Outer.StaticInner();
	
	public class Inner{
		
		public String innerString;
	}
	
	public static class StaticInner{
		
		public String staticInnerClassString = outerString;
		
		
	}
	
}
