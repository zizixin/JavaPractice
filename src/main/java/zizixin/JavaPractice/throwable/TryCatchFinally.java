package zizixin.JavaPractice.throwable;

public class TryCatchFinally {

	public static void main(String[] args) {		
		test();
		printSeparate();
		testSystemExit();
		printSeparate();
		testThreadKill();
	}
	
	public static void printSeparate(){
		System.out.println("------------------------------------------------------------------~-----------------------------------------------------------------");
	}
	
	public static void test(){
		try {
			System.out.println("try block throw a exception");
			throw new Exception("i am a exception");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("catch block print something");
			return;//after return,the finally block is run
		}finally {
			System.out.println("finally block print something");
		}
	}
	
	
	public static void testThreadKill(){
		
		
		try {
			System.out.println("try block throw a exception");
			throw new Exception("i am a exception");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("catch block print something");
			//Thread.currentThread().interrupt();//after return,the finally block is not run
		}finally {
			System.out.println("finallu block print something");
		}
	}
	
	public static void testSystemExit(){
		try {
			System.out.println("try block throw a exception");
			throw new Exception("i am a exception");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("catch block print something");
			//System.exit(1);;//after return,the finally block is not run  careful use
		}finally {
			System.out.println("finallu block print something");
		}
	}
	
	//print to screen is mulit thread;
}
