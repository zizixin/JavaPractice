package zizixin.JavaPractice.getPlace;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GetLevelAirQ {

	public static void main(String[] args) {
	
		List<String[]> placeList = new ArrayList<>(); 
		
		try {
			String getPlaceLevel = "select placeId,placeName from place where level = ?";
			PreparedStatement prepareGetName = MysqlConnect.conn.prepareStatement(getPlaceLevel);
			prepareGetName.setString(1, "2");
			ResultSet placeResults = prepareGetName.executeQuery();
			while(placeResults.next()){
				String[] tempArray = new String[2];
				tempArray[0] = placeResults.getString("placeId");
				tempArray[1] = placeResults.getString("placeName");
				placeList.add(tempArray);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("get place error");
		}
		
		
		System.out.println("for debug");
		
		List<StatisticLevel> statisticLevels = new ArrayList<StatisticLevel>();
		String getAverageValueSQL = "	SELECT                                                               "+
								"  count(*) totalCount,                                                      "+
								"  sum(e.ChinaAirIndex)/count(*) ChinaAirIndex,                              "+
								"  sum(e.AmericanAirIndex)/count(*) AmericanAirIndex,                        "+
								"  sum(e.pm25)/count(*) pm25,                                                "+
								"  sum(e.pm10)/count(*) pm10                                                 "+
								"FROM place d                                                                "+
								"left join place c ON d.parentPlaceId = c.placeId                            "+
								"LEFT JOIN place b ON c.parentPlaceId = b.placeId                            "+
								"LEFT JOIN place a ON b.parentPlaceId = a.placeId                            "+
								"left join placeairq e on d.placeId = e.placeId                              "+
								"where (a.placeId = ? or b.placeId = ? or c.placeId = ? or d.placeId = ?)                     "+
								"and e.ChinaAirIndex != 0 and e.id is not null                               ";
		
		try {
			for(String[] temp:placeList){
				PreparedStatement prepareStatementGetAverage = MysqlConnect.conn.prepareStatement(getAverageValueSQL);
				prepareStatementGetAverage.setString(1,temp[0]);
				prepareStatementGetAverage.setString(2,temp[0]);
				prepareStatementGetAverage.setString(3,temp[0]);
				prepareStatementGetAverage.setString(4,temp[0]);
				ResultSet getAverageResults = prepareStatementGetAverage.executeQuery();
				while(getAverageResults.next()){
					StatisticLevel statisticLevel = new StatisticLevel();
					statisticLevel.totalCount = getAverageResults.getInt("totalCount");
					statisticLevel.ChinaAirIndex = getAverageResults.getDouble("ChinaAirIndex");
					statisticLevel.AmericanAirIndex = getAverageResults.getDouble("AmericanAirIndex");
					statisticLevel.pm25 = getAverageResults.getInt("pm25");
					statisticLevel.pm10 = getAverageResults.getInt("pm10");
					statisticLevel.placeId = temp[0];
					statisticLevel.placeName= temp[1];
					statisticLevels.add(statisticLevel);
				}
			}
			
			Collections.sort(statisticLevels, new Comparator<StatisticLevel>() {

				@Override
				public int compare(StatisticLevel o1, StatisticLevel o2) {
					if(o1.ChinaAirIndex>o2.ChinaAirIndex){
						return -1;
					}else if(o1.ChinaAirIndex<o2.ChinaAirIndex){
						return 1;
					}else{
						return 0;
					}
				}

		
			});
			
			
			for(StatisticLevel tempStatisticLevel:statisticLevels){
				System.out.println(tempStatisticLevel.toString());
			}
			
			System.out.println("for debug!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
class StatisticLevel{
	
	public String placeId;
	
	public String placeName;
	
	public Integer totalCount;
	
	public Double ChinaAirIndex;
	
	public Double AmericanAirIndex;
	
	public Integer pm25;
	
	public Integer pm10;
	
	@Override
	public String toString() {
		StringBuilder stringbuilder =new StringBuilder();
		stringbuilder.append("placeId:").append(this.placeId).append(" ");
		stringbuilder.append("placeName:").append(this.placeName).append(" ");
		stringbuilder.append("totalCount:").append(this.totalCount).append(" ");
		stringbuilder.append("ChinaAirIndex:").append(this.ChinaAirIndex).append(" ");
		stringbuilder.append("AmericanAirIndex:").append(this.AmericanAirIndex).append(" ");
		stringbuilder.append("pm25:").append(this.pm25).append(" ");
		stringbuilder.append("pm10:").append(this.pm10).append(" ");
		return stringbuilder.toString();
	}
}