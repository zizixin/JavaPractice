package zizixin.JavaPractice.javaAlgorithm.tree.BinaryNode;



public class SimpleTreeGenerator {
	
	public BinaryNode[] nodes; 
	
	public SimpleTreeGenerator(int size) throws Exception{
		if(size<=3){
			System.out.println("please no size smaller than three!!!!!");
			throw new Exception("done");
		}else{
			nodes = new BinaryNode[size];
			for(int i=0;i<size;i++){
				nodes[i] = new BinaryNode(i);//do init
			}
		}
		
	}
	
	
	public BinaryNode getADefaultBinaryTree(){
		
		nodes[0].leftNode = nodes[1];
		nodes[0].rightNode = nodes[2];
		
		for(int i=1;i<this.nodes.length/2-1;i++){
			nodes[i].leftNode = nodes[2*i+1];
			nodes[i].rightNode = nodes[2*i+2];
		}
		
		return nodes[0];
	}
}
