package zizixin.JavaPractice.javaAlgorithm.sort;



public interface PrintSortInfo extends IntArraySortAbility{

	public default void printSoortInfo() throws Exception{
		System.out.println("before sort,print array");
		sort();
		// should put print array in array ability
		
	}
}
