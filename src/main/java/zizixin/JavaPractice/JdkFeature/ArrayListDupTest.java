package zizixin.JavaPractice.JdkFeature;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDupTest {

	public static void main(String[] args) {
		
		List<String> stringList = new ArrayList<>();
		stringList.add("one");
		stringList.add("one");
		System.out.println(stringList.size());
		System.out.println(stringList);
		List<Object> objectList = new ArrayList<>();
		Object obj = new Object();
		objectList.add(obj);
		objectList.add(obj);
		System.out.println(objectList);
		List<Object>  objectListTwo = new ArrayList<>();
		objectListTwo.add(obj);
		objectListTwo.add(obj);
		
		System.out.println(objectListTwo);
		
		objectListTwo.addAll(objectList);
		
		System.out.println(objectListTwo);
		
	}
	
}
