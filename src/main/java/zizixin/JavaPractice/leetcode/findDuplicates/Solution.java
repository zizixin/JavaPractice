package zizixin.JavaPractice.leetcode.findDuplicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	public List<Integer> findDuplicates(int[] nums) {
		Arrays.sort(nums);
		List<Integer> duplicateList = new ArrayList<Integer>();
		for(int index=0;index<nums.length-1;){
			
			if(nums[index]==nums[index+1]){
				duplicateList.add(nums[index]);
				index = index + 2;
			}else{
				index++;
			}
		}
		return duplicateList;
	}
	
	
	public List<Integer> findDuplicatesTurbo(int[] nums){
		List<Integer> result = new ArrayList<Integer>();
	    if(nums == null)
	        return result;
	    for(int i=0; i<nums.length; i++){
	        int location = Math.abs(nums[i])-1;
	        if(nums[location] < 0){
	            result.add(Math.abs(nums[i]));
	        }else{
	            nums[location] = -nums[location];
	        }
	    }
	    for(int i=0; i<nums.length; i++)
	        nums[i] = Math.abs(nums[i]);
	   
	    return result;
	}
	
	
	public List<Integer> findDuplicatesTurboMyOwn(int[] nums){
		List<Integer> result = new ArrayList<Integer>();
		
		for(int i=0;i<nums.length;i++){
			int location = Math.abs(nums[i] - 1);
			if(nums[location]<0){
				result.add(Math.abs(nums[i]));
			}else{
				nums[location] = -nums[location];//user 0 and 1 for odd and even 
			}
		}
		
		for(int i=0;i<nums.length;i++){
			nums[i] =Math.abs(nums[i]);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.findDuplicates(new int[]{4,3,2,7,8,2,3,1}));
		System.out.println(solution.findDuplicatesTurbo(new int[]{4,3,2,7,8,2,3,1}));
	}
}
