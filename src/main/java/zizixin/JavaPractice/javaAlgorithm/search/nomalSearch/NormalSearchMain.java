package zizixin.JavaPractice.javaAlgorithm.search.nomalSearch;

import zizixin.JavaPractice.javaAlgorithm.search.SearchLength;
import zizixin.JavaPractice.javaAlgorithm.search.SearchObject;
import zizixin.JavaPractice.javaAlgorithm.search.SearchObjectArrayUtil;

public class NormalSearchMain {

	public static Integer length = SearchLength.FACADE;
	
	public static SearchObject[] searchObjects = SearchObjectArrayUtil.getSearchObjectArray();
	
	
	public static void main(String[] args) {
		
		NormalSearch<SearchObject> search = new NormalSearch<SearchObject>(searchObjects);

		for(int i = 10;i<SearchLength.SEARCHTIMES;i++){
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
