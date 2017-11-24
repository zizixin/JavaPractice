package chatTurbo;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SocketServerProcess {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public ServerSocket serverSocket;
	
	public Integer count;
	
	public HashMap<String,Socket> socketContainer;
	
	public SocketServerProcess(int port) throws IOException{
		ServerSocket serverSocket = new ServerSocket(port);
	}
	
	public void init() throws IOException{
		while(true){
			Socket socket = serverSocket.accept();
			count++;
			
			//this.socketContainer.put(socket.getInetAddress(), null);
			logger.info("one socket have init"+socket.toString());
		}
		
	}
	
}
