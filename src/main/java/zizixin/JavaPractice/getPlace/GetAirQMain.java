package zizixin.JavaPractice.getPlace;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class GetAirQMain {

	
	public static void main(String[] args){
		
		try {
			
			final List<GetAirQForOneCity> getAirQUtilList = new ArrayList<GetAirQForOneCity>();
			
			String getPlaceUrl = "select placeUrl,placeId,placeName from placeUrl";
			
			ResultSet resultSet = null;
			try {
				resultSet = MysqlConnect.conn.createStatement().executeQuery(getPlaceUrl);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			while(resultSet.next()){
<<<<<<< HEAD
//				if(resultSet.getString("placeUrl").equals("/city/chengdu.html")){
//					GetAirQForOneCity getAirQForOneCity = new GetAirQForOneCity(Constant.WEBSITE+resultSet.getString("placeUrl"),resultSet.getString("placeId"),resultSet.getString("placeName"),3600);
//					getAirQUtilList.add(getAirQForOneCity);
//					break;
//				}
				GetAirQForOneCity getAirQForOneCity = new GetAirQForOneCity(Constant.WEBSITE+resultSet.getString("placeUrl"),resultSet.getString("placeId"),resultSet.getString("placeName"),3600);
=======
				GetAirQForOneCity getAirQForOneCity = new GetAirQForOneCity(Constant.WEBSITE+resultSet.getString("placeUrl"),resultSet.getString("placeId"),resultSet.getString("placeName"),300);
>>>>>>> fa5c255a222d0f8f79b70cfc196e62c066d638f4
				getAirQUtilList.add(getAirQForOneCity);
			}
			
			for(GetAirQForOneCity getAirQForOneCity:getAirQUtilList){
				getAirQForOneCity.start();
			}
			
			new Thread(new Runnable() {
				public void run() {
					int index = 0;
					while(!getAirQUtilList.isEmpty()){
						if(getAirQUtilList.get(index).writeFlag){
							try {
								getAirQUtilList.get(index).write();
								//getAirQUtilList.remove(index);
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (ParseException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}else{
							index++;
						}
						if(index==getAirQUtilList.size()){
							index = 0;
<<<<<<< HEAD
							System.out.println("one check loop have end and have "+ getAirQUtilList.size() +" not download finish");
							System.out.println("open a while check!");
							try {
								Thread.sleep(500);
							} catch (InterruptedException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
=======
							System.out.println("one check loop have end");
							try {
								Thread.sleep(5000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
>>>>>>> fa5c255a222d0f8f79b70cfc196e62c066d638f4
							}
						}
					}
					System.out.println("this download task have complete!");
				}
			}).start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
