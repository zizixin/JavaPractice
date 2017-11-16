package zizixin.JavaPractice.JdkFeature.ServerSocket;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerThread implements Runnable{
	
	public Socket socket;
	
	
	public ServerThread(Socket socket){
		this.socket = socket;
	}
	
	public void run() {
		try {
			
			InputStream is = socket.getInputStream();
			
			InputStreamReader isr =new InputStreamReader(is);
			
			BufferedReader br =new BufferedReader(isr);
			
			String info = null;
			while((info=br.readLine())!=null){
				System.out.println("我是服务器，客户端说："+info);
			}
			socket.shutdownInput();//关闭输入流
			
			//4、获取输出流，响应客户端的请求
			OutputStream os = socket.getOutputStream();
			
			PrintWriter pw = new PrintWriter(os);
			
			pw.write("欢迎您！");
			pw.flush();
			socket.close();
			is.close();
			isr.close();
			br.close();
			os.close();
			pw.close();
			Thread.sleep(10000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}