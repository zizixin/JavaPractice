package zizixin.JavaPractice.chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketProcess {
	
	public static Integer count = 0;
	
	public static void main(String[] args) {
		
		try {
			@SuppressWarnings("resource")
   			ServerSocket serverSocket = new ServerSocket(10088);
			while(true){
				Socket socket =  serverSocket.accept();
				count++;
				new Thread(new ChatThread(socket)).start();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
