package zizixin.JavaPractice.JdkFeature.rpc;

import org.apache.log4j.Logger;



public class SayHiImpl implements SayHi{

	
	private static Logger logger = 	Logger.getLogger(SayHiImpl.class);
	
	@Override
	public void sayHi() {
		
		logger.info("hello in one service!");
		System.out.println("hello there");
	}

}
