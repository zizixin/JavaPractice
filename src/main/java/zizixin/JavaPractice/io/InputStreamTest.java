package zizixin.JavaPractice.io;

import java.io.File;

public class InputStreamTest {
	
	public static void main(String[] args) {
		
		
		File fileOne = new File("c:/test.txt");
		
		System.out.println(fileOne.exists());
		
//		for(String temp:fileOne.list()){
//			System.out.println(temp);
//		}
		
		File fileTwo = new File("c:/testNotExist.txt");
		
		System.out.println(fileTwo.exists());
		
		System.out.println("end");
		
	}
}
