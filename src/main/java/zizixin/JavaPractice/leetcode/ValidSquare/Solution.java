package zizixin.JavaPractice.leetcode.ValidSquare;

public class Solution {

	public int[] pointOne;
	
	public int[] pointTwo;
	
	public int[] pointThree;
	
	public int[] pointFour;
	
	
	public Solution(){
		
	}
	
	public Solution(int[] pointOne,int[] pointTwo,int[] pointThree,int[] pointFour){
		this.pointOne = pointOne;
		this.pointTwo = pointTwo;
		this.pointThree = pointThree;
		this.pointFour = pointFour;
	}
	
	
	public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
	        return new Solution(p1, p2, p3, p4).isValild();
	}
	
	public boolean isValild(){
		Line[] lines = new Line[6];
		lines[0] = new Line(this.pointOne,this.pointTwo);
		lines[1] = new Line(this.pointOne,this.pointThree);
		lines[2] = new Line(this.pointOne,this.pointFour);
		lines[3] = new Line(this.pointTwo,this.pointThree);
		lines[4] = new Line(this.pointTwo,this.pointFour);
		lines[5] = new Line(this.pointThree,this.pointFour);
		double tempLine = lines[0].instance;
		double tempDiagonal;
		double[] lineArray = new double[6];
		for(int i=0;i<lineArray.length;i++){
			lineArray[i] = lines[i].instance;
			if(lineArray[i]==0.0){
				return false;
			}
		}
		double maxLine = lineArray[0];
		double odinaryLine = lineArray[1];
		for(int i=0;i<5;i++){
			if(lineArray[i]<lineArray[i+1]){
				maxLine = lineArray[i+1];
				odinaryLine = lineArray[i];
				break;
			}
		}
		int countMax = 0;
		int countOdinarLine = 0;
		for(int i=0;i<6;i++){
			if(lineArray[i]==maxLine){
				countMax++;
			}else if(lineArray[i]==odinaryLine){
				countOdinarLine++;
			}else{
				return false;
			}
		}
		System.out.println(countMax);
		System.out.println(countOdinarLine);
		return true;
	}
	
	public static void main(String[] args) {
		new Solution().validSquare(new int[]{-1,-1}, new int[]{-1,1}, new int[]{1,-1}, new int[]{1,1});
	}
	
	static class Line{
		private int [] pointOne;
		
		private int [] pointTwo;
		
		public double instance;
		
		public Line(int [] pointOne,int [] pointTwo){
			this.pointOne = pointOne;
			this.pointTwo = pointTwo;
			this.instance = Math.sqrt(Math.pow(this.pointTwo[0]-this.pointOne[0],2)+Math.pow(this.pointTwo[1]-this.pointOne[1], 2));
		}
		
		/* (non-Javadoc)
		 * @see java.lang.Object#equals(java.lang.Object)
		 * 
		 */
		@Override
		public boolean equals(Object obj) {
			if(!(obj instanceof Line)){
				return false;
			}else{
				Line targetLine = (Line)obj;
				if(targetLine.pointOne[0]==this.pointOne[0]&&targetLine.pointOne[1]==this.pointOne[1]){
					if(targetLine.pointTwo[0]==this.pointTwo[0]&&targetLine.pointTwo[1]==this.pointTwo[1]){
						return true;
					}else{
						return false;
					}
				}else if(targetLine.pointOne[0]==this.pointOne[0]&&targetLine.pointTwo[1]==this.pointTwo[1]){
					if(targetLine.pointTwo[0]==this.pointOne[0]&&targetLine.pointTwo[1]==this.pointOne[1]){
						return true;
					}else{
						return false;
					}
				}else{
					return false;
				}
				
				
			}
			
		}
	}
	
}
