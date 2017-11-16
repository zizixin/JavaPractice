package zizixin.JavaPractice.javaAlgorithm.search;

import zizixin.JavaPractice.javaAlgorithm.search.binarySearch.BinarySearchMain;
import zizixin.JavaPractice.javaAlgorithm.tree.BinarySearchTree.IntergerArrayGenerate;

public class SearchObjectArrayUtil {

	public static SearchObject[] getSearchObjectArray(){

		Integer[] array = IntergerArrayGenerate.getIntegerArray(BinarySearchMain.length, 100);
		
		SearchObject[] searchObjects = new SearchObject[BinarySearchMain.length];
		
		for(int i=0;i<BinarySearchMain.length;i++){
			searchObjects[i] = new SearchObject(array[i]);
		}
		
		return searchObjects;
	}

	@Deprecated
	public static void printSearchObjectArray(SearchObject[] array){
		for(SearchObject searchObject:array){
			System.out.print(searchObject + " ");
		}
	}
}
