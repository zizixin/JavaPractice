package zizixin.JavaPractice.designPattern.strategyPattern;

public class Context {

	private Strategy strategy;
	
	public Context(Strategy strategy){
		this.setStrategy(strategy);
	}
	
	public int doOperation(int numOne,int numTwo){
		int tempNumber = this.getStrategy().doOperation(numOne, numTwo);
		System.out.println(this.getStrategy()+"result is"+tempNumber);
		return tempNumber;
	}

	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
}
