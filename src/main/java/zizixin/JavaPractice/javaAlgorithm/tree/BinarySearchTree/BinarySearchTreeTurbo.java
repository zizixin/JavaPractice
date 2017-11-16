package zizixin.JavaPractice.javaAlgorithm.tree.BinarySearchTree;

public class BinarySearchTreeTurbo<T extends Comparable<T>> implements SearchTree<T>{

	public BinaryNode<T> root;
	
	public BinarySearchTreeTurbo(BinaryNode<T> node){
		this.root = node;
	}
	
	/**
	 * tree root should have value
	 */
	@Deprecated
	public BinarySearchTreeTurbo(){
		root = new BinaryNode<>(null);
	}
	
	
	@Override
	public BinaryNode<T> getBinaryNode(T value) throws Exception {
		class getAssit{
			public BinaryNode<T> node = BinarySearchTreeTurbo.this.root;
			
			public T value;
			
			public BinaryNode<T> getBinaryNode() throws Exception{
				if(this.node == null){
					return null;
				}else{
					if(this.node.value.compareTo(this.value)<0){
						this.node = this.node.right;
						this.node = getBinaryNode();
					}else if(this.node.value.compareTo(this.value)>0){
						this.node = this.node.left;
						this.node = getBinaryNode();
					}
					else{
						return this.node;
					}
				}
				return this.node;//this is must
			}
			
			public getAssit(T value){
				this.value = value;
			}
		}
		
		return new getAssit(value).getBinaryNode();
	}

	@Override
	public void putBinaryNode(T value) throws Exception {
	class putAssit{
				
				public BinaryNode<T> node = BinarySearchTreeTurbo.this.root;
				
				public void putNodeAddOuterCheck(T value) throws Exception{
					if(node!=null){
						putNode(value);
					}else{
						throw new Exception("put node have occur problem");
					}
				}
				
				public void  putNode(T value) throws Exception{
						if(value.compareTo(node.value)<0){
							if(node.left!=null){
								this.node = node.left;
								putNode(value);
							}else{
								node.left = new BinaryNode<T>(value);
							}
						}else if(value.compareTo(node.value)==0){
							//use what mode to resolve this
						}else{
							if(node.right!=null){
								this.node = node.right;
								putNode(value);
							}else{
								node.right =  new BinaryNode<T>(value);
							}
						}
				}
			}
			new putAssit().putNodeAddOuterCheck(value);
		
	}

	@Override
	public void deleteBinaryNode(T value) {
		// TODO Auto-generated method stub
	}

	@Override
	public String getSearchTreeType() {
		return "genericSearchTree";
	}

}
