package zizixin.JavaPractice.multiThread.ticket;

import java.util.ArrayList;
import java.util.Collections;

public class Collection {
	
	public static ArrayList<Integer> indexList = new ArrayList<Integer>(){
		@Override
		public boolean add(Integer e) {
			//System.out.println("In collection the value is "+e);
			if(null == e){
				System.out.println("for debug!");
			}
			return super.add(e);
		};
		
	};

	
	public static void judgeDuplicate() throws Exception{
		for(int i=0;i<indexList.size()-1;i++){
			if(indexList.get(i)+1!=indexList.get(i+1)){
				System.out.println(indexList.get(i));
				System.out.println(indexList.get(i+1));
				throw new Exception("you get what you want!");
			}
		}
	}
	
}
