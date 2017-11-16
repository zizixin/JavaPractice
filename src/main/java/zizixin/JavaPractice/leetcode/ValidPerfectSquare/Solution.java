package JavaPractice.leetcode.ValidPerfectSquare;

public class Solution {
	
	public boolean isPerfectSquare(int num) {
		int low = 1;
 		int high = num;
		
		while(low <= high){
			long middle = (low+high) >>>1;
			if(middle*middle==num){
				return true;
			}else if(middle*middle>num){
				high = (int) (middle -1);
			}else{
				low = (int) (middle +1);
			}
		}
		return false;
    }
	
	
	public static void main(String[] args) {
		System.out.println(new Solution().isPerfectSquare(1));
	}
}
