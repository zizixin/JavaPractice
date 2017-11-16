package zizixin.JavaPractice.javaAlgorithm.sort;



public class SortMainTest {

	public static int arraySize = 10;
	
	public static void main(String[] args) {
		try {
			for(int i=0;i<10;i++){
				oneTest();
			}
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
		
	}
	
	public static void oneTest() throws Exception{

			//new BubbleSort(SortMainTest.getIntArray()).sort(); //done
			
			//new SelectionSort(SortMainTest.getIntArray()).sort();//done
			
			IntArraySortAbility quickSort = new QuickSort(SortMainTest.getIntArray());
			quickSort.sort();//done
			CheckSortVaild.staticCheck(quickSort, SortMode.ASC);//done
		
			
	}
	
	public static int[] getIntArray(){
		int[] array = new int[SortMainTest.arraySize];
		
		for(int i=0;i<SortMainTest.arraySize;i++){
			array[i] = (int) (Math.random()*100);
		}
		
		return array;
	}
	
	/**
	 * get a instant array for debug convenient
	 * @return a instant int array
	 */
	public static int[] getInstantArray(){
		return new int[]{20,98,7,32,51,25,71,17,84,63};
	}
 }
