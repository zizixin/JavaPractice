package zizixin.JavaPractice.designPattern.nullPattern;

public class TargetFactory {

	public static String[] names = {"personA","personB","personC"};
	
	public Target getTarget(String name){
		for (int i = 0; i < names.length; i++) {
	         if (names[i].equalsIgnoreCase(name)){
	            return new ExistTarget(name);
	         }
	      }
		return new NullTarget();
	}
	
}
