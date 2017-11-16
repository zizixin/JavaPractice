package zizixin.JavaPractice.designPattern.abstractFactoryPattern;

public class FlyFatory extends AbstarctFatory{

	private static String plane = "plane";
	
	private static String spacecraft = "spacecraft";
	
	@Override
	public Fly getFly(String flyType) throws Exception {
		
		if(flyType==null){
			throw new Exception("flytype can not ne null");
		}
		
		if(flyType.equals(FlyFatory.plane)){
			return new Plane();
		}
		if(flyType.equals(FlyFatory.spacecraft)){
			return new Spacecraft();
		}
		throw new Exception("can not product what you need,sorry about that");
	}

	@Override
	public Run getRun(String runType) throws Exception {
		throw new Exception("can not product what you need,sorry about that");
	}

}
