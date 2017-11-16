package zizixin.JavaPractice.javaAlgorithm.tree.BinarySearchTree;

import zizixin.JavaPractice.javaAlgorithm.tree.NodeAbilityGeneric;

public class BinaryNode<T> implements NodeAbilityGeneric<T>{

	public T value;
	
	public BinaryNode<T> left;
	
	public BinaryNode<T> right;
	
	public BinaryNode(T value){
		this.value = value;
	}
	
	@Override
	public String toString() {
		
		return this.value.toString()+" ";
	}
}
