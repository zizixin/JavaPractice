package zizixin.JavaPractice.designPattern.chainOfResponsibilityPattern;

import zizixin.JavaPractice.designPattern.Demo;

/**
 * @author zizixin
 * 日志记录器本生的等级，和该条日志的等级做对比
 */
public class ChainOfResponsibilityPatternDemo implements Demo{

	@Override
	public void show() throws Exception {
		Logger infoLogger = new Logger("info logger", 2);
		
		Logger debugLogger = new Logger("debug logger",1);
		
		Logger errorLogger = new Logger("error logger", 3);
		
		//取理解一下为什么这个用子类的变量去设置类的值不会报错
		debugLogger.setNextLogger(null);
		
		errorLogger.setNextLogger(debugLogger);
		
		infoLogger.setNextLogger(debugLogger);
		
		infoLogger.setChainEnable(false);
		
		infoLogger.loggerMessage(3,"error message");
		
		infoLogger.loggerMessage(2,"info message");
		
		infoLogger.loggerMessage(1, "debug message");
	}

	public static void main(String[] args) {
		try {
			new ChainOfResponsibilityPatternDemo().show();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
