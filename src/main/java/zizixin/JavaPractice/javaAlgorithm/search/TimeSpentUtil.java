package zizixin.JavaPractice.javaAlgorithm.search;

public class TimeSpentUtil {

	
	private TimeSpentUtil(){
		
	}
	
	public static TimeSpent timeSpent = new TimeSpent();
	
	public static class TimeSpent{
		
		public long time = 0;
		
		public boolean open = true;
		
		public void setTime() throws Exception{
			if(open){
				this.open = false;
			}else{
				throw new Exception("this timespent util can not be use!");
			}
			this.time = System.currentTimeMillis();
		}
		
		public long getTime()throws Exception{
			if(!open){
				this.open = true;
			}else{
				throw new Exception("this timespent util can not be use!");
			}
			return System.currentTimeMillis() - this.time;
		}
	}
	
	public static TimeSpent getTimeSpentInstance(){
		return new TimeSpent();
	} 
}
