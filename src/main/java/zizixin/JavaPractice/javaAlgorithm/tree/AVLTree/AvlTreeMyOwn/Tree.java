package zizixin.JavaPractice.javaAlgorithm.tree.AVLTree.AvlTreeMyOwn;

public interface Tree<T extends Comparable<? super T>> {

	public void insertNode(Node<T> node);

	
	public void removeNode(Node<T> node);
	
}
