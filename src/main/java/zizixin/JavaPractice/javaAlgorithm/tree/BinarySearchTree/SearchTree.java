package zizixin.JavaPractice.javaAlgorithm.tree.BinarySearchTree;



public interface SearchTree<T> {

	public BinaryNode<T> getBinaryNode(T value)throws Exception;
	
	public void putBinaryNode(T value)throws Exception;
	
	public void deleteBinaryNode(T value);
	
	public String getSearchTreeType();
}
