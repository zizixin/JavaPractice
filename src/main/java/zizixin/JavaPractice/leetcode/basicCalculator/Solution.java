package zizixin.JavaPractice.leetcode.basicCalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
	
	public static final Character addition = '+'; 
	
	public static final Character subtraction = '-';
	
	public static final Character bracketsLeft = '('; 
	
	public static final Character bracketsRight = ')';
	
	public static final Character negativeFlag = 'p';
	
    public int calculate(String s){
    	try {
    		if(s==null){
        		return 0;
        	}
        	char[] inputStringChar = s.toCharArray();
        	int charIndex = 0;
        	Stack<String> stackValue = new Stack<String>();
        	int sum = 0;
        	StringBuilder sb = new StringBuilder();
        	while(charIndex < inputStringChar.length){
        		Character operateChar = inputStringChar[charIndex];
        		if(operateChar.equals(Solution.bracketsLeft)){
        			stackValue.push(sb.toString());
        			sb = new StringBuilder();
        			charIndex++;
        		}
        		else if(operateChar.equals(Solution.bracketsRight)){
        			sb = new StringBuilder(stackValue.pop().toString()+calculateNoBraketString(sb.toString()));
        			charIndex++;
        		}
        		else{
        			sb.append(operateChar);
        			charIndex++;
        		}
        	}
        	return decodeNegativeFlag(calculateNoBraketString(sb.toString()));
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
    	
    }
    
    
    public static String calculateNoBraketString(String calculateString) throws Exception{
    	
    	String[] withOperateSplit = calculateString.split("[+,-]");
    	char[] values = calculateString.toCharArray();
    	int charIndex = 0;
    	List<Character> oprateStack = new ArrayList<Character>();
    	for(Character temp:values){
    		if(temp.equals('+')||temp.equals('-')){
    			oprateStack.add(temp);
    		}
    	}
    	int sum = Integer.valueOf(decodeNegativeFlag(withOperateSplit[0].trim()));
    	for(int i=0;i<withOperateSplit.length-1;i++){
    		if(oprateStack.get(i).equals('+')){
    			sum = sum + Integer.valueOf(decodeNegativeFlag(withOperateSplit[i+1].trim()));
    		}else{
    			sum = sum - Integer.valueOf(decodeNegativeFlag(withOperateSplit[i+1].trim()));
    		}
    	}
    	return setNegativeFlagForCalculateResult(sum);
    }
    
    public static  String setNegativeFlagForCalculateResult(Integer result){
    	if(result<0){
    		return String.valueOf(Solution.negativeFlag) + String.valueOf(result).substring(1);
    	}else{
    		return result.toString();
    	}
    	 
    }
    
    public static Integer decodeNegativeFlag(String targetString){
    	if(targetString.startsWith("p")){
    		return 0-Integer.valueOf(targetString.substring(1));
    	}else{
    		return Integer.valueOf(targetString);
    	}
    }
    
    public static void main(String[] args) {
		System.out.println(new Solution().calculate("(5-(1+(5)))"));
    	//String a = "p123";
	}
}