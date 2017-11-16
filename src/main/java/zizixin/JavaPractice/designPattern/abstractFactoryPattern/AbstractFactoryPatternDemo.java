package zizixin.JavaPractice.designPattern.abstractFactoryPattern;

import zizixin.JavaPractice.designPattern.Demo;

public class AbstractFactoryPatternDemo implements Demo{

	private AbstractFactoryPatternDemo(){
		super();
	}
	
	public static AbstractFactoryPatternDemo instance = new AbstractFactoryPatternDemo();
	
	@Override
	public void show() throws Exception {
		
		System.out.println("abstractFactoryPatternDemo begain");
		AbstarctFatory flyFactory = FactoryGenerate.getFactory("fly");
		flyFactory.getFly("plane").youAreFly();
		flyFactory.getFly("spacecraft").youAreFly();
		
		AbstarctFatory runFactory = FactoryGenerate.getFactory("run");
		runFactory.getRun("car").youAreRun();
		runFactory.getRun("boat").youAreRun();
		System.out.println("abstractFactoryPatternDemo end");
	}

}
