package zizixin.JavaPractice.Jedis;

import java.util.Set;

import redis.clients.jedis.Jedis;

public class JedisMain {

	public static void main(String[] args) {
		Jedis testJedis = new Jedis("127.0.0.1",6379);
		
		System.out.println(testJedis.isConnected());
		
		testJedis.set("keyOne", "valueOne");
		testJedis.set("keyTwo", "valueTwo");
		
		testJedis.set("keyFromJavaJedis", "valueTemp");
		
		System.out.println(testJedis.get("keyFromJavaJedis"));
		
		Jedis testJedisWrongPort = new Jedis("127.0.0.1",8088);
		
		testJedisWrongPort.set("keyFromJavaJedis", "valueTemp");
		
		System.out.println(testJedisWrongPort.get("keyFromJavaJedis"));
		
		System.out.println(testJedisWrongPort.isConnected());
		
		Set<String> keys = testJedis.keys("");
		while(keys.iterator().hasNext()){
			System.out.println(keys.iterator().next());
		}
		
	}
}
