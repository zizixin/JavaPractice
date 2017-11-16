package JavaPractice.leetcode.CountNumbersWithUniqueDigits;


public class Solution {
    
	 public int countNumbersWithUniqueDigits(int n) {
		
		 if(n==0){
			 return 1;
		 }else{
			 int temp = 9;
			 for(int i = 1;i<n;i++){
				 temp = temp * (10-i);
			 }
			 return temp+countNumbersWithUniqueDigits(n-1);
		 }
		 
	 }
	
    public static void main(String[] args) {
		System.out.println(new Solution().countNumbersWithUniqueDigits(2));
	}
}