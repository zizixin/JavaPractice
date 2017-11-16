package zizixin.JavaPractice.leetcode.basicCalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class SolutionTest {
	
	public static final Character addition = '+'; 
	
	public static final Character subtraction = '-';
	
	public static final Character bracketsLeft = '('; 
	
	public static final Character bracketsRight = ')';
	
    public int calculate(String s) throws Exception {
    	
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
    		
    		if(operateChar.equals(SolutionTest.bracketsLeft)){
    			stackValue.push(sb.toString());
    			sb = new StringBuilder();
    			charIndex++;
    		}
    		
    		else if(operateChar.equals(SolutionTest.bracketsRight)){
    			sb = new StringBuilder(stackValue.pop().toString()+calculateNoBraketString(sb.toString()));
    			charIndex++;
    		}
    		
    		else{
    			sb.append(operateChar);
    			charIndex++;
    		}
    		
    	}
    	return calculateNoBraketString(sb.toString());
    }
    
    
    public static Integer calculateNoBraketString(String calculateString) throws Exception{
    	
    	String[] withOperateSplit = calculateString.split("[+,-]");
    	char[] values = calculateString.toCharArray();
    	int charIndex = 0;
    	List<Character> oprateStack = new ArrayList<Character>();
    	for(Character temp:values){
    		if(temp.equals('+')||temp.equals('-')){
    			oprateStack.add(temp);
    		}
    	}
    	
    	//System.out.println("withOperateSplit length"+withOperateSplit.length);
    	//System.out.println("oprateStack length"+oprateStack.size());
    	int sum = Integer.valueOf(withOperateSplit[0]);
    	for(int i=0;i<withOperateSplit.length-1;i++){
    		if(oprateStack.get(i).equals('+')){
    			sum = sum + Integer.valueOf(withOperateSplit[i+1]);
    		}else{
    			sum = sum - Integer.valueOf(withOperateSplit[i+1]);
    		}
    	}
    	return sum;
    }
   
//    public static Integer calculateNoBracket(String calculateString) throws Exception{
//    	char[] values = calculateString.toCharArray();
//    	int charIndex = 0;
//    	Boolean leftFlag = false;
//    	Boolean opreateFlag = false;
//    	int operateResult = 0;
//    	int leftTemp = 0;
//    	String operateTemp = null;
//    	while(charIndex < calculateString.length()){
//    		int originValue = values[charIndex];
//    		if(Character.isDigit(originValue)){
//    			while(Character.isDigit(values[charIndex+1])){
//    				originValue = originValue*10 + values[charIndex+1];
//    				charIndex ++;
//    			}
//    			
//    			if(leftFlag&&opreateFlag){
//    				operateResult = operateNumbre(leftTemp,operateTemp,originValue);
//    				//values[charIndex] = opre
//    			}
//    			else if(!leftFlag){
//    				leftTemp = originValue;
//    				leftFlag = true;
//    				charIndex++;
//    			}
//    		}
//    	}
//    }
    
    
//    public static void main(String[] args) {
//		
//    	String strings = new String("1+2-(3+3-(3+3))+2");
//    	try {
//			System.out.println(new Solution().calculate(strings));
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//    	//System.out.println(sum);
//    	//return sum;
//	}
//    
//    
//    public static Integer operateNumbre(Integer one,String opeate,Integer two) throws Exception{
//    	if(opeate.equals(Solution.addition)){
//    		return one+two;
//    	}
//    	else if(opeate.equals(Solution.subtraction)){
//    		return one-two;
//    	}else{
//    		throw new Exception("operation is not support!");
//    	}
//    }
//    
//    
//    
//    
//    public static Integer getOprateNumber(char[] calculateString,int index){
//    	int value = calculateString[index];
//    	while(Character.isDigit(calculateString[index+1])){
//    		value = value*10 + calculateString[index+1];
//		}
//    	return value;
//    }
}