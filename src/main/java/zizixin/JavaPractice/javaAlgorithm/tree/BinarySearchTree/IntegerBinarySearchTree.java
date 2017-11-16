package zizixin.JavaPractice.javaAlgorithm.tree.BinarySearchTree;


public class IntegerBinarySearchTree implements SearchTree<Integer>{

	public BinaryNode<Integer> root;
	
	public IntegerBinarySearchTree(BinaryNode<Integer> node){
		this.root = node;
	}
	
	public IntegerBinarySearchTree(){
		root = new BinaryNode<>(null);
	}
	
	@Override
	public BinaryNode<Integer> getBinaryNode(Integer value) throws Exception {
		
		class getAssit{
			public BinaryNode<Integer> node = IntegerBinarySearchTree.this.root;
			
			public Integer value;
			
			public BinaryNode<Integer> getBinaryNode() throws Exception{
				if(this.node == null){
					return null;
				}else{
					if(this.node.value<this.value){
						this.node = this.node.right;
						this.node = getBinaryNode();
					}else if(this.node.value>this.value){
						this.node = this.node.left;
						this.node = getBinaryNode();
					}
					else{
						return this.node;
					}
				}
				return this.node;//this is must
			}
			
			public getAssit(Integer value){
				this.value = value;
			}
		}
		
		return new getAssit(value).getBinaryNode();
	}

	@Override
	public void putBinaryNode(Integer value) throws Exception {
		
		class putAssit{
			
			public BinaryNode<Integer> node = IntegerBinarySearchTree.this.root;
			
			public void putNodeAddOuterCheck(Integer value) throws Exception{
				if(node!=null){
					putNode(value);
				}else{
					throw new Exception("put node have occur problem");
				}
			}
			
			public void  putNode(Integer value) throws Exception{
					if(value<node.value){
						if(node.left!=null){
							this.node = node.left;
							putNode(value);
						}else{
							node.left = new BinaryNode<Integer>(value);
						}
					}else if(value.equals(node.value)){
						//use what mode to resolve this
					}else{
						if(node.right!=null){
							this.node = node.right;
							putNode(value);
						}else{
							node.right =  new BinaryNode<Integer>(value);
						}
					}
			}
		}
		new putAssit().putNodeAddOuterCheck(value);
		
	}

	private void putBinaryNode(BinaryNode<Integer> node,Integer value){
		//may use recursion to sovle this,now like front use inner class to resolve this
	}
	
	@Override
	public void deleteBinaryNode(Integer value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getSearchTreeType() {
		return "hi,i am the simplest searchType";
	}

}
