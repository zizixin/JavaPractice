package zizixin.JavaPractice.designPattern.interpreterPattern;

public class AndInterpreter implements Interpreter{

	public Interpreter expOne;
	
	public Interpreter expTwo;

	public AndInterpreter(Interpreter expOne,Interpreter expTwo){
		this.expOne = expOne;
		this.expTwo = expTwo;
	}
	
	@Override
	public Boolean interpreter(String context) {
		return this.expOne.interpreter(context)&&this.expTwo.interpreter(context);
	}

}
