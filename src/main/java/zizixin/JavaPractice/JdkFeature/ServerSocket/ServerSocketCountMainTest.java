package zizixin.JavaPractice.JdkFeature.ServerSocket;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketCountMainTest {

	public static int count;
	
	public static void main(String[] args) {
		
		try {
			ServerSocket serverSocket =new ServerSocket(10086);//1024-65535的某个端口
			while(true){
				Socket socket = serverSocket.accept();
				new Thread(new ServerThread(socket)).start(); 
				count++;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace(System.err);
		}
		
	}
	

}
