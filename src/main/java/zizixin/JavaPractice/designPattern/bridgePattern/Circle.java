package zizixin.JavaPractice.designPattern.bridgePattern;

public class Circle extends Shape
{
	public  Circle(int x,int y,int radius,DrawApi drawApi){
		super(drawApi);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public int x;
	
	public int y;
	
	public int radius;
	
	@Override
	public void draw() {
		drawApi.drawCircle(this.x,this.y,this.radius);
	}

}
