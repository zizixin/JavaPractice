package chatTurbo;




import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestSocket {

	Logger testSocketLogger = LoggerFactory.getLogger(TestSocket.class);
	
	public int port = 10086;
	
	public TestSocket(int port){
		this.port = port;
	}
	
	public static void main(String[] args) {
		TestSocket testSocket = new TestSocket(10086);
		try {
		
			testSocket.startSocketServer();
			testSocket.startAClient("marinpeng");
			testSocket.startAClient("marvinpeng2");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void startSocketServer(){
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					ServerSocket socketServer = new ServerSocket(TestSocket.this.port);
					
					testSocketLogger.info("socker server have started,and listen port: "+port);
					while(true){
						socketServer.accept();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}).start();
		
	}
	
	public void startAClient(final String clientName) throws UnknownHostException, IOException{
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				Socket socket = null;
				try {
					socket = new Socket("localhost",TestSocket.this.port);
				} catch (UnknownHostException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				testSocketLogger.info("socket have started socket info is "+socket.toString());
				testSocketLogger.info(clientName);
				while(true){
					//to made this thread not end
				}
			}
		}).start();
	}
}
