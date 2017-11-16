package zizixin.JavaPractice.designPattern.bridgePattern;

public class DrawGreenCircle implements DrawApi{

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("draw green circle at"+x+":"+y+",which radius is"+radius);
	}

}
