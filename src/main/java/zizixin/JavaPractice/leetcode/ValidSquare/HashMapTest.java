package zizixin.JavaPractice.leetcode.ValidSquare;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	
	public  void notStaticMethod(){
		Map<TargetObject,Object> targetObject = new HashMap<TargetObject,Object>();
	}
	
	public static void main(String[] args) {
		HashMapTest test = new HashMapTest();
		Map<TargetObject,Object> targetObject = new HashMap<TargetObject,Object>();
		TargetObject obj1 = test.new TargetObject(new Object(), 1);
		
		TargetObject obj2 = test.new TargetObject(new Object(), 1);
		
		targetObject.put(obj1, "this is hashMap key test");
		
		targetObject.put(obj2, "this is hashMap key test two");
		
		System.out.println(targetObject.size());
		
		//use hashcode find general location and use equal to find exactly location
	}
	
	class TargetObject{
		
		public Object obj;
		
		public int intValue;
		
		public TargetObject(Object obj,int intValue){
			this.obj = obj;
			this.intValue = intValue;
		}
		
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof TargetObject){
				if(this.intValue == ((TargetObject)obj).intValue){
					return true;
				}else{
					return false;
				}
			}else{
				return false;
			}
		}
		
		@Override
		public int hashCode() {
			return this.intValue;
		}
	}
}
