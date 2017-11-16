package zizixin.JavaPractice.designPattern.factoryPattern;

public class DoSomeThingFactory{

	private static String one = "one";
	
	private static String two = "two";
	
	public static DoSomeThing getDoSomeThing(String type) throws Exception{
		
		if(type == null){
			throw new Exception("type can not be null!");
		}
		
		if(type.equals(DoSomeThingFactory.one)){
			return new DoSomeThingOne();
		}
		
		if(type.equals(DoSomeThingFactory.two)){
			return new DoSomeThingTwo();
		}
		
		throw new Exception("this factory can not product what you want!sorry about that!");
	}
	
}
