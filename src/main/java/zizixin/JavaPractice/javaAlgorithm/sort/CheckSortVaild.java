package zizixin.JavaPractice.javaAlgorithm.sort;


public class CheckSortVaild {

	public SortMode sortMode = SortMode.ASC;
	
	public IntArraySortAbility target;
	
	public CheckSortVaild(IntArraySortAbility target){
		this.target = target;
	}
	
	public CheckSortVaild(IntArraySortAbility target,SortMode sortMode){
		this.target = target;
		this.sortMode = sortMode;
	}
	
	public static void logSuccess(){
		System.out.println("congratulations ! check is ok,target is legal!");
	}
	
	public void check() throws Exception{
		int [] targetArray = this.target.getArray();
		for(int i=0;i<targetArray.length-1;i++){
			if(this.sortMode==SortMode.ASC){
				if(targetArray[i]>targetArray[i+1]){
					throw new Exception("check result is wrong");
				}
			}else{
				if(targetArray[i]<targetArray[i+1]){
					throw new Exception("check result is wrong");
				}
			}
		}
		logSuccess();
	}
	
	public static void staticCheck(IntArraySortAbility target,SortMode sortMode) throws Exception{
		int [] targetArray = target.getArray();
		for(int i=0;i<targetArray.length-1;i++){
			if(sortMode==SortMode.ASC){
				if(targetArray[i]>targetArray[i+1]){
					throw new Exception("check result is wrong");
				}
			}else{
				if(targetArray[i]<targetArray[i+1]){
					throw new Exception("check result is wrong");
				}
			}
		}
		logSuccess();
	}
	
}
