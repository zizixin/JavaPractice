package zizixin.JavaPractice.javaAlgorithm.sort;



public class BubbleSort implements IntArraySortAbility{

	public int[] array;
	
	public BubbleSort(int[] array){
		this.array = array;
	}
	
	@Override
	public void sort(int[] array) throws Exception {
		System.out.println("before sort,print array");
		SortUtil.print(array);
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array.length-i-1;j++){
				if(array[j]<array[j+1]){
					SortUtil.doExchange(array, j, j+1);
				}
			}
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
