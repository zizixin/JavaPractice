package zizixin.JavaPractice.designPattern.bridgePattern;

import zizixin.JavaPractice.designPattern.Demo;

public class BridgePatternDemo implements Demo{

	@Override
	public void show() throws Exception {
		Circle greenCircle = new Circle(10, 10, 100, new DrawGreenCircle());
		
		Circle redCircle = new Circle(10,100,10,new DrawRedCircle());
		
		greenCircle.draw();
		
		redCircle.draw();
	}

	
	public static void main(String[] args) {
		BridgePatternDemo demo = new BridgePatternDemo();
		try {
			demo.show();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
