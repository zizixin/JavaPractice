package zizixin.JavaPractice.myOwnJavaIO;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientSocket {

	
	public static void main(String[] args) {
		
		try {
			Socket socket = new Socket("localhost", 10086);
			OutputStream outputStream = socket.getOutputStream();
			OutputStream standOutPutStream = System.out;
			while(true){
				 try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//outputStream.write(new byte[]{'a','b','c'});
				//outputStream.write("socket输出测试".getBytes());
				PrintWriter pw =new PrintWriter(outputStream);//将输出流包装成打印流
				pw.write("this is the info of main param"+args[0]);
				pw.flush();
				outputStream.write(10);
				standOutPutStream.write("输出测试".getBytes());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
