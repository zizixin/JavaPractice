package zizixin.JavaPractice.designPattern.strategyPattern;

public class AddStrategy implements Strategy{

	@Override
	public int doOperation(int numOne, int numTwo) {
		return numOne+numTwo;
	}

	@Override
	public String toString() {
		return "add strategy";
	}
}
