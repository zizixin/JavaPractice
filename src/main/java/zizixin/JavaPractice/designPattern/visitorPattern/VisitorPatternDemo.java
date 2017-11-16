package zizixin.JavaPractice.designPattern.visitorPattern;

import zizixin.JavaPractice.designPattern.Demo;

public class VisitorPatternDemo implements Demo{

	@Override
	public void show() throws Exception {
		VisitAbility visitor = new VistorOne();
		
		AllowedVisitor homeOne = new HomeOne();
		
		AllowedVisitor homeTwo = new HomeTwo();
		
		homeOne.accept(visitor);
		
		homeTwo.accept(visitor);
	}

	public static void main(String[] args) {
		try {
			new VisitorPatternDemo().show();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
