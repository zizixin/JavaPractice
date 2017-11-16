package zizixin.JavaPractice.leetcode.getMinMinutes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
	
	public static String regex = ":";
	
	public static Integer specilal = 1440;
	
    public int findMinDifference(List<String> timePoints) {
    	if(timePoints==null){
    		return 0;
    	}else{
    		if(timePoints.size()==0){
    			return 0;
    		}else{
    			if(timePoints.size()==1){
    				return Integer.valueOf(timePoints.get(0).split(Solution.regex)[1]);
    			}else{
    				List<Integer> integerValues = new ArrayList<Integer>();
            		for(String tempString:timePoints){
            			integerValues.add(getIntValueOfString(tempString));
            		}
            		Collections.sort(integerValues);
            		int prime = Solution.specilal;
            		int temp;
            		for(int i=1;i<integerValues.size();i++){
            			if((temp = integerValues.get(i)-integerValues.get(i-1))<prime){
            				prime = temp;
            			}
            		}
            		if((temp = Solution.specilal - integerValues.get(integerValues.size()-1)+integerValues.get(0))<prime){
            			prime = temp;
            		}
            		return prime;
    			}
    		}
    		
    	}
        
    }
    
    private int getIntValueOfString(String timeString){
    	String[] timeArray = timeString.split(Solution.regex);
    	return Integer.valueOf(timeArray[0])*60 + Integer.valueOf(timeArray[1]);
    }
    
    public static void main(String[] args) {
    	
    	//["12:12","00:13"]
    	List<String> strings = new ArrayList<>();
    	strings.add("12:12");
    	strings.add("00:13");
		System.out.println(new Solution().findMinDifference(strings));
	}
  
}