package zizixin.JavaPractice.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import zizixin.JavaPractice.getPlace.Constant;

public class FileKeyValueInfoGet {

	public static String defaultFileLocation = "C:/useFile.txt";
	
	public static FileKeyValueInfoGet defaultInstance = new FileKeyValueInfoGet();
	
	public String fileLocation = "";
	
	public Map<String,String> mapMock;
	
	public FileKeyValueInfoGet(String fileLocation){
		this.fileLocation = fileLocation;
	}
	
	public FileKeyValueInfoGet() {
		this(defaultFileLocation);
	}
	
	public String getValue(String key){
		return this.mapMock.get(key);
	}
	
	public String putValue(String key,String value){
		this.mapMock.put(key, value);
		return value;
	}
	
	public void init() throws Exception{
		mapMock = new HashMap<String, String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(this.fileLocation)),"GB2312"));
	    String ch;
	    int flag;
	    String key = null;
	    String value = null;
	    while ((ch = br.readLine())!=null) {
	    	flag = 0;
	        for(String tempString:ch.split(Constant.SPLIT)){
	        	if(flag == 0){
	        		key = tempString;
	        	}else if(flag == 1){
	        		value = tempString;
	        	}
	        	flag++;
	        }
	        if(flag != 2){
	        	throw new Exception("there have file format wrong");
	        }
	        mapMock.put(key, value);
	    }
	}
	
	public static void main(String[] args) {
		
		try {
			FileKeyValueInfoGet.defaultInstance.init();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
//	BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(this.fileLocation)),"GB2312"));
//    String ch; 
//    while ((ch = br.readLine())!=null) {  
//        System.out.println(ch);  
//    }
	
}
