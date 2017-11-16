package zizixin.JavaPractice.myOwnJavaIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketTest {

	public static void main(String[] args) {
		
		ServerSocket server = null;
		Socket socket = null;
		try {
			server = new ServerSocket(10086);
			socket = server.accept();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		try {
//			BufferedReader inputStream = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//			String request;
//			while((request=inputStream.readLine())!=null){
//				for(int i =0;i<5;i++){
//					try {
//						Thread.sleep(1000);
//						System.out.println(i);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
//				System.out.println(request+"socket"+socket.toString());
//			}
//			System.out.println("print this info for debug");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
