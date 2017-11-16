package zizixin.JavaPractice.getPlace;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import zizixin.JavaPractice.util.GetFileContent;

public class GetPlaceUrl {

	public static void main(String[] args) {
		
		HttpClient httpClient = HttpClients.createDefault();
		
		HttpGet getChengduAirQ = new HttpGet(Constant.CHENGDUAIRQ);
		
		ArrayList<PlaceUrl> placeArray = new ArrayList<PlaceUrl>();
		try {
			HttpResponse response = httpClient.execute(getChengduAirQ);
			
			//Document doc = Jsoup.parse(EntityUtils.toString(response.getEntity(),Consts.UTF_8));
			
			Document doc = Jsoup.parse(GetFileContent.getFileContent("C:/Users/marvinpeng/Desktop/folder/test.html", new StringBuilder()));
			
			for(Element elementTempOne:doc.getElementsByAttributeValue("class", "city_province_item")){
				
				for(Element elementTempTwo:elementTempOne.getElementsByTag("a")){
					PlaceUrl placeUrl = new PlaceUrl();
					placeUrl.setPlaceUrl(elementTempTwo.attr("href"));
					placeUrl.setPlaceName(elementTempTwo.text());
					placeArray.add(placeUrl);
				}
			}
			
			for(Element elementTempOne:doc.getElementsByAttributeValue("class", "city_province_item city_province_special")){
					//placeArray.add(elementTempOne.childNode(1).childNode(1).childNode(0).toString());
					
					for(Element elementTempTwo:elementTempOne.getElementsByTag("a")){
						PlaceUrl placeUrl = new PlaceUrl();
						placeUrl.setPlaceUrl(elementTempTwo.attr("href"));
						placeUrl.setPlaceName(elementTempTwo.text());
						placeArray.add(placeUrl);
					}
			}
			
			
			
			//System.out.println(doc);
			for(PlaceUrl placeUrl:placeArray){
				
				System.out.println("placeUrl:"+placeUrl.getPlaceUrl()+"  placename"+placeUrl.getPlaceName());
				StringBuilder sqlBuilder = new StringBuilder();
				sqlBuilder.append("insert into placeUrl (`placeUrl`,`placeName`) values('")
				.append(placeUrl.getPlaceUrl()).append("','")
				.append(placeUrl.getPlaceName()).append("'")
				.append(")");
				
				try {
					
			

					
					sqlBuilder.toString();
					MysqlConnect.conn.createStatement().execute(sqlBuilder.toString());
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			System.out.println(placeArray.size());
			
			
			
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
