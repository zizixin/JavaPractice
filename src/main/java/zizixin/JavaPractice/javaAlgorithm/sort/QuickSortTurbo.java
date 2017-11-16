package zizixin.JavaPractice.javaAlgorithm.sort;

/**
 * @author zizixin
 *
 * @param <T>
 * T's compare strategy is lt,gt 0 and equals 0 
 */
public class QuickSortTurbo<T extends Comparable<T>> implements SortAbilityTurbo{

	
	public T[] array;

	public QuickSortTurbo(T[] array){
		this.array = array;
	}
	
	/**
	 * @param array sor
	 * @throws Exception
	 * static can not decorate this method,generic charactor
	 */
	public  void sort(T[] array) throws Exception {
//		System.out.println("before sort.print array");
//		SortUtil.printGeneric(array);
		quickSort(array, 0, array.length-1);
//		System.out.println("after sort.print array");
//		SortUtil.printGeneric(array);
	}

	
	public void quickSort(T[] array,int begain,int end) throws Exception{
		
		int low = begain;
		
		int high = end;
		
		T sign = array[begain];
		
		while(low<high){
			while(low<high){
				if(array[high].compareTo(sign)>=0){
					high--;
				}else{
					break;
				}
			}
			while(low<high){
				if(array[low].compareTo(sign)<=0){
					low++;
				}else{
					break;
				}
			}
			if(low!=high){
				SortUtil.doExchange(array, low, high);
			}
			
		}

		if(array[low].compareTo(sign)>0){
			SortUtil.doExchange(array, begain, low-1);
		}
		else{
			SortUtil.doExchange(array, begain, low);
		}

		
		if(begain<low-1){
			quickSort(array, begain, low-1);
		}
		if(high+1<end){
			quickSort(array, high+1, end);
		}
		
	}


	public void sort() throws Exception {
		this.sort(this.array);
		
	}

	public void setArray(T[] array) {
		this.array = array;
	}

	public T[] getArray() {
		return this.array;
	}
}
