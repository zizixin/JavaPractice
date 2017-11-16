package zizixin.JavaPractice.designPattern.factoryPattern;

import zizixin.JavaPractice.designPattern.Demo;

public class FactoryPatternDemo implements Demo{

	private FactoryPatternDemo(){
		super();
	}
	
	public static FactoryPatternDemo instance = new FactoryPatternDemo();
	
	@Override
	public void show() throws Exception {
		System.out.println("FactoryPattern demo");
		
		DoSomeThingFactory.getDoSomeThing("one").zizixin();
		
		DoSomeThingFactory.getDoSomeThing("two").zizixin();
		
		System.out.println("FactoryPattern demo end!");
	}

}
