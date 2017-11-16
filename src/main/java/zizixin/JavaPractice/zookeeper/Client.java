package zizixin.JavaPractice.zookeeper;

import zizixin.JavaPractice.RMI.HelloService;

public class Client {
	 
    public static void main(String[] args) throws Exception {
        ServiceConsumer consumer = new ServiceConsumer();
 
        while (true) {
            HelloService helloService = consumer.lookup();
            String result = helloService.sayHi("Jack");
            System.out.println(result);
            Thread.sleep(3000);
        }
    }
}
