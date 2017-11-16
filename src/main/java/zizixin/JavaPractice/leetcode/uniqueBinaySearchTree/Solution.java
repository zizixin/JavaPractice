package zizixin.JavaPractice.leetcode.uniqueBinaySearchTree;

public class Solution {
	/**
	 * @param n
	 * @return
	 * nice method
	 */
	public int numTrees(int n) {
	    int [] dp = new int[n+1];
	    dp[0]= 1;
	    dp[1] = 1;
	    for(int level = 2; level <=n; level++)
	        for(int root = 1; root<=level; root++)
	            dp[level] += dp[level-root]*dp[root-1];
	    return dp[n];
	}
	
	public static void main(String[] args) {
		
		System.out.println(new Solution().numTrees(1));
		
	}
}
