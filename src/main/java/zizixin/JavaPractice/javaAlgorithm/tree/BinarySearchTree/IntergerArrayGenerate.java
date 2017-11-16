package zizixin.JavaPractice.javaAlgorithm.tree.BinarySearchTree;



public class IntergerArrayGenerate {

	public static Integer[] getInstanctArray(){
		return new Integer[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
	}
	
	public static Integer[] getIntegerArray(int size,int maxValue){
		Integer[] arrays =new Integer[size];
		for(int i=0;i<arrays.length;i++){
			arrays[i]= (int) (Math.random()*maxValue);
		}
		return arrays;
	}
}
