package zizixin.JavaPractice.JdkFeature.compareableTest;

public class Something implements Comparable<Something>{

	
	public Integer one;
	
	public Integer two;

	@Override
	public int compareTo(Something o) {
		if(this.one+this.two>o.one+o.two){
			return 1;
		}else if(this.one+this.two == o.one + o.two){
			return 0;
		}else{
			return -1;
		}
		
	}
}
