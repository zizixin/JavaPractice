package zizixin.JavaPractice.JdkFeature.InetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {

		public static void main(String[] args) {
			
			try {
				
				int[] a = new int[]{1,2};
				
			
				InetAddress inetAddress = InetAddress.getLocalHost();
				
				InetAddress inetAddress2 = InetAddress.getByName("www.baidu.com");
				
				output(inetAddress2.getHostAddress());
				
				output(inetAddress.getHostName());
				
				output(inetAddress.getHostAddress());
				
				InetAddress ec2Address = InetAddress.getByAddress(new byte[]{10,10,104,107});
				
				output(ec2Address.getHostName());
				
				
				
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		public static void output(Object obj){
			System.out.println(obj.toString());
		}
}
