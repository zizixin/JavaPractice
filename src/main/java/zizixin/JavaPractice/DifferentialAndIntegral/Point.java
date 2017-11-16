package zizixin.JavaPractice.DifferentialAndIntegral;

public class Point {

	public double x;
	
	public double y;
	
	public static Point pointPrime = new Point(0.0,0.0);
	
	public Point(double x,double y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Point)) {
			return false;
		}
		Point temp = (Point) obj;
		if(this.x == temp.x && this.y == temp.y){
			return true;
		}
		return false;
	}
}
