package zizixin.JavaPractice.javaAlgorithm.search.binaryChopSearch;

import zizixin.JavaPractice.javaAlgorithm.search.SearchLength;
import zizixin.JavaPractice.javaAlgorithm.search.SearchObject;
import zizixin.JavaPractice.javaAlgorithm.search.SearchObjectArrayUtil;
import zizixin.JavaPractice.javaAlgorithm.sort.SortUtil;

public class BinaryChopSearchMain {

	public static Integer length = SearchLength.FACADE;
	
	public static SearchObject[] searchObjects = SearchObjectArrayUtil.getSearchObjectArray();
	
	public static void main(String[] args) {
		
		//System.out.println("do not search init:");
		//SearchObjectArrayUtil.printSearchObjectArray(searchObjects);
		//SortUtil.printGeneric(searchObjects);
		
		
		BinaryChopSearch<SearchObject> binaryChopSearch = new BinaryChopSearch<SearchObject>(searchObjects);
		//System.out.println("after search init");
		//SearchObjectArrayUtil.printSearchObjectArray(searchObjects);
		//SortUtil.printGeneric(searchObjects);
		

		for(int i =0;i<SearchLength.SEARCHTIMES;i++){
			for(SearchObject searchObject:BinaryChopSearchMain.searchObjects){
				try {
					//System.out.println(binaryChopSearch.getValue(searchObject).number);
					binaryChopSearch.getValue(searchObject);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
