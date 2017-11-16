package zizixin.JavaPractice.designPattern.interpreterPattern;

public class OrInterpreter implements Interpreter{

	public Interpreter expOne;
	
	public Interpreter expTwo;

	public OrInterpreter(Interpreter expOne,Interpreter expTwo){
		this.expOne = expOne;
		this.expTwo = expTwo;
	}
	
	@Override
	public Boolean interpreter(String context) {
		return expOne.interpreter(context)||expTwo.interpreter(context);
	}
	
}
