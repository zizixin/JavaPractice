package JavaPractice.leetcode.arrangeCoins;

public class Solution {
    public int arrangeCoins(int n) {
        int left = n;
        int useNumber = 0;
        int levelNumber = 0;
        int count = 0;
        while(left > levelNumber){
        	levelNumber = levelNumber + 1;
        	count++;
        	useNumber = useNumber + levelNumber;
        	left = n - useNumber;
        }
        return count;
    }
}
