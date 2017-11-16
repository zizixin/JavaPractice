package zizixin.JavaPractice.designPattern.bridgePattern;

public class DrawRedCircle implements DrawApi{

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("draw red circle at"+x+":"+y+",which radius is"+radius);
	}

}
