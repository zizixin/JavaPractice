package chatTurbo;

import java.net.Socket;

public class User {

	public String userName;
	
	public String password;
	
	public Integer userId;
	
	public Socket socket;
	
	public User(Socket socket){
		this.socket = socket; 
	}

	public User(String userName,Socket socket){
		this.socket = socket;
		this.userName = userName;
	}
	
}
