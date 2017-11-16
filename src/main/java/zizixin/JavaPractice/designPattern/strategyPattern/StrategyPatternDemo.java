package zizixin.JavaPractice.designPattern.strategyPattern;

import zizixin.JavaPractice.designPattern.Demo;

public class StrategyPatternDemo implements Demo{

	@Override
	public void show() throws Exception {
		int numOne = 1;
		int numTwo = 2;
		Context context = new Context(null);
		
		Strategy addStrategy = new AddStrategy();
		context.setStrategy(addStrategy);
		System.out.println(context.doOperation(numOne, numTwo));
		
		Strategy subStrategy = new SubStrategy();
		context.setStrategy(subStrategy);
		System.out.println(context.doOperation(numOne, numTwo));
	}

	public static void main(String[] args) {
		try {
			new StrategyPatternDemo().show();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
