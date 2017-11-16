package zizixin.JavaPractice.gc;

public class GCDetailLogTest {

	
	private static int _1MB = 1024 * 1024;
	
	
	public static void allocate(){
		
		byte[] one,two,three,four;
		
		one = new byte[2* _1MB];
		
		two = new byte[2* _1MB];
		
		three = new byte[2* _1MB];
		
		four = new byte[4* _1MB];
	}
}

