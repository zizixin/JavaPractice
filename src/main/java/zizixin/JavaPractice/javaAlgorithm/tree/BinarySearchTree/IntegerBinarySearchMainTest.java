package zizixin.JavaPractice.javaAlgorithm.tree.BinarySearchTree;



import zizixin.JavaPractice.javaAlgorithm.tree.BinaryNode.PrintBinary;

public class IntegerBinarySearchMainTest {

	public static Integer defaultValue = 10;
	
	public static void main(String[] args) {
		
		try {
			System.out.println("test begain");
			
			
			System.out.println("get a  arrays and print the array");
			//Integer[] IntegerArrays = IntergerArrayGenerate.getInstanctArray();
			Integer[] IntegerArrays = IntergerArrayGenerate.getIntegerArray(20, 100);
			IntegerBinarySearchMainTest.printIntegerArray(IntegerArrays);
			
			System.out.println("create a binarySearch key");
			IntegerBinarySearchTree tree = new IntegerBinarySearchTree(new BinaryNode<Integer>(IntegerArrays[0]));

			
			for(Integer value:IntegerArrays){
				
					tree.putBinaryNode(value);
				
			}
			
			for(Integer value:IntegerArrays){
				
				System.out.println(tree.getBinaryNode(value).value);
			
			}
			//System.out.println(tree.getBinaryNode(20).value);
			System.out.println("Hierarchical traversal search tree");
			PrintBinary.printBinaryTreeBfs(tree.root);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void getAandomeArrayTest(){
		
		for(Integer temp:IntergerArrayGenerate.getIntegerArray(20, 100)){
			System.out.print(temp+" ");
		}
		
	}
	
	public static void printIntegerArray(Integer[] array){
		for(Integer temp:array){
			System.out.print(temp+" ");
		}
	}
}
