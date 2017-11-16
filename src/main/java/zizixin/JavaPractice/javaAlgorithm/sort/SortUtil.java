package zizixin.JavaPractice.javaAlgorithm.sort;



public class SortUtil {

	public static void doExchangeWithCondition(int[] array,int i,int j) throws Exception{
		if(i==j){
			throw new Exception("can not exchange same index");
		}
		
		if(i<0||j<0){
			throw new Exception("index can not small than 0");
		}
		
		//blua blua ....
	}
	
	public static void doExchange(int array[],int i,int j)throws Exception{
		int temp = array[i];
		
		array[i] = array[j];
		
		array[j] = temp;
	}
	
	public static <T> void doExchange(T[] array,int i,int j){
		T temp = array[i];
		
		array[i] = array[j];
		
		array[j] = temp;
	
	}
	
	public static void print(int array[]){
		System.out.println("----------------------------print array:"+array+"----------------------");
		for(int i:array){
			System.out.print(i+" ");
		}
		System.out.println("\n");
	}
	
	public static <T> void printGeneric(T[] array){
		System.out.println("----------------------------print array:"+array+"----------------------");
		for(T i:array){
			System.out.print(i+" ");
		}
		System.out.println("\n");
	}
}
