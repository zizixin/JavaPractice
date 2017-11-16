package zizixin.JavaPractice.JdkFeature;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	 class Object{
		 
		public String nameOne;
		
		public String nameTwo;
		
		public Object(String nameOne,String nameTwo){
			this.nameOne = nameOne;
			this.nameTwo = nameTwo;
		}
		
		@Override
		public boolean equals(java.lang.Object obj) {
			// TODO Auto-generated method stub
			return super.equals(obj);
		}
		
		public boolean equals(Object obj) {
			if(obj == null){
				return false;
			}
			if(obj instanceof MapTest.Object){
				if(((MapTest.Object)obj).nameOne.equals(this.nameOne)&&((MapTest.Object)obj).nameTwo.equals(this.nameTwo)){
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
			return (this.nameOne+this.nameTwo).hashCode();
		}
	}
	
	public static void main(String[] args) {
		// Object obj = MapTest.new Object();// 无法初始化，但是类的名称可以这样引用
		
		HashMap<String,String> mapTest = new HashMap<>();
		
		System.out.println(mapTest.toString());
		mapTest.put("keyOne", "valueOne");
		
		MapTest.Object obj1 = new MapTest().new Object("nameOne", "nameTwo");// 非静态内部类需要这样才能初始化，java是这样规定的，因为这样，内部类里面才能有一个指向外部类的引用，
		MapTest.Object obj2 = new MapTest().new Object("nameOne", "nameTwo");// 非静态内部类需要这样才能初始化，因为这样，内部类里面才能有一个指向外部类的引用，
		
		System.out.println("obj1 hashcode:"+obj1.hashCode());
		System.out.println("obj2 hashcode:"+obj2.hashCode());//两者的hashcode 不同
		
		System.out.println(obj1.equals(obj2));
		
		Map<MapTest.Object,String> testMap = new HashMap<>();
		testMap.put(obj1, "hello,i am obj1");
		System.out.println(testMap.get(obj2));//得到的值为null,hashcode 相同，equal 但是无法取出其对应的值
		
		Map<String,String> testMap2 = new HashMap<>();
		
		String stringOne = "123";
		
		System.out.println("stringOne hashcode:"+stringOne.hashCode());
		
		String stringTwo = "123";
		
		System.out.println(stringOne==stringTwo);
	}
	
}
