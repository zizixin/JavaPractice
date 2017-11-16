package zizixin.JavaPractice.util;

public class ArrayGenerator {

	public static Integer count = 100;
	
	public static Integer scale = 100;
	
	public static Integer[] arrayInstant = {90,48,26,83,25,26,34,39,39,3,22,84,41,42,30,31,15,48,51,93,4,5,93,29,13,49,12,41,97,31,33,27,79,14,84,64,76,87,28,98,62,16,31,89,34,18,74,39,23,40,18,63,84,60,20,64,89,33,45,52,75,96,28,39,20,44,12,8,90,78,54,21,17,62,61,85,22,30,46,37,5,12,68,38,10,97,3,12,55,68,83,48,69,11,51,37,42,63,30,50};
	
	public static Integer[] getRandomArray(){
		return getRandomArray(ArrayGenerator.count,ArrayGenerator.scale);
	}
	
	public static Integer[] getRandomArray(int count,int scale){
		Integer[] array = new Integer[count];
		for(int index=0;index<count;index++){
			array[index] = (int) (Math.random()*scale);
		}
		return array;
	}
}
