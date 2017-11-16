package zizixin.JavaPractice.leetcode.uniqueBinaySearchTree;

public class SolutionMyOwn {

	public int numTrees(int n){
		int dp[] = new int [n+1];
		dp[0] = 1;//mock empty childNode
		dp[1] = 1;
		for(int level=2;level <=n;level ++){
			for(int count=1;count<=level;count++){
				dp[level] +=dp[level-count]*dp[count-1];
			}
		}
		return dp[n];
	}
}
