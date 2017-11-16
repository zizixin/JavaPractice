package zizixin.JavaPractice.DifferentialAndIntegral;

/**
 * @author zizixin
 * there are two solution about vaild,one is use a isVaild members vairable,one is use exception,but exception in Constructor method is not a Encourage suggestions
 *
 *
 */
public class Triangle {

	
	public Point pointOne;
	
	public Point pointTwo;
	
	public Point pointThree;
	
	public Boolean isVaild;
	
	public double[] getThreeEdge() throws ThriangleNotVaildException{
		if(!isVaild){
			throw new ThriangleNotVaildException();
		}
		double[] edges = new double[3];
		edges[0] = UtilOfPlaneGeometry.getTwoPointDistance(this.pointOne,this.pointTwo);
		edges[1] = UtilOfPlaneGeometry.getTwoPointDistance(this.pointOne,this.pointThree);
		edges[2] = UtilOfPlaneGeometry.getTwoPointDistance(this.pointTwo,this.pointThree);
		return edges;
	}
	
	
	public Triangle(){
		this(Point.pointPrime, Point.pointPrime, Point.pointPrime);
	}
	
	public Triangle(Point pointOne,Point pointTwo,Point pointThree){
		this.pointOne = pointOne;
		this.pointTwo = pointTwo;
		this.pointThree = pointThree;
		this.isVaildTriangle();
	}
	
	
	public Boolean isVaildTriangle(){
		if(this.pointOne.x==this.pointTwo.x&&this.pointOne.x==this.pointThree.x){
			this.isVaild = false;
			return this.isVaild;
		}
		if(this.pointOne.y==this.pointTwo.y&&this.pointOne.y==this.pointThree.y){
			this.isVaild = false;
			return this.isVaild;
		}
		return this.isVaild;
	}
	
	public static void main(String[] args) {
		Triangle scopeTiangle = null;
		try {
			scopeTiangle= new Triangle();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println(scopeTiangle.toString());
			System.out.println("for debug");
		}
	}
}
