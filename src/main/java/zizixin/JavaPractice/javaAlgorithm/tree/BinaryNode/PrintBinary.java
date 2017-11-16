package zizixin.JavaPractice.javaAlgorithm.tree.BinaryNode;

import java.util.LinkedList;
import java.util.Stack;

/**
 * WR means withOut recursion
 * 
 * @author zizixin
 *
 */
public class PrintBinary {

	public static void printBehindBinary(BinaryNode binaryNode){
		if(binaryNode.leftNode!=null){
			printBehindBinary(binaryNode.leftNode);
		}
		if(binaryNode.rightNode!=null){
			printBehindBinary(binaryNode.rightNode);
		}
		PrintBinary.printAddStyle(binaryNode.value.toString());
	}

	public static void printMiddleBinary(BinaryNode binaryNode){
		if(binaryNode.leftNode!=null){
			printMiddleBinary(binaryNode.leftNode);
		}
		PrintBinary.printAddStyle(binaryNode.value.toString());
		if(binaryNode.rightNode!=null){
			printMiddleBinary(binaryNode.rightNode);
		}
	}
	
	public static void printFrontBinary(BinaryNode binaryNode){
		PrintBinary.printAddStyle(binaryNode.value.toString());
		if(binaryNode.leftNode!=null){
			printFrontBinary(binaryNode.leftNode);
		}
		if(binaryNode.rightNode!=null){
			printFrontBinary(binaryNode.rightNode);
		}
	}
	
	public static void printAddStyle(Object obj){
		System.out.print(obj + " ");
	}

	public static void printAddStyle(BinaryNode binaryNode){
		System.out.print(binaryNode.value.toString() + " ");
	}
	
	/**
	 * without recursion is use stack to mock
	 * please note that rightNode and left node should exchange their ralative position
	 * @param binaryNode
	 */
	public static void printFrontBinaryWithoutRecursion(BinaryNode binaryNode){
		Stack<BinaryNode> stack = new Stack<BinaryNode>();
		stack.push(binaryNode);
		while(!stack.isEmpty()){
			BinaryNode tempNode;
			tempNode = stack.pop();
			printAddStyle(tempNode);
			if(tempNode.rightNode!=null){
				stack.push(tempNode.rightNode);
			}
			if(tempNode.leftNode!=null){
				stack.push(tempNode.leftNode);
			}
		}
	}
	
	public static void printFrontBinaryWRE2(BinaryNode binaryNode){
		Stack<BinaryNode> stack = new Stack<BinaryNode>();
		BinaryNode operationNode = binaryNode;
		while(!stack.isEmpty()||operationNode !=null){
			while(operationNode!=null){
				printAddStyle(operationNode);
				stack.push(operationNode);
				operationNode = operationNode.leftNode;
			}
			if(!stack.isEmpty()){
				operationNode = stack.pop().rightNode; 
			}
		}
	}
	
	/**
	 * 
	 * @param binaryNode
	 */
	public static void printMiddleBinaryWR(BinaryNode binaryNode){
		Stack<BinaryNode> stack = new Stack<BinaryNode>();
		BinaryNode operationNode = binaryNode;
		while(!stack.isEmpty()||operationNode !=null){
			while(operationNode!=null){
				stack.push(operationNode);
				operationNode = operationNode.leftNode;
			}
			if(!stack.isEmpty()){
				operationNode = stack.pop();
				printAddStyle(operationNode);
				operationNode = operationNode.rightNode;
			}
		}
	}
	
	/**
	 * WR implements Behind is difficult
	 * @param binaryNode
	 */
	public static void printBehindBinaryWR(BinaryNode binaryNode){
		Stack<BinaryNode> stack = new Stack<>();
		BinaryNode operationNode = binaryNode;
		BinaryNode prev = binaryNode;
        while(!stack.isEmpty()||operationNode!=null){
            while(operationNode!=null){
                stack.push(operationNode);
                operationNode = operationNode.leftNode;
            }
            if(!stack.isEmpty()){
            	BinaryNode temp = stack.peek().rightNode;
                if(temp == null||temp == prev){
                	operationNode = stack.pop();
                	printAddStyle(operationNode);
                    prev = operationNode;
                    operationNode = null;
                }else{  
                	operationNode = temp;
                }     
            }  	
        }  
	}
	
