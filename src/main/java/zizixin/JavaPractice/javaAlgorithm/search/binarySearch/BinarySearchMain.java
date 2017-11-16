package zizixin.JavaPractice.javaAlgorithm.search.binarySearch;

import zizixin.JavaPractice.javaAlgorithm.search.SearchLength;
import zizixin.JavaPractice.javaAlgorithm.search.SearchObject;
import zizixin.JavaPractice.javaAlgorithm.search.SearchObjectArrayUtil;

/**
 * @author zizixin
 * this class show that static field can not throw out exception 
 */
public class BinarySearchMain {

	public static Integer length = SearchLength.FACADE;
	
	public static SearchObject[] searchObjects = SearchObjectArrayUtil.getSearchObjectArray();
	
	
	public static void main(String[] args) {
		
		BinarySearch<SearchObject> search = new BinarySearch<SearchObject>(searchObjects);

		for(int i =0;i<SearchLength.SEARCHTIMES;i++){
			for(SearchObject searchObject:searchObjects){
				try {
					//System.out.println(search.getValue(searchObject).number);
					search.getValue(searchObject);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
