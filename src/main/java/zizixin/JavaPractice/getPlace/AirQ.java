package zizixin.JavaPractice.getPlace;

import java.util.ArrayList;
import java.util.Date;

import org.omg.CORBA.OMGVMCID;

public class AirQ {
	
	public String id;
	
	public String placeId;
	
	public String placeName;
	
	public String pm2_5 = "0";
	
	public String pm10 = "0";
	
	public String date;
	
	public Integer ChinaAirIndex = 0;
	
	public Integer AmericanAirIndex = 0;
	
	public ArrayList<AirQMonitoringPoint> monitorPointsAirQ = new ArrayList<AirQ.AirQMonitoringPoint>();
	
	public void refreshTodayData(){
		int pm25Sum = 0;
		int pm10Sum = 0;
		int pm25Count = 0;
		int pm10Count = 0;
		try {
	 		for(AirQMonitoringPoint monitorAirQ:this.monitorPointsAirQ){
	 			if(monitorAirQ.pm2_5.equals("—")){
	 				pm25Count++;
	 			}else{
	 				pm25Sum = pm25Sum + Integer.valueOf(monitorAirQ.pm2_5);
	 			}
				if(monitorAirQ.pm10.equals("—")){
					pm10Count++;
				}else{
					pm10Sum = pm10Sum + Integer.valueOf(monitorAirQ.pm10);
				}
				
				this.ChinaAirIndex = this.ChinaAirIndex + monitorAirQ.ChinaAirIndex;
				this.AmericanAirIndex = this.AmericanAirIndex + monitorAirQ.AmericanAirIndex;
	 		}
	 			this.pm2_5 = String.valueOf(pm25Sum/this.monitorPointsAirQ.size()-pm25Count);
	 			this.pm10 = String.valueOf(pm10Sum/this.monitorPointsAirQ.size()-pm10Count);
	 			this.ChinaAirIndex = this.ChinaAirIndex/this.monitorPointsAirQ.size();
	 			this.AmericanAirIndex = this.AmericanAirIndex/this.monitorPointsAirQ.size();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	class AirQMonitoringPoint{
		
		public Date date;
		
		public String monitorName;
		
		public String pm2_5 = "0";
		
		public String pm10 = "0";
		
		public Integer ChinaAirIndex = 0;
		
		public Integer AmericanAirIndex = 0;
		
		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append("date :").append(this.date);
			sb.append("monitorName :").append(this.monitorName);
			sb.append("pm2_5 :").append(this.pm2_5);
			sb.append("pm10 :").append(this.pm10);
			sb.append("ChinaAirIndex :").append(this.ChinaAirIndex);
			sb.append("AmericanAirIndex :").append(this.AmericanAirIndex);
			return sb.toString();
		}
	}
}
