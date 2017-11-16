package zizixin.JavaPractice.util;

import java.io.FileOutputStream;
import java.io.IOException;

public class SetFileContent {

	
	public static void setFileContent(String filePath,String content) throws IOException{
		FileOutputStream fos = new FileOutputStream(filePath,true);
		
		fos.write(content.getBytes());
		fos.close();
	}
}
