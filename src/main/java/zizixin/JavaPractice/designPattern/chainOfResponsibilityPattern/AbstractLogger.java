package zizixin.JavaPractice.designPattern.chainOfResponsibilityPattern;

/**
 * @author zizixin
 * 责任链模式是行为型模式
 */
public abstract class AbstractLogger {

	int level;
	
	AbstractLogger nextLogger;
	
	public void setNextLogger(AbstractLogger abstractLogger){
		this.nextLogger = abstractLogger;
	}
	
	/**
	 * @param level level
	 * @param message message
	 * 通过责任链抽象一层出来
	 */
	public void loggerMessage(int level,String message){
		if(this.level <= level){
			write(message);
		}else if(chainEnable()){
			if(this.nextLogger!=null){
				this.nextLogger.loggerMessage(level,message);
			}
			else{
				System.out.println("this logger can not logger this info in now situation!!");
			}
		}else{
			System.out.println("this logger can not logger this info in now situation!!");
		}
	}
	
	/**
	 * @param message
	 *  打印日志本生的方法
	 */
	public abstract void write(String message);
	
	public abstract Boolean chainEnable();
}
