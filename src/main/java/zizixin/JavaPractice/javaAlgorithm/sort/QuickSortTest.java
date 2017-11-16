package zizixin.JavaPractice.javaAlgorithm.sort;

import zizixin.JavaPractice.javaAlgorithm.search.SearchObject;
import zizixin.JavaPractice.javaAlgorithm.search.SearchObjectArrayUtil;
import zizixin.JavaPractice.javaAlgorithm.search.TimeSpentUtil;
import zizixin.JavaPractice.javaAlgorithm.search.TimeSpentUtil.TimeSpent;

public class QuickSortTest implements ClassTest{

	@Override
	public String thisTestInfo() {
		return "this test is use for quickSort review";
	}

	@Override
	public void testBegain() throws Exception {
		System.out.println(thisTestInfo());
		final SearchObject[] forMultiThrad = SearchObjectArrayUtil.getSearchObjectArray();
		Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					System.out.println("multi thread for quick sort by shutdown hook"+TimeSpentUtil.timeSpent.getTime());
					System.out.println(forMultiThrad);
					SearchObjectArrayUtil.printSearchObjectArray(forMultiThrad);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}));
		try {
			TimeSpent timer = TimeSpentUtil.timeSpent;
			timer.setTime();
			new QuickSortTurbo<SearchObject>(SearchObjectArrayUtil.getSearchObjectArray()).sort();
			System.out.println("no multi thread for quick sort"+timer.getTime());
			timer.setTime();
			new QuickSortMultiThread<SearchObject>(forMultiThrad).sort();//multi thrad for array can use but create thread for only small calculate is not fast,so this is slow
			
			//System.out.println("multi thread for quick sort"+timer.getTime());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		
	}

	public static void main(String[] args) {
		
		try {
			new QuickSortTest().testBegain();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
