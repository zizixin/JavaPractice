package zizixin.JavaPractice.chat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ChatThread implements Runnable{

	
	public ChatThread(Socket socket){
		this.socket = socket;
	}
	
	public Socket socket;
	
	
	
	@Override
	public void run() {
		System.out.println("i get this socket as my Member variables,whick socket is"+this.socket.toString());
		while(true){
			try {
				Thread.sleep(1000);
				//InputStream inputStream = socket.getInputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
				
				
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(this.socket.getOutputStream()));
				
				new Thread(new Runnable() {
					public void run() {
						while(true){
							
							OutputStream os = null;
							try {
								os = ChatThread.this.socket.getOutputStream();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}//字节输出流
							PrintWriter pw =new PrintWriter(os);//将输出流包装成打印流
							pw.write("this is server give you comeback info");
							pw.flush();
							Scanner scanner = new Scanner(System.in);
							while(true){
								String next = scanner.next();
								pw.write(next);
								pw.flush();
							}
							
						}
					}
				}).start();
				
				
//				String ch;
//				while ((ch = br.readLine())!=null) {
//			    	System.out.println(ch);
//			    }
				String s = "";
				while(!s.equals("bye")){
					char[] temp = new char[100];
					br.read(temp);
					s = String.valueOf(temp);
					System.out.println(s);
				}
				
				while(true){
//					System.out.println("run code to while(true)");
//					Thread.sleep(10000);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			} catch (IOException e) {
				e.printStackTrace();
				break;
			}
		}
	}

}
