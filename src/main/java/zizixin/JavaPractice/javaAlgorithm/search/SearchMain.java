package zizixin.JavaPractice.javaAlgorithm.search;

import zizixin.JavaPractice.javaAlgorithm.search.binaryChopSearch.BinaryChopSearchMain;
import zizixin.JavaPractice.javaAlgorithm.search.binarySearch.BinarySearchMain;
import zizixin.JavaPractice.javaAlgorithm.search.nomalSearch.NormalSearchMain;

public class SearchMain {

	public static void main(String[] args) throws Exception {
		try {
			
			TimeSpentUtil.TimeSpent timer=TimeSpentUtil.getTimeSpentInstance();
			timer.setTime();
			BinaryChopSearchMain.main(args);
			System.out.println("BinaryChop search use time"+timer.getTime());
			
			timer.setTime();
			BinarySearchMain.main(args);
			System.out.println("Binary search use time"+timer.getTime());
			
			timer.setTime();
			NormalSearchMain.main(args);
			System.out.println("normal search use time"+timer.getTime());
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}
}
