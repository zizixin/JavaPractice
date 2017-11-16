package zizixin.JavaPractice.codeTest;

import java.io.UnsupportedEncodingException;

import org.apache.hadoop.mapred.machines_jsp;

public class ISO_8859_1 {

	
	public static void main(String[] args) {
		
		String nameOne = "中文测试";
		
		String nameTwo = "englist test";
		
		try {
			byte[] bytes = nameOne.getBytes("ISO-8859-1");
			for(byte temp:bytes){
				System.out.println(temp);
			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
