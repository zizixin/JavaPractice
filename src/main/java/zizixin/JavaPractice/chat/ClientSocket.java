package zizixin.JavaPractice.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.Socket;
import java.util.Scanner;

import org.apache.hadoop.mapred.machines_jsp;

public class ClientSocket {

	public static void main(String[] args) {
		
		Socket socket;
		try {
			socket = new Socket("localhost",10088);
			System.out.println("client open a socket,which socket is"+socket);
			
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			new Thread(new Runnable() {
				public void run() {
					while(true){
						char[] buffer = new char[300];
						try {
							reader.read(buffer);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println(buffer);
					}
				}
			}).start();
			
			
			OutputStream os = socket.getOutputStream();//字节输出流
			PrintWriter pw =new PrintWriter(os);//将输出流包装成打印流
			pw.write("用户名：admin；密码：123 get enough length data");
			pw.flush();
			Scanner scanner = new Scanner(System.in);
			while(true){
				String next = scanner.next();
				pw.write(next);
				pw.flush();
			}
			
			//socket.shutdownOutput();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//2、获取输出流，向服务器端发送信息
		
		
		
		
	}
}
