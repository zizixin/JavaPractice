package zizixin.JavaPractice.designPattern.facadePattern;

import zizixin.JavaPractice.designPattern.Demo;

public class FacadePatternDemo implements Demo{

	@Override
	public void show() throws Exception {
		ShapeMaker shapeMaker = new ShapeMaker();
		
		shapeMaker.drawCircle();
		
		shapeMaker.drawSquare();
		
		shapeMaker.drawRectangle();
	}

	public static void main(String[] args) {
		try {
			new FacadePatternDemo().show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
