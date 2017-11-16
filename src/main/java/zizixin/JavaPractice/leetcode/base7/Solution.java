package zizixin.JavaPractice.leetcode.base7;

public class Solution {

//	 public String convertTo7(int num) {
//		 
//		 Boolean negativeflag = false;
//		  if(num==0){
//			  return "0";
//		  }
//		  if(num<0){
//			 negativeflag = true;
//			 num = Math.abs(num);
//		  }
//		  StringBuilder sb = new StringBuilder();
//		  while(num!=0){
//			  sb.append(num%7);
//			  num = num/7;
//		  }
//		  if(negativeflag==true){
//			  return "-"+sb.toString();
//		  }else{
//			  return sb.toString();
//		  }
//	    }
//	 
//	 
//	 public String convertTo7Stand(int num) {
//	        if (num == 0) return "0";
//	        
//	        StringBuilder sb = new StringBuilder();
//	        boolean negative = false;
//	        
//	        if (num < 0) {
//	            negative = true;
//	        }
//	        while (num != 0) {
//	            sb.append(Math.abs(num % 7));
//	            num = num / 7;
//	        }
//	        
//	        if (negative) {
//	            sb.append("-");
//	        }
//	        
//	        return sb.reverse().toString();
//	    }
//	 
	 public static void main(String[] args) {
		System.out.println(new Solution().convertToBase7(-7));
		//System.out.println(new Solution().convertToBase7(-1003));
	}
	
	public String convertToBase7(int num) {
		 
		 Boolean negativeflag = false;
		  if(num==0){
			  return "0";
		  }
		  if(num<0){
			 negativeflag = true;
			 num = Math.abs(num);
		  }
		  StringBuilder sb = new StringBuilder();
		  while(num!=0){
			  sb.append(num%7);
			  num = num/7;
		  }
		  if(negativeflag==true){
			  return "-"+sb.reverse().toString();
		  }else{
			  return sb.reverse().toString();
		  }
    }
	
}
