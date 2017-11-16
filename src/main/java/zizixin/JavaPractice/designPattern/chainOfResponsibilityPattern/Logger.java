package zizixin.JavaPractice.designPattern.chainOfResponsibilityPattern;

public class Logger extends AbstractLogger{

	public String loggerName;
	
	private Boolean chainEnable = true;
	
	public Logger(String loggerName,int level,AbstractLogger nextLogger){
		super.level = level;
		this.loggerName = loggerName;
		super.nextLogger = nextLogger;
	}
	
	public Logger(String loggerName,int level){
		super.level = level;
		this.loggerName = loggerName;
	}
	
	public void setNextLogger(AbstractLogger nextLogge){
		super.nextLogger = nextLogge;
	}
	
	@Override
	public void write(String message) {
		System.out.println(loggerName+message);
	}

	@Override
	public Boolean chainEnable() {
		// TODO Auto-generated method stub
		return this.chainEnable;
	}

	public Boolean getChainEnable() {
		return chainEnable;
	}

	public void setChainEnable(Boolean chainEnable) {
		this.chainEnable = chainEnable;
	}

}
