package zizixin.JavaPractice.multiThread.ticket;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List<Integer> integerList = new ArrayList<>();
		int oneInt = 1;
		int oneIntNo2 = 1;
		Integer oneInteger = 1;
		Integer oneIntegerNo2 =1;
		integerList.add(oneInt);
		integerList.add(oneInt);
		integerList.add(oneIntNo2);
		integerList.add(oneInteger);
		integerList.add(oneIntegerNo2);
		System.out.println(integerList);
		
		List<Object> objectList = new ArrayList<>();
		objectList.add(null);
		System.out.println(objectList);
	}
	
}
