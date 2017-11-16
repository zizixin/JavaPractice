package zizixin.JavaPractice.getPlace;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.SQLException;

public class GetPlace implements GetData{

	private GetPlace(){
		
	}
	
    public static Connection conn = MysqlConnect.conn;
	
    public static Integer count = 0;
    
    public static Boolean dataBaseSwitchFlag = false;
    
	public static void main(String[] args)throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File("c:/Users/marvinpeng/Downloads/areas.csv")),"GB2312"));// 从字符输入流中读取文件中的内容,封装了一个new InputStreamReader的对象
		Place place = new Place();
		String ch; 
         while ((ch = br.readLine())!=null) {
        	 
        	String[] arrays = ch.split(","); 
        	place.setPlaceId(arrays[0]);
        	place.setPlaceNameDetail(arrays[1]);
        	place.setParentPlaceId(arrays[2]);
        	place.setPlaceName(arrays[3]);
        	place.setIng(arrays[4]);
        	place.setLat(arrays[5]);
        	place.setLevel(Integer.valueOf(arrays[6]));
        	place.setPosition(arrays[7]);
        	place.setSort(Integer.valueOf(arrays[8]));
        	
            for(String tempString:ch.split(",")){
            	
            	System.out.println(tempString);
            }
            
            if(dataBaseSwitchFlag){
            	putPlaceToInsertSqlToFile(place,"c:/sql.txt");
            }else{
            	System.out.println("you don't open the dataBaseSwitchFlag!");
            }
            
         }  
         
	}
	
	public static void putPlaceToInsertSqlToFile(Place place,String file) throws IOException, SQLException{
		StringBuilder sqlbuilder = new StringBuilder();
		
		//INSERT INTO `airq`.`place` (`placeId`, `parentPlaceId`, `placeName`, `palceNameDetail`, `ing`, `lat`, `level`, `position`, `sort`) VALUES ('1', '1', '1', '1', '1', '1', '1', '1', '1');

		sqlbuilder.append("insert into place(`placeId`, `parentPlaceId`, `placeName`, `palceNameDetail`, `ing`, `lat`, `level`, `position`, `sort`) values(");
		sqlbuilder.append("'").append(place.getPlaceId()).append("',");
		sqlbuilder.append("'").append(place.getParentPlaceId()).append("',");
		sqlbuilder.append("'").append(place.getPlaceName()).append("',");
		sqlbuilder.append("'").append(place.getPlaceNameDetail()).append("',");
		sqlbuilder.append("'").append(place.getIng()).append("',");
		sqlbuilder.append("'").append(place.getLat()).append("',");
		sqlbuilder.append(place.getLevel()).append(",");
		sqlbuilder.append("'").append(place.getPosition()).append("',");
		sqlbuilder.append(place.getSort());
		sqlbuilder.append(")").append(System.getProperty("line.separator"));
		
		conn.createStatement().execute(sqlbuilder.toString());
		count++;
		//SetFileContent.setFileContent(file, sqlbuilder.toString());
	}
}
