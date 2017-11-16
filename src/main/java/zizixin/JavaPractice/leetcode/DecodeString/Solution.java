package zizixin.JavaPractice.leetcode.DecodeString;

import java.util.Stack;

import org.apache.hadoop.mapred.machines_jsp;

public class Solution {
	
//3[a2[c]]
    public String decodeString(String s) {
    	
    	String response = "";
    	Stack<String> bracketsStack = new Stack<String>();
    	Stack<Integer> timesStack = new Stack<Integer>();
    	char[] targetStringChar = s.toCharArray();
    	int idx = 0;
    	while(idx<targetStringChar.length){
    		if(Character.isDigit(targetStringChar[idx])){
    			int number =  Integer.valueOf(String.valueOf(targetStringChar[idx]));
    			idx++;
    			while(Character.isDigit(targetStringChar[idx])){
    				number = number * 10 + Integer.valueOf(String.valueOf(targetStringChar[idx]));
    				idx ++;
    			}
    			timesStack.push(number);
    		}
    		else if(targetStringChar[idx]==CharacterStatic.leftBrackets){
    			bracketsStack.push(response);
    			response = "";
    			idx++;
    		}
    		else if(targetStringChar[idx]==CharacterStatic.rightBrackets){
    			Integer times = timesStack.pop();
    			StringBuilder stringBuilder = new StringBuilder(bracketsStack.pop());
    			while(times>0){
    				stringBuilder.append(response);
    				times--;
    			}
    			response = stringBuilder.toString();
    			idx++;
    		}else{
    			response = response + targetStringChar[idx];
    			idx++;
    		}
    	}
    	return response;
    }
    
    public String decodeStringTwo(String s){
    	
    	 String res = "";
         Stack<Integer> countStack = new Stack<>();
         Stack<String> resStack = new Stack<>();
         int idx = 0;
         while (idx < s.length()) {
             if (Character.isDigit(s.charAt(idx))) {
                 int count = 0;
                 while (Character.isDigit(s.charAt(idx))) {
                     count = 10 * count + (s.charAt(idx) - '0');
                     idx++;
                 }
                 countStack.push(count);
             }
             else if (s.charAt(idx) == '[') {
                 resStack.push(res);
                 res = "";
                 idx++;
             }
             else if (s.charAt(idx) == ']') {
                 StringBuilder temp = new StringBuilder (resStack.pop());
                 int repeatTimes = countStack.pop();
                 for (int i = 0; i < repeatTimes; i++) {
                     temp.append(res);
                 }
                 res = temp.toString();
                 idx++;
             }
             else {
                 res += s.charAt(idx++);
             }
         }
         return res;
    	
    }
    
   
    
    
    static class CharacterStatic{
    	
    	public static char leftBrackets = '[';
    	
    	public static char rightBrackets = ']';
    }
    
    private Boolean checkValid(String value){
    	char[] array = value.toCharArray();
    	
    	Stack<Character> characterStack = new Stack<>();
    	
    	for(Character character:array){
    		
    	}
    	 
    	
    	return false;
    }
    
    public static void main(String[] args) {
    	
    	
    	//new Solution().decodeStringTwo("ef2[abc]3[cd]ef");
    	Solution testSolution = new Solution();
//    	System.out.println("stand ouput:"+testSolution.decodeStringTwo("3[a2[c]]"));
//    	System.out.println("my output:"+testSolution.decodeString("3[a2[c]]"));
//    	System.out.println(testSolution.decodeStringTwo("3[a2[c]]").equals(testSolution.decodeString("3[a2[c]]")));
//    	
    	testSolution.decodeString("100[leetcode]");
    	
		Integer a = new Integer(1);
		
		Integer b = new Integer(1);
		
		Integer c = 1;
		
		Integer d = 1;
		
		System.out.print("a==b?->");
		System.out.println(a==b);
		
		System.out.print("c==d?->");
		System.out.println(c==d);
		
		System.out.print("a==c?->");
		System.out.println(a==c);
		
		System.out.println("for debug");
	}
}