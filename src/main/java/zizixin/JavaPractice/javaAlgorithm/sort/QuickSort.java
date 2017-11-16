package zizixin.JavaPractice.javaAlgorithm.sort;



public class QuickSort implements IntArraySortAbility{
	
	public int[] array;

	public QuickSort(int[] array){
		this.array = array;
	}
	
	@Override
	public void sort(int[] array) throws Exception {
		System.out.println("before sort.print array");
		SortUtil.print(array);
		quickSort(array, 0, array.length-1);
		System.out.println("after sort.print array");
		SortUtil.print(array);
	}

	
	public void quickSort(int[] array,int begain,int end) throws Exception{
		int low = begain;
		
		int high = end;
		
		int sign = array[begain];
		
		while(low<high){
			while(low<high){
				if(array[high]>=sign){
					high--;
				}else{
					break;
				}
			}
			while(low<high){
				if(array[low]<=sign){
					low++;
				}else{
					break;
				}
			}
			if(low!=high){
				SortUtil.doExchange(array, low, high);
			}
			
		}

		if(array[low] > sign){
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


	@Override
	public void sort() throws Exception {
		this.sort(this.array);
		
	}

	@Override
	public void setArray(int[] array) {
		this.array = array;
	}

	@Override
	public int[] getArray() {
		return this.array;
	}
}
