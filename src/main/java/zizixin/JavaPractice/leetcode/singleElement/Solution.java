package zizixin.JavaPractice.leetcode.singleElement;

public class Solution {

	
	public int singleNonDuplicate(int[] nums) {
		int primeValue = 0;
		for(int temp:nums){
			primeValue = primeValue ^ temp;
		}
		return primeValue;
    }
	
}
