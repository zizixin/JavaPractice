package zizixin.JavaPractice.javaAlgorithm.tree.BinaryNode;



public class BinaryNodeMainTest {

	public static void main(String[] args) {
		
		try {
			BinaryNode binaryNode = new SimpleTreeGenerator(10).getADefaultBinaryTree();
			
//			System.out.println("front ergodic:");
//			PrintBinary.printFrontBinary(binaryNode);
//			
//			System.out.println("\nmiddle ergodic:");
//			PrintBinary.printMiddleBinary(binaryNode);
//			
			System.out.println("\nbehind ergodic");
			PrintBinary.printBehindBinary(binaryNode);
			
//			System.out.println("\nfront ergodic with recursion");
//			PrintBinary.printFrontBinaryWithoutRecursion(binaryNode);
//			
//			System.out.println("\nfront ergodic witn recursion edition 2");
//			PrintBinary.printFrontBinaryWRE2(binaryNode);
			
//			System.out.println("\nmiddle ergodic with recursion");
//			PrintBinary.printMiddleBinaryWR(binaryNode);
			
			System.out.println("\nbehind ergodic with recursion");
			PrintBinary.printBehindBinaryWR(binaryNode);
			
			System.out.println("\nbfs");
			PrintBinary.printBinaryTreeBfs(binaryNode);
			
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
		

		
	}
}
