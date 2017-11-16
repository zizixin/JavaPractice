package zizixin.JavaPractice.javaAlgorithm.search.binarySearch;

import zizixin.JavaPractice.javaAlgorithm.tree.BinarySearchTree.BinaryNode;
import zizixin.JavaPractice.javaAlgorithm.tree.BinarySearchTree.BinarySearchTreeTurbo;

/**
 * @author zizixin
 *
 * @param <T>
 * search encapsulation a logic ,make tree is transparent for usr
 */
public class BinarySearch<T extends Comparable<T>> {

	T[] array;
	
	BinarySearchTreeTurbo<T> tree;//use BinarySearchTree to achievement search function
	
	public BinarySearch(T[] array){
		this.array = array;
		try {
			this.init();
		} catch (Exception e) {
			System.out.println("BinarySearch init have problem");
			e.printStackTrace();
		}
	}
	
	/**
	 * @throws Exception 
	 * 
	 */
	private void init() throws Exception{
		this.tree = new BinarySearchTreeTurbo<T>(new BinaryNode<T>(array[0]));
		for(T value:array){
			tree.putBinaryNode(value);
		}
	}
	
	public T getValue(T value) throws Exception{
		return this.tree.getBinaryNode(value).value;
	}
}
