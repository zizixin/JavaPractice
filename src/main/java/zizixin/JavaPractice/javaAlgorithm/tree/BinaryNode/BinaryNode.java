package zizixin.JavaPractice.javaAlgorithm.tree.BinaryNode;

import zizixin.JavaPractice.javaAlgorithm.tree.NodeAbility;

public class BinaryNode implements NodeAbility{

	public Object value;
	
	public BinaryNode leftNode;
	
	public BinaryNode rightNode;
	
	public BinaryNode(Object value){
		this.value = value;
	}
	
}
