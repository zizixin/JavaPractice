package zizixin.JavaPractice.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class GetFileContent {

	public static String getFileContent(String filePath,StringBuilder stringBuilder) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(filePath)),"UTF-8"));
		
		String ch;
		while ((ch = br.readLine())!=null) {
	    	stringBuilder.append(ch);
	    }
		
		return stringBuilder.toString();
	}
	
}
