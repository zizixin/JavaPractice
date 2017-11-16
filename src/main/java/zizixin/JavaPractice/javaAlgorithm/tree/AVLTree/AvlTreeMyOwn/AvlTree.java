package zizixin.JavaPractice.javaAlgorithm.tree.AVLTree.AvlTreeMyOwn;

public class AvlTree<T extends Comparable<? super T>> implements Tree<T>{

	private class AvlNode<T>{
		
		public T element;
		
		public AvlNode<T> left;
		
		public AvlNode<T> right;

		public int height;
		
		public AvlNode(T element){
			this(element,null,null);
		}
		
		public AvlNode(T element,AvlNode<T> left,AvlNode<T> right){
			this.element = element;
			this.left = left;
			this.right = right;
		}
	}
	
	private AvlNode<T> root;
	
	private int insertCount;
	
	private int singleRoationCount;
	
	private int doubleRoationCount;
	
	public AvlTree(){
		
	}

//	public void insertValue(T element){
//		this.insertValue(element,this.root);
//	}
	
//	public AvlNode<T> insertValue(T element,AvlNode<T> node){
//		if(node==null){
//			node = new AvlNode<T>(element);
//		}else if(element.compareTo(node.element)>0){
//			this.insertValue(element, node.right);
//			
//		}else if(element.compareTo(node.element)<0){
//			this.insertValue(element, node.left);
//		}
//	}
	
	/* (non-Javadoc)
	 * @see zizixin.JavaPractice.javaAlgorithm.tree.AVLTree.AvlTreeMyOwn.Tree#insertNode(zizixin.JavaPractice.javaAlgorithm.tree.AVLTree.AvlTreeMyOwn.Node)
	 * this seems have no effect
	 */
	@Override
	public void insertNode(Node<T> node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeNode(Node<T> node) {
		// TODO Auto-generated method stub
		
	}
	
	
}
