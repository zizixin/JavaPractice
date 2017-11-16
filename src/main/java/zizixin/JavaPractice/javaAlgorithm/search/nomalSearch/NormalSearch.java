package zizixin.JavaPractice.javaAlgorithm.search.nomalSearch;

public class NormalSearch<T extends Comparable<T>> {

	public T[] array;
	
	private void init(){
		
	}
	
	public NormalSearch(T[] array){
		this.array = array;
		init();
	}
	
	public T getValue(T value){
		for(T tempValue:this.array){
			if(tempValue.compareTo(value)==0){
				return tempValue;
			}
		}
		return null;
	}
}
