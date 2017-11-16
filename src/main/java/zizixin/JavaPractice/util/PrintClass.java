package zizixin.JavaPractice.util;

public class PrintClass {

	public static void main(String[] args) {
		Integer[] array = ArrayGenerator.arrayInstant;
		for(int index = 0;index<array.length;index++){
			System.out.print(array[index]+",");
		}
	}
}