	public static void printBehindBinaryWRDup(BinaryNode binaryNode){
		Stack<BinaryNode> stack = new Stack<>();
		BinaryNode operatioNode = binaryNode;
		BinaryNode prev = binaryNode;
		while(!stack.isEmpty()||operatioNode!=null){
			while(operatioNode!=null){
				stack.push(operatioNode);
				operatioNode = operatioNode.leftNode;
			}
			if(!stack.isEmpty()){
				BinaryNode temp = stack.peek().rightNode;
				if(temp==null||temp==prev){//middle site should check if his right son site is pop,so add this if clause
					operatioNode = stack.pop();
					printAddStyle(operatioNode);
					prev = operatioNode;
					operatioNode = null;//not set operationNode to temp Node,so set it value to null
				}else{
					operatioNode = temp;
				}
			}
		}
	}
	
	
	public static void printBinaryTreeBfs(BinaryNode binaryNode){
		BinaryNode oprationNode = binaryNode;
		LinkedList<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.offer(oprationNode);
		while(queue.size()>0){
			oprationNode = queue.poll();
			printAddStyle(oprationNode);
			if(oprationNode.leftNode!=null){
				queue.offer(oprationNode.leftNode);
			}
			if(oprationNode.rightNode!=null){
				queue.offer(oprationNode.rightNode);
			}
		}
	}
	
	/**
	 * this show the importpant of abstract
	 * @param binaryNode
	 */
	public static <T> void printBinaryTreeBfs(zizixin.JavaPractice.javaAlgorithm.tree.BinarySearchTree.BinaryNode<T> binaryNode){
		zizixin.JavaPractice.javaAlgorithm.tree.BinarySearchTree.BinaryNode<T> oprationNode = binaryNode;
		LinkedList<zizixin.JavaPractice.javaAlgorithm.tree.BinarySearchTree.BinaryNode<T>> queue = new LinkedList<zizixin.JavaPractice.javaAlgorithm.tree.BinarySearchTree.BinaryNode<T>>();
		queue.offer(oprationNode);
		while(queue.size()>0){
			oprationNode = queue.poll();
			printAddStyle(oprationNode);
			if(oprationNode.left!=null){
				queue.offer(oprationNode.left);
			}
			if(oprationNode.right!=null){
				queue.offer(oprationNode.right);
			}
		}
	}
	
//	  * 广度优先遍历（从上到下遍历二叉树） 
//	     * @param root 
//	     */  
//	    public void bfs(Node root){  
//	          if(root == null) return;  
//	          LinkedList<Node> queue = new LinkedList<Node>();  
//	          queue.offer(root); //首先将根节点存入队列  
//	          //当队列里有值时，每次取出队首的node打印，打印之后判断node是否有子节点，若有，则将子节点加入队列  
//	          while(queue.size() > 0){   
//	            Node node = queue.peek();  
//	            queue.poll(); //取出队首元素并打印  
//	            System.out.print(node.var+" ");  
//	            if(node.left != null){ //如果有左子节点，则将其存入队列  
//	              queue.offer(node.left);  
//	            }  
//	            if(node.right != null){ //如果有右子节点，则将其存入队列  
//	              queue.offer(node.right);  
//	            }  
//	          }  
//	    }  
//	    /** 
//	     * 深度优先遍历 
//	     * @param node 
//	     * @param rst 
//	     * @param list 
//	     */  
//	    public void dfs(Node node,List<List<Integer>> rst,List<Integer> list){  
//	        if(node == null) return;  
//	        if(node.left == null && node.right == null){  
//	            list.add(node.var);  
//	            /* 这里将list存入rst中时，不能直接将list存入，而是通过新建一个list来实现， 
//	             * 因为如果直接用list的话，后面remove的时候也会将其最后一个存的节点删掉*/  
//	            rst.add(new ArrayList<>(list));  
//	            list.remove(list.size()-1);  
//	        }  
//	        list.add(node.var);  
//	        dfs(node.left,rst,list);  
//	        dfs(node.right,rst,list);  
//	        list.remove(list.size()-1);  
//	    }  
	
}
