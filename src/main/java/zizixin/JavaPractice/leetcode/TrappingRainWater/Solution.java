package JavaPractice.leetcode.TrappingRainWater;

public class Solution {

	public int trap(int[] height) {
		    int a=0;
		    int b=height.length-1;
		    int max=0;
		    int leftmax=0;
		    int rightmax=0;
		    while(a<=b){
		        leftmax=Math.max(leftmax,height[a]);
		        rightmax=Math.max(rightmax,height[b]);
                if(leftmax<rightmax){
		            max+=(leftmax-height[a]);       // leftmax is smaller than rightmax, so the (leftmax-A[a]) water can be stored
		            a++;
		        }
		        else{
		            max+=(rightmax-height[b]);
		            b--;
		        }
		    }
		    return max;
    }
	
	public static void main(String[] args) {
		int result = new Solution().trap(new int[]{1,2,6,4,2,1});
		System.out.println(result);
	}
	
}
