package zizixin.JavaPractice.javaAlgorithm.search;

public class SearchObject implements Comparable<SearchObject>{

	public Integer number;
	
	@Override
	public int compareTo(SearchObject o) {
		if(this.number<o.number){
			return -1;
		}else if(this.number>o.number){
			return 1;
		}else{
			return 0;
		}
	}

	public SearchObject(Integer number){
		this.number = number;
	}
	
	@Override
	public String toString() {
		return String.valueOf(this.number);
	}
	
	
	
//	public String name;
//	
//	public String number;
}
