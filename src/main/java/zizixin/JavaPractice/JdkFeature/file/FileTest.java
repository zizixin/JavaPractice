package zizixin.JavaPractice.JdkFeature.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileTest {

		public static void main(String[] args) throws IOException {
			FileInputStream inputStream = null;
			File file = new File("c:/tempFile.txt");
			File fileArea = new File("c:/Users/marvinpeng/Downloads/areas.csv");
			//file.getF
			System.out.println(file.exists());
			try {
				//inputStream = new FileInputStream(file);
				 
				BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileArea),"GB2312"));// 从字符输入流中读取文件中的内容,封装了一个new InputStreamReader的对象
				
	            String ch; 
	            while ((ch = br.readLine())!=null) {  
	                System.out.println(ch);  
	            }  
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(inputStream.getFD().toString());
			//inputStream.read(b, off, len)
			System.out.println(inputStream.read());
			System.out.println(inputStream.toString());
		}
}
