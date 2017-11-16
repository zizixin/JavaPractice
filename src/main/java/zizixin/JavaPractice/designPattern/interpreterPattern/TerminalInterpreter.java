package zizixin.JavaPractice.designPattern.interpreterPattern;

public class TerminalInterpreter implements Interpreter{

	public String data;
	
	public TerminalInterpreter(String data){
		this.data = data;
	}
	
	@Override
	public Boolean interpreter(String context) {
		if(context.contains(this.data)){
			return true;
		}else{
			return false;
		}
	}

}
