package zizixin.JavaPractice.gc;

public class GcTest {

	public Object instance;
	
	public static final int i_mb = 1024*1024;
	
	public static void main(String[] args) {
		
		GcTest testA = new GcTest();
		
		GcTest testB = new GcTest();
		
		testA.instance = testB;
		
		testB.instance = testA;
		
		System.gc();
	}
}
