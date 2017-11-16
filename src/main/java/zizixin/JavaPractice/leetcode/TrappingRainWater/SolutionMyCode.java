package JavaPractice.leetcode.TrappingRainWater;

public class SolutionMyCode {

	public int trap(int[] height) {
		int a = 0;
		int b = height.length -1;
		int max = 0;
		int leftMax = 0;
		int rightMax = 0;
		while(a<=b){
			leftMax = Math.max(leftMax, height[a]);
			rightMax = Math.max(rightMax, height[b]);
			if(leftMax<rightMax){
				max = max + leftMax - height[a];
				a++;
			}else{
				max =max + rightMax - height[b];
				b--;
			}
		}
		return max;
	}
	
}
