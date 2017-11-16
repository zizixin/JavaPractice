package zizixin.JavaPractice.designPattern.abstractFactoryPattern;

public abstract class AbstarctFatory {
	
   public abstract Fly getFly(String flyType) throws Exception;
   
   public abstract Run getRun(String runType) throws Exception;
   
}
