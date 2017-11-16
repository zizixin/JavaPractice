package zizixin.JavaPractice.getPlace;


import java.io.IOException;
import java.util.ArrayList;

import org.apache.http.Consts;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import zizixin.JavaPractice.util.GetFileContent;
import zizixin.JavaPractice.util.SetFileContent;


@Deprecated
public class GetAirQDeprecated implements GetData{
 
	public static void main(String[] args) {
		
		HttpClient httpClient = HttpClients.createDefault();
		
		HttpGet getChengduAirQ = new HttpGet(Constant.CHENGDUAIRQ);
		
		ArrayList<String> placeArray = new ArrayList<String>();
		try {
			HttpResponse response = httpClient.execute(getChengduAirQ);
			
			//Document doc = Jsoup.parse(EntityUtils.toString(response.getEntity(),Consts.UTF_8));
			
			Document doc = Jsoup.parse(GetFileContent.getFileContent("C:/Users/marvinpeng/Desktop/folder/test.html", new StringBuilder()));
			
			int count = 0;
			
			for(Element element:doc.getElementsByAttributeValue("class", "city_province_item")){
				
				placeArray.add(element.childNode(1).childNode(1).childNode(0).toString());
				
				count ++;
			}
			
			for(Element element:doc.getElementsByAttributeValue("class", "city_province_item city_province_special")){
				
				placeArray.add(element.childNode(1).childNode(1).childNode(0).toString());
				
				count ++;
				
			}
			
			//System.out.println(doc);
			System.out.println(placeArray);
			
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
