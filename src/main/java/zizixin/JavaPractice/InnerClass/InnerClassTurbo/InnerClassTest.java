package zizixin.JavaPractice.InnerClass.InnerClassTurbo;

import java.util.HashMap;
import java.util.Map;

public class InnerClassTest {
	
	public static InnerClassTest instance = new InnerClassTest(); 
	
	public String className = "outerClass";
	
	public Object fatherObj = new Object();
	
	public Map<String,Object> hashMap = new HashMap<>();
	
	NullInterface ni = new NullInterface() {
		public String fatherClassName = className;
		
		public Object obj = fatherObj;
		
		public String changeFatherObj(){
			
			Object obj=fatherObj;
			
			return "return";
		}
	};
	
	public class InnerClass{
		
		public String fatherClassName = className;
		
		public String innerClassName = "innerClass";
		
		public String changeFatherObj(){
			
			Object obj = fatherObj;
			
			return "return";
		}
	}
	
	public void methodInnerClassTest(){
		Object obj = new Object();
		
		Object obj2 = new Object();
		
		this.hashMap.put("key", obj);
		this.hashMap.put("keyTwo", obj2);
		
		final String string = new String();
		
		NullInterface ni = new NullInterface(){
			public void print(Object obj){
				String stringa = string;
			}
		};
	}
	
	public static void main(String[] args) {
		InnerClassTest.InnerClass obj = (InnerClass) new Object();
		InnerClassTest.InnerClass obj2 = instance.new InnerClass();
	}
}
