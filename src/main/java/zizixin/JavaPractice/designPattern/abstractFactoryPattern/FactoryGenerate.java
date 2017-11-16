package zizixin.JavaPractice.designPattern.abstractFactoryPattern;

public class FactoryGenerate {

	public static String fly = "fly";
	
	public static String run = "run";
	
	public static AbstarctFatory getFactory(String factoryType) throws Exception{
		if(factoryType == null){
			throw new Exception("factoryType can not be null");
		}
		if(factoryType.equals(FactoryGenerate.fly)){
			return new FlyFatory();
		}
		if(factoryType.equals(FactoryGenerate.run)){
			return new RunFactory();
		}
		throw new Exception("can not product what you need,sorry about that");
	}
	
}
