package zizixin.JavaPractice.JdkFeature.rpc;

import java.io.IOException;
import java.net.InetSocketAddress;

public class RPCTest {
	 
    public static void main(String[] args) throws IOException {
        new Thread(new Runnable() {
            public void run() {
                Server serviceServer = new ServiceCenter(10010);
				serviceServer.register(SayHi.class, SayHiImpl.class);
				try {
					serviceServer.start();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        }).start();
        SayHi service = RPCClient.getRemoteProxyObj(SayHi.class, new InetSocketAddress("localhost", 10010));
       service.sayHi();
    }
}