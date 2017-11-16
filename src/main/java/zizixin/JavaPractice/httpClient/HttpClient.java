package zizixin.JavaPractice.httpClient;

import java.io.IOException;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * @author zizixin
 *
 * user for mock HttpClient
 */
public class HttpClient {

		public static void main(String[] args) {
			//HttpClient client = new Http
			HttpGet get = new HttpGet("http://172.17.209.161:10007/factibilidad/obtenerRegiones");
			CloseableHttpClient client = HttpClients.createDefault();
			try {
				CloseableHttpResponse response = client.execute(get);
				System.out.println(EntityUtils.toString(response.getEntity()));
				
				System.out.println("for debug breakpoint!");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
}
