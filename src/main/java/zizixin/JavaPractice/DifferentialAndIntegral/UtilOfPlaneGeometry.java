package zizixin.JavaPractice.DifferentialAndIntegral;

public class UtilOfPlaneGeometry {

	private UtilOfPlaneGeometry(){
	}
	
	public static double getTwoPointDistance(Point pointOne,Point pointTwo){
		if(pointOne == null|| pointTwo == null){
			return 0.0;
		}
		if(pointOne.equals(pointTwo)){
			return 0.0;
		}
		double xDiff = Math.abs(pointOne.x-pointTwo.x);
		double yDiff = Math.abs(pointOne.y-pointTwo.y);
		return Math.sqrt(xDiff*xDiff+yDiff*yDiff);
	} 
}
