package zizixin.JavaPractice.designPattern.abstractFactoryPattern;

public class RunFactory extends AbstarctFatory{

	public static String car = "car";
	
	public static String boat = "boat";
	
	@Override
	public Fly getFly(String flyType) throws Exception {
		throw new Exception("can not product what you need,sorry about that!!");
	}

	@Override
	public Run getRun(String runType) throws Exception {
		if(runType==null){
			throw new Exception("flytype can not ne null");
		}
		
		if(runType.equals(RunFactory.car)){
			return new Car();
		}
		if(runType.equals(RunFactory.boat)){
			return new Boat();
		}
		throw new Exception("can not product what you need,sorry about that");
	}

}
