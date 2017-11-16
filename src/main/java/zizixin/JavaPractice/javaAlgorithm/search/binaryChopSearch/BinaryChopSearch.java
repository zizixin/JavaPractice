package zizixin.JavaPractice.javaAlgorithm.search.binaryChopSearch;

import zizixin.JavaPractice.javaAlgorithm.sort.QuickSortTurbo;

public class BinaryChopSearch<T extends Comparable<T>> {

	public T[] array;
	
	public BinaryChopSearch(T[] array){

		
		this.array = array;
		try {
			this.init();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	private void init() throws Exception{
		new QuickSortTurbo<T>(this.array).sort();
	}
	
	public T getValue(T value) throws Exception{
		return binaryChop(value,0,array.length);
	}
	
	/**
	 * @param value
	 * @param begain
	 * @param end
	 * @return
	 * @throws Exception
	 * recursion implements should watch out return must infront of 'binaryChop'
	 * and not use don't use recursion can have two method 
	 * 1.one is inner class see BinarySearchTree.getBinaryNode()
	 * 2.one is loop see PrintArray.printFrontBinaryWRE2()
	 */
	private T binaryChop(T value,int begain,int end) throws Exception{
		if(begain!=end){
			if(value.compareTo(array[(begain+end)/2])>0){
				return binaryChop(value, (begain+end)/2, end);
			}else if(value.compareTo(array[(begain+end)/2])<0){
				return binaryChop(value, begain, (begain+end)/2);
			}else{
				return array[(begain+end)/2];
			}
		}else{
			if(value.compareTo(array[begain])==0){
				return array[begain];
			}else{
				return null;
			}
		}
	}
}
