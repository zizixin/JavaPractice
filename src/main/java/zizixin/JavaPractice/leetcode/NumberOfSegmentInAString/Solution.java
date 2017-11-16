package JavaPractice.leetcode.NumberOfSegmentInAString;

public class Solution {

	public int countSegments(String s) {
		String[] array = s.split(" ");
		int length = array.length;
		for(String temp:array){
			if(temp.trim().equals(""))length = length -1;
		}
        return length;
    }
	
	public static void main(String[] args) {
		
		System.out.println(new Solution().countSegments(", , , ,        a, eaefa"));
		
	}
}
