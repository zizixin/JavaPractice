package JavaPractice.leetcode.SerializeAndDeserializeBST;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Solution {
	
	

	public class Codec {

			
		Map<String,TreeNode> treeNodeMap = new HashMap<String,TreeNode>();
		
		public String stringTreeNode(TreeNode treeNode){
			StringBuilder sb = new StringBuilder();
			sb.append(treeNode.toString()).append(nodeInSplite);
			sb.append(treeNode.val).append(nodeInSplite);
			sb.append(treeNode.left==null?null:treeNode.left.toString()).append(nodeInSplite);
			sb.append(treeNode.right==null?null:treeNode.right.toString());
			return sb.toString();
		}
		

		
		public static final String nodeInSplite = "&";
		
		public static final String nodeSplite = "%";
		
		
	    public String serialize(TreeNode root) {
	    	if(root==null){
	    		return "";
	    	}
	        StringBuilder sb = new StringBuilder();
	        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
	        queue.offer(root);
	        int count = 0;
	        while(!queue.isEmpty()){
	        	TreeNode treeNode =  queue.poll();
	        	sb.append(stringTreeNode(treeNode)).append(nodeSplite);
	        	if(treeNode.left!=null){
	        		queue.offer(treeNode.left);
	        	}
	        	if(treeNode.right!=null){
	        		queue.offer(treeNode.right);
	        	}
	        }
	    	return sb.toString();
	    }

	    // Decodes your encoded data to tree.
	    public TreeNode deserialize(String data) {
	    	if(data.equals(""))return null;
	    	String[] objectStringArray = data.substring(0, data.length()-1).split(nodeSplite);
	    	for(int i=objectStringArray.length-1;i>=1;i--){
	    		getTreeNodeByString(objectStringArray[i]);
	    	}
	    	return getTreeNodeByString(objectStringArray[0]);
	    }
	    
		public  TreeNode getTreeNodeByString(String treeNodeString){
			String[] objectString = treeNodeString.split(nodeInSplite);
			TreeNode treeNode = new TreeNode(0);
			treeNodeMap.put(objectString[0], treeNode);
			treeNode.val = Integer.valueOf(objectString[1]);
			if(objectString[2].equals("null")){
				treeNode.left=null;
			}else{
				treeNode.left=treeNodeMap.get(objectString[2]);
			}
			if(objectString[3].equals("null")){
				treeNode.right=null;
			}else{
				treeNode.right=treeNodeMap.get(objectString[3]);
			}
			return treeNode;
		}
	}

	public static void main(String[] args) {
		
		TreeNode nodeOne = new TreeNode(1);
		TreeNode nodeTwo = new TreeNode(2);
		TreeNode nodeThree = new TreeNode(3);
		TreeNode nodeFour = new TreeNode(4);
		nodeOne.left = nodeTwo;
		nodeTwo.right = nodeFour;
		nodeOne.right = nodeThree;
		Codec codec = new Solution().new Codec();
		String serializeString = codec.serialize(null); 
		System.out.println(serializeString);
		TreeNode treeNode = codec.deserialize(serializeString);
		System.out.println("for debug");
	}
}
