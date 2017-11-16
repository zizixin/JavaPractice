package zizixin.JavaPractice.javaAlgorithm.sort;



public class SelectionSort implements IntArraySortAbility{

	public int[] array;
	
	public SelectionSort(int[] array){
		this.array = array;
	}
	
	@Override
	public void sort(int[] array) throws Exception {
		System.out.println("before sort,print array");
		SortUtil.print(array);
		int tempIndex;
		int tempValue;
		for(int i=0;i<array.length;i++){
			tempValue = array[i];
			tempIndex = i;
			for(int j=i+1;j<array.length;j++){
				if(tempValue>array[j]){
					tempIndex = j;
					tempValue = array[tempIndex];
				}
			}
			SortUtil.doExchange(array, tempIndex,i);
		}
		System.out.println("after sort,print array");
		SortUtil.print(array);
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
