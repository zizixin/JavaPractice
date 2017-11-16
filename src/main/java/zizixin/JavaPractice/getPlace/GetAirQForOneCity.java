package zizixin.JavaPractice.getPlace;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import org.apache.http.Consts;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import zizixin.JavaPractice.util.DateFormat;

public class GetAirQForOneCity {

	public String placeUrl;
	
	//public Date begainDate;
	
	//public Date endDate;
	
	public Timer timer;
	
	public TimerTask timeTask;
	
	public Integer frequency;
	
	public AirQ airQ;
	
	public transient Boolean writeFlag = false;
	
	public GetAirQForOneCity(String placeUrl,String placeId,String placeName){
		
		this(placeUrl,placeId,placeName,60);
		
//		Calendar calendar = Calendar.getInstance();
//	    calendar.setTime(new Date());
//	    calendar.set(Calendar.HOUR_OF_DAY, 0);
//	    calendar.set(Calendar.MINUTE, 0);
//	    calendar.set(Calendar.SECOND, 0);
//	    this.begainDate = calendar.getTime();	 
//	    calendar.add(Calendar.DAY_OF_MONTH, 1);
//	    calendar.add(Calendar.SECOND, -1);
//		this.endDate = calendar.getTime();
	}
	
	/**
	 * @param placeUrl website url
	 * @param frequency  unit second
	 */
	public GetAirQForOneCity(String placeUrl,String placeId,String placeName,Integer frequency){
		this.placeUrl = placeUrl;
		this.timeTask = new TimerTask() {
			@Override
			public void run() {
				try {
					GetAirQForOneCity.this.airQ.date = DateFormat.simpleDateFormatWithoutSecond.format(new Date());
					GetAirQForOneCity.this.getAirQsToArrayList();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					GetAirQForOneCity.this.timer.cancel();
				}
				
			}
		};
		this.timer = new Timer();
		this.frequency = frequency;
		this.airQ = new AirQ();
		this.airQ.placeId = placeId;
	}
	
	public void getAirQsToArrayList() throws ParseException, ClientProtocolException, IOException, java.text.ParseException{
		
		
		HttpClient httpClient = HttpClients.createDefault();
		
		HttpGet getAirQDetail = new HttpGet(placeUrl);
		
		HttpResponse response = httpClient.execute(getAirQDetail);
		
		Document doc = Jsoup.parse(EntityUtils.toString(httpClient.execute(getAirQDetail).getEntity(),Consts.UTF_8));
		
		//Document doc = Jsoup.parse(GetFileContent.getFileContent("C:/chengduAirQdetail.txt", new StringBuilder()));
		
		
		analysis(doc);
		
		
	}
	
	public void analysis(Document doc) throws java.text.ParseException{
		
		Element dateElement = doc.getElementsByAttributeValue("class", "citydata_updatetime").first();
		
		String dateString = dateElement.text().split("更新时间：")[1];
		
		
		
		Date date = DateFormat.simpleDateFormatWithoutSecond.parse(dateString);
			
		
		
		Elements airQDatas = doc.getElementsByAttributeValue("class", "pj_area_data_item pj_area_data_item_darkbg");
		
		int middle = airQDatas.size()/2;
		for(int i=0;i<middle;i++){
			
			AirQ.AirQMonitoringPoint airQMonitoringPoint =  this.airQ.new AirQMonitoringPoint();
			
			airQMonitoringPoint.date = date;
			
			airQMonitoringPoint.pm2_5 = airQDatas.get(i).getElementsByTag("span").get(2).text().split(" ")[0];
			
			airQMonitoringPoint.pm10 = airQDatas.get(i).getElementsByTag("span").get(3).text().split(" ")[0];
			
			airQMonitoringPoint.ChinaAirIndex = Integer.valueOf(airQDatas.get(i).getElementsByTag("span").get(0).text());
			
			airQMonitoringPoint.AmericanAirIndex = Integer.valueOf(airQDatas.get(middle+i).getElementsByTag("span").get(0).text());
			
			airQMonitoringPoint.monitorName = airQDatas.get(i).getElementsByTag("a").get(0).text();
			
			
			System.out.println(airQMonitoringPoint.toString());
			
			this.airQ.monitorPointsAirQ.add(airQMonitoringPoint);
		}
		
		this.writeFlag = true;
	}
	
	public void start(){
		this.timer.schedule(this.timeTask,0,this.frequency*1000);
	}
	
	public void write() throws SQLException, java.text.ParseException{
		if(this.writeFlag){
			//this.timer.cancel();
			this.airQ.refreshTodayData();
			StringBuilder sb = new StringBuilder();
			sb.append("insert into placeAirQ (`placeId`,`date`,`pm25`,`pm10`,`chinaAirIndex`,`AmericanAirIndex`,`unixTimeStamp`) values ('");
			sb.append(this.airQ.placeId).append("','");
			sb.append(this.airQ.date).append("','");
			sb.append(this.airQ.pm2_5).append("','");
			sb.append(this.airQ.pm10).append("','");
			sb.append(this.airQ.ChinaAirIndex).append("','");
			sb.append(this.airQ.AmericanAirIndex).append("','");
			sb.append(DateFormat.simpleDateFormatWithoutSecond.parse(this.airQ.date).getTime()/1000).append("')");// division means remove end three
			MysqlConnect.conn.createStatement().execute(sb.toString());
			this.writeFlag=false;
		}
	}
	
	
	
}
