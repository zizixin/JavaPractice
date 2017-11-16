package zizixin.JavaPractice.leetcode.RemoveDupList;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
    	ListNode opreateIndex = head;
    	if(opreateIndex == null||opreateIndex.next == null)return head;
    	else{
    		while(opreateIndex!=null&&opreateIndex.next!=null){
    			if(opreateIndex.val == opreateIndex.next.val){
    				opreateIndex.next = opreateIndex.next.next;
    			}else{
    				opreateIndex = opreateIndex.next;
    			}
    		}
    	}
    	return head;
    }
    
    public static void main(String[] args) {
		
    	ListNode head = new ListNode(1);
    	
    	ListNode two = new ListNode(1);
    	
    	ListNode three = new ListNode(1);
    	
    	ListNode four = new ListNode(2);
    	
    	head.next = two;
    	
    	two.next = three;
    	
    	three.next = four;
    	
    	ListNode test = new Solution().deleteDuplicates(head);
    	
    	System.out.println("for debug");
	}
}
