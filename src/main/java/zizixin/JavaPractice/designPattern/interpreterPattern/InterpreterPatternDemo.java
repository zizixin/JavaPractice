package zizixin.JavaPractice.designPattern.interpreterPattern;

import zizixin.JavaPractice.designPattern.Demo;

public class InterpreterPatternDemo implements Demo{

	public static Interpreter isHero(){
		return new OrInterpreter(new TerminalInterpreter("personA"),new TerminalInterpreter("personB"));
	}
	
	public static Interpreter isHappy(){
		return new AndInterpreter(new TerminalInterpreter("happy"),new TerminalInterpreter("personC"));
	}
	
	
	@Override
	public void show() throws Exception {
		System.out.println("is personA is hero"+InterpreterPatternDemo.isHero().interpreter("personA"));
		
		System.out.println("is personC is happy"+InterpreterPatternDemo.isHappy().interpreter("personC happy"));
	}

	
	public static void main(String[] args) {
		try {
			new InterpreterPatternDemo().show();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
