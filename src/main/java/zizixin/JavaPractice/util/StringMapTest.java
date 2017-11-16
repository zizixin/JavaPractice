package zizixin.JavaPractice.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringMapTest {

	public static void main(String[] args) {
		
		Map<String,String> hashMap = new HashMap<String,String>();
		
		String key1 = new String("key1");
		
		String value1 = new String("value1");
		
		hashMap.put(key1, value1);
		
		key1 = "key2";
		
		value1 = "value2";
		
		hashMap.put(key1, value1);
		
		for(Entry<String, String> entry:hashMap.entrySet()){
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		String testKey1 = "key1";
		
		String testKey2 = key1;
		
		key1 = "key2";
		
		System.out.println(testKey2);
	}
}
